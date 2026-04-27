package exceptionex;

public class Exceptionex02 {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try {
			System.out.println("연산을 합니다.");
			int result = a/b;
			System.out.println("결과는 :" + result);
			
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
			System.out.println("메세지:"+e.getMessage());
		}
		System.out.println("프로그램 종료");
	}
}
