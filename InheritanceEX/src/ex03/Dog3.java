package ex03;

public class Dog3 extends Animal3 {
	String breed;
	
	Dog3(String name,int age,String breed) {
		
		this.breed = breed;
	}
	
	show Dog() {
		
		System.out.println("품종"+breed);	
	}
}
