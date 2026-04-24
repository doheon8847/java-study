package AnimalTest;

public class ZooMain {
	public static void main(String[] args) {
		CatChild Mycat = new CatChild();
		
		Mycat.name = "야옹이";
		Mycat.age = 2;
		Mycat.color = "검정";
		Mycat.weight = 3;
		
		
		
		Mycat.info();
		Mycat.infoCat();
		Mycat.speak();
		
	}
}
