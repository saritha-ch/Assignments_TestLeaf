package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 1;
		int flag = 0;  
		if(num == 0 || num ==1) 
		{
			System.out.println(num + " is a Primeno");

		}
		else 

		{
			for(int i = 2;  i<num; i++)
			{
				if(num% i == 0)
				{
					System.out.println(num + "  is not a primeno");
					flag = 1;
					break;

				}
			}
			if(flag == 0)
			{
				System.out.println(num + " is a Primeno");
			}
		}
	}

}
