import java.util.ArrayList;

public class Main{
	
    public static void main(String[] args) {
            LegoPerson bob = new LegoPerson("Bob", 28);
            LegoPerson cindy = new LegoPerson("Cindy", 10);
            LegoPerson jasper = new LegoPerson("Jasper", 33);
            LegoPerson saul = new LegoPerson("Saul", 65);

            ArrayList<LegoPerson> legos = new ArrayList<LegoPerson>();

            legos.add(bob);
            legos.add(cindy);
            legos.add(jasper);
            legos.add(saul);
            
            System.out.println();
            System.out.println();

	//  1. Write a method that will return a random lego object from the ArrayList. Call this method from the legoperson method to test it. 

		System.out.println();
		System.out.println();
		
    // 2. Write a method that will return a String with the names of all of the Lego Objects in legos, separated by a dash. For example: bob-cindy-jasper-saul 
		// note: no - at the end of the string! 

		System.out.println();
		System.out.println();
		// Copy the items from the ArrayList to a new LegoPerson array called myLegos[]



    // 3. Print the name of each Lego in myLegos to check to see if you are correct!

		System.out.println();
		System.out.println();

		

//4.  Test number 4 here.
		
		}
        //Write methods here
        // 4. Write a method that will remove the Lego objects from the Array that have an age that is an odd number. YOU MUST USE MODULO FOR THIS! Call this method in the main method. 


// 5. Write a method that will return a String that includes the middle 3 letters of everyone's name in the list. "The middle chars are: bcd, abe, b__, erp, "
// **** if their name is 1 or 2  characters long add "__" to fill in to make sure you have 3 chars.
// If the name is even  take the middle 2 characters and it doesn't matter which side the 3rd comes from. For example:
// "ABCDEF" ->  CDE or BCD is fine.

    public static String midChar(ArrayList<LegoPerson> list ){

      
      return "";//Fix after
    }

	}