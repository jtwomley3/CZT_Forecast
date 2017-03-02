package main;

public class Dog {
	
	int size;
	String Breed;
	String Name;
	
	void bark(){
		System.out.println("Bark Bark!");
	}

	int getSize(){
		return size;
	}
	
	public String getBreed(){
		return Breed;
	}
	
	public String getName(){
		return Name;
	}
	
	public void setSize(int size){
		this.size = size;
	}
	
	public void setBreed(String Breed){
		this.Breed = Breed;
	}
	
	public void setName(String Name){
		this.Name = Name;
	}
}

//this line does nothing