package main;

public class DogTester {
	
	public static void main (String[] args){
		Dog d = new Dog();
		int dogSize;
		
		d.size = 45;
		
		d.bark();
		
		dogSize = d.getSize();
		
		System.out.println("The dog's Size is " + dogSize);
	}

}
