package classNotesWeek03;
public class Array {
  public static void main(String[] args) {
    // Declare and initialize an array that stores the first name 
	// of everyone in your group
	String[] firstNames = new String[3];
	  firstNames[0] = "Dana";
	  firstNames[1] = "Trevon";
	  firstNames[2] = "Russ";
    
    // Declare and initialize an array that stores the numeric birth month 
	// (1 = January, 2 = February, ...) of everyone in your group. Use the
    // same order for the months as the order for the name that was entered.
	// The first birth month should be the birth month of the first person.
	
	  int[] birthMonth = new int[3];
	  birthMonth[0] = 5;
	  birthMonth[1] = 5;
	  birthMonth[2] = 10;
	  
	
    // Declare and initialize an array that stores all of the months 
	// (January, February, ...) of the year.
	
	 String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "Septmeber", "November", "December" };
	 System.out.println(months[0]);

	// Extra: Using a looping structure of your choice, output each person's 
	//        name along with their birth month displayed as the name 
	//        (i.e.  January).
	//* For example: Ava was born in December.
	//              John was born in February.
	for(int i = 0; i < firstNames.length; i++) {
	  System.out.println(firstNames[i] + " was born in " + months[birthMonth[i]-1]);
	}

	// Challenge: Without modifying your original array declaration, add my name 
	//            to the list of names you previously defined. I was born in November.
	//            Do not manually enter your names again in your code.
	
  }
}
