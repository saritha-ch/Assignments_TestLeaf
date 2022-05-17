package week1.day1;

public class FibonacciSeries {

	          // int range = 8;
	           
	public static void main(String[] args) {
		
		//int range = 8;
		int firstNum = 0;
		int secNum = 1;
		System.out.println(firstNum);
		System.out.println(secNum);

		for(int range=0; range <= 8; range++) {
			

			       int sum = firstNum + secNum;
			       firstNum = secNum;
			       secNum = sum;
			       System.out.println(sum);
		}
		
		

	}

}
