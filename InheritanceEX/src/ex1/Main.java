package ex1;

public class Main {
	public static void main(String[] args) {
		Dog d =new Dog();
		
		System.out.println("똥개지원이 소개서");
		d.name="똥개지원이";
		d.age=19;
		d.color="무지개색";	
		
		System.out.println(d.name+","+d.age+","+d.color);

		
		d.eat();
		d.sleep();
		d.bark();
		d.run();
	}
	
	
	
}
