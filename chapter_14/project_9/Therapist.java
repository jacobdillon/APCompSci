/* Case Study 14.2: Therapist.java
1) This class emulates a nondirective psychotherapist.
2) The major method, reply, accepts user statements and generates
   a nondirective reply.
*/

import java.util.*;

public class Therapist {
	/* Instance Variables */
	private Set<String> hedgeSet;                 // The set of hedges
	private Set<String> qualifierSet;            // The set of qualifiers
	private Map<String, String> replacementMap; // The map of replacement words
	private List<String> historyList;

	/* Contructor */
	public Therapist() {
		hedgeSet = new HashSet<String>();
		hedgeSet.add("Please tell me more");
		hedgeSet.add("Many of my patients tell me the same thing");
		hedgeSet.add("It is getting late, maybe we had better quit");
		qualifierSet = new HashSet<String>();
		qualifierSet.add("Why do you say that ");
		qualifierSet.add("You seem to think that ");
		qualifierSet.add("So, you are concerned that ");
		replacementMap = new HashMap<String, String>();
		replacementMap.put("i", "you");
		replacementMap.put("me", "you");
		replacementMap.put("my", "your");
		replacementMap.put("am", "are");
		historyList = new ArrayList<String>();
	}

	public String reply(String patientString) {
		// Replies to the patient's statement with either a hedge or
		// a string consisting of a qualifier concatenated to
		// a transformed version of the patient's statement.
		//  Preconditions  -- none
		//  Postconditions -- returns a reply
		String reply = ""; // The therapist's reply
		int choice = randomInt(1, 4); // Generate a random number between 1 and 3

		// If the patient says nothing, then encourage him.
		if(patientString.trim().equals(""))
			return "Take your time. Some things are difficult to talk about.";

		// Add what the patient said to the history
		historyList.add(patientString);

		// Else reply with a hedge or a qualified response
		if(choice == 1) // Hedge 1/4 of the time
			reply = hedge(hedgeSet);
		else if(choice == 2 || choice == 3) // Build a qualified response 2/4 of the time
			reply = qualifier(qualifierSet) + changePerson(patientString);
		else if(choice == 4 || historyList.size() > 3) // Use the history thing 1/4 of the time
			reply = history(historyList);
		else // Just do hedge because why not
			reply = hedge(hedgeSet);

		return reply;
	}

	private String hedge(Set<String> hedgeSet) {
		// Selects a hedge at random
		//  Preconditions -- the hedge set has been initialized
		//  Postconditions -- returns a randomly selected hedge
		return selectRandom(hedgeSet);
	}

	private String qualifier(Set<String> qualifierSet) {
		// Selects a qualifier at random
		//  Preconditions  -- the qualifier set has been initialized
		//  Postconditions -- returns a randomly selected qualifier
		return selectRandom(qualifierSet);
	}

	private String history(List<String> historyList) {
		// Selects a previous statement by patient from history and reverses it
		//  Preconditions  -- The history list has been initialized
		//  Postconditions -- returns a randomly selected statement from history
		return changePerson(selectRandom(historyList));
	}

	private String changePerson(String str) {
		// Returns a string created by swapping i, me, etc. for you, your, etc.
		// in the string str
		//  Preconditions  -- none
		//  Postconditions -- returns the created string
		// Tokenize str
		Scanner tokens = new Scanner(str);
		String result = ""; // Create a response string

		// Build the response from replacements of the tokens
		while(tokens.hasNext()) {
			String keyWord = tokens.next();
			String replacement = findReplacement(keyWord);
			result = result + replacement + " ";
		}

		return result;
	}

	private String findReplacement(String keyWord) {
		// Returns the value associated with the keyword or the keyword itself
		// if the keyword is not in the map.
		//  Preconditions  -- the replacement map has been initialized
		//  Postconditions -- returns the replacement
		keyWord = keyWord.toLowerCase();
		if(replacementMap.containsKey(keyWord))
			return (String) replacementMap.get(keyWord);
		else
			return keyWord;
	}

	private String selectRandom(Set<String> set) {
		// Selects an entry at random from the set
		//  Preconditions  -- the set is not empty
		//  Postconditions -- returns the random entry
		int index = randomInt(0, set.size() - 1);
		Iterator<String> iter = set.iterator();
		for(int i = 0; i < index; i++) iter.next();
		return iter.next();
	}

	private String selectRandom(List<String> list) {
		// Selects an entry at random from the list
		//  Preconditions  -- the list is not empty
		//  Postconditions -- returns the random entry
		int index = randomInt(0, list.size() - 1);
		Iterator<String> iter = list.iterator();
		for(int i = 0; i < index; i++) iter.next();
		return iter.next();
	}

	private int randomInt(int low, int high) {
		// Generate a random number between low and high
		//  Preconditions  -- low <= high
		//  Postconditions -- returns the random number
		return (int) (low + Math.random() * (high - low  + 1));
	}
}
