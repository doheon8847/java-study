package test;

public class DogEX extends AnimalEx	{
	String breed;
	
	DogEX(String name,int age,String breed) {
		super(name,age);
		this.breed =breed;
		
	}
	
	void showDog() {
		show();
		System.out.println("품종: "+breed);
	}
}
