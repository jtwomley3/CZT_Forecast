package main;

public class Loopy {

	public static void main(String[] args) {
		String word = ("Bottles");
		
		int numBottles = 99;
		
		while (numBottles > 0){
			System.out.println(numBottles + " " + word + " of beer on the wall,");
			System.out.println(numBottles + " " + word + " of beer.");
			System.out.println("Take one down,");
			System.out.println("Pass it around,");
			
			numBottles = numBottles - 1;
			
			if (numBottles > 0){
				System.out.println(numBottles + " " + word + " of beer on the wall.");
				
			}
			else {
				System.out.println("No more bottles of beer on the wall!");
			}
		}
	}

}
