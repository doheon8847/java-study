package javastart;
class Circle {
	int radius;
	public double getArea() { //메서드
		return 3.14*radius*radius;
	}
	public Circle(int radius) { //생성자
		this.radius = radius;
	}
}



public class Array1 {

	public static void main(String[] args) {//실행
		Circle[] c; 
		c = new Circle[5]; //5개의 방
		//Circle [] c = new Circle[5];
		
		for(int i=0;i<c.length;i++) {
			c[i] = new Circle(i);
		}
		
		for(int j=0;j<c.length;j++) {
			System.out.println(c[j].getArea());
		}
		

		
		
	}
	
	
	
}
