package week3day1;

public class OutputString {

	public static void main(String[] args) {
		        //String str3 = ("Kutty");
				//String str4 = ("Kutty");

				String str3 = new String("Kutty");
				String str4 = new String("Kutty");

				if (str3 == str4) {
					System.out.println(" Same text");
				} else
					System.out.println("Diff text");
				
				System.out.println("***");
			}
}
		
		//JUSTIFICATION OF OUTPUT
		/*
		 * Both new str3 and new str4 refer to different objects.
		 * Different objects has different memory locations.
		 * So,when we use the == operator for str3 and str4  then the result is Different text as both have the different  
		   memory locations. 
		   
		 * Using equals(),the result is same text because it’s only comparing the values given in both the objects str3 and str4.
		 */
