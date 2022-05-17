package week1.day2;

public class ArmStrongNumber {

	public static void main(String[] args) {

		int input = 232;
				
		int  sum = 0;
		int output = input;
		while(input > 0)
		{
			int rem = input % 10;
			rem = rem * rem * rem ;
			sum = sum + rem;
			input = input / 10;

		}
		System.out.println(sum);
		if (sum == output)
		{
			System.out.println("Given no is Armstrongno");
		}
		else
		{
			System.out.println("No is not a armstrong no");
		}
	}

}
