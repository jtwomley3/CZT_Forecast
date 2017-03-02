package main;

public class DogTester {
	
	public static void main (String[] args){
		Dog d = new Dog();
		int dogSize;
		String dogName;
		String dogBreed;
				
		
		d.size = 45;
		d.Breed = "Daschund";
		d.Name = "Rover";
		
		
		d.bark();
		
		dogSize = d.getSize();
		dogName = d.getName();
		dogBreed = d.getBreed();
		
		System.out.println("The dog's Size is " + dogSize);
		System.out.println("The dog's name is " + dogName);
		System.out.println("Who knows the dog's breed?  It's a " + dogBreed);
	}

}
