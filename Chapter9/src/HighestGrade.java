import java.util.ArrayList;
import java.util.Scanner;

public class HighestGrade {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		Integer element, element2;
		final int MAX = 5;
		int[] numArray = new int[MAX];
		Scanner input = new Scanner(System.in);
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < numArray.length; i++) {
			System.out.println("enter a grade between 0-100:  ");
			int grade = input.nextInt();
			if (max < grade) {
				max = grade;
				System.out.println(max);
				nums.add(max);
			}
			nums.add(new Integer(1));

		}

		element = nums.get(0);
		element2 = nums.get(1);
		if (element.compareTo(element2) == 0) {
			System.out.println("the elements have the same value");
			System.out.println(element2);
			System.out.println(element);
		} else if (element.compareTo(element2) < 0) {
			System.out.println("element1 is less than element2");
			System.out.println(element2);
			System.out.println(element);
		} else {
			System.out.println("the highest grade is: ");
			System.out.println(element);
		}

	}
}
