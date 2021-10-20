/**
 * 
 */
package com.l7.training.alienSystem;

/**
 * @author atul.jalal
 *
 */
public class AlienNumberSystem {

	/**
	 * @param args
	 */
	public String numberConverter(String number, int baseSystem,int alienBaseSystem) {
		
		return Integer.toString( Integer.parseInt(number, baseSystem), alienBaseSystem);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String numberToConvert = "10";
     int baseSystem = 10;
     int alienBaseSystem = 3;
     AlienNumberSystem  alienObj = new AlienNumberSystem();
     String convertedNumber = alienObj.numberConverter(numberToConvert, baseSystem,alienBaseSystem);
	 System.out.println("Alien Number is :");
	   System.out.println(convertedNumber);
     for(int index = 0 ; index < convertedNumber.length();index++) {
    	 switch(convertedNumber.charAt(index)) {
    	 
    	 case '0' : System.out.print("0");
    	            break;
    	 case '1' : System.out.print("F");
    	            break;
    	 case '2' : System.out.print("8");
    	            break;
    	 }
     }
	}
  
}
