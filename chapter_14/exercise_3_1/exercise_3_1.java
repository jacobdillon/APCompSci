import java.util.List;
import java.util.ArrayList;

public class exercise_3_1 {
	public static int addList(List<Integer> list) {
		int total = 0;
		for(int value : list) total += value;
		return total;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(24);
		list.add(7);
		list.add(88);
		list.add(100);
		System.out.println("Total value of ints in ArrayList is " + addList(list));
	}
}
