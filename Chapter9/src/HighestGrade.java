import java.util.ArrayList;
import java.util.Scanner;

public class HighestGrade {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		Integer element, element2;
		final int MAX = 5;
		int[] numArray = new int[MAX];
		Scanner input = new Scanner(System.in);
		
		
		for(int i = 0; i< numArray.length; i++){
			System.out.println("enter a grade between 0-100:  ");
			int grade = input.nextInt();
			numArray[i] = grade; 
			nums.add(new Integer(i));
			nums.add(new Integer(i));
		}
		//nums.add(new Integer(5));
		//nums.add(new Integer(3));

		element = nums.get(0);
		element2 = nums.get(1);
		if(element.compareTo(element2)==0) {
			System.out.println("the elements have the same value");
		} else if ( element.compareTo(element2) < 0) {
			System.out.println("element1 is less than element2");
		}else
		{
			System.out.println("element is greater than 2");
		}
		
	
	}
}
