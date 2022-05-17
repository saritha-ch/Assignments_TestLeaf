package week1.day1;


public class Car {
            
	          public void applyBreak()
	          {
	        	 System.out.println("Apply the Break"); 
	          }
	          public void applyGear()
	          {
	        	  System.out.println("Apply Gear");
	          }
	          public void switchonAc()
	          {
	        	  System.out.println("Switch on Ac");
	          }
	          public void applyAcclerate()
	          {
	        	  System.out.println("Apply the Acclerate");
	          }
	          
	public static void main(String[] args) {
		
		       Car car = new Car();
		       car.applyBreak();
		       car.applyGear();
		       car.applyAcclerate();
		       car.switchonAc();
	}
	
}
