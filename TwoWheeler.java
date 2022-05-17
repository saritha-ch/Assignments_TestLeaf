package week1.day1;

public class TwoWheeler {
         
	      int noOfWheels = 2;
	      short noOfMirrrors = 1;
	      long chasisNumber = 234567892345l;
	      boolean isPunctured = false;
	      String bikeName = "HondaActiva";
	      double runningKm = 60.5;
	    		  
	      	public static void main(String[] args) {
	      		 
	      		TwoWheeler twowheeler = new TwoWheeler();
	      		System.out.println("No of Wheels " + twowheeler.noOfWheels);
	      		System.out.println("No of mirrors  " + twowheeler.noOfMirrrors);
	      		System.out.println("Chasisnumber is " + twowheeler.chasisNumber);
	      		System.out.println("bike is punctured " + twowheeler.isPunctured);
	      		System.out.println("Bike Name " + twowheeler.bikeName);
	      		System.out.println("Running distance " + twowheeler.runningKm);
		}

}
