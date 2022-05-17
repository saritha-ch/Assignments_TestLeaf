package week1.day2;

public class Calculator {

	public int add(int num1,int num2)
	{ 
		int sum = num1 + num2;
		return sum;

	}
	public double sub(double num1,double num2)
	{ 
		double sub = num1 - num2;
		return sub;
	}
	public double multiply(double num1,double num2)
	{ 
		double mult = num1 * num2;
		return mult;
	}
	public int division(int num1,int num2)
	{ 
		int div = num1 / num2;
		return div;
	}
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println(calc.add(5, 5));
		System.out.println(calc.sub(12.5,10));
		System.out.println(calc.multiply(5, 4));
		System.out.println(calc.division(25, 5));

	}

}
