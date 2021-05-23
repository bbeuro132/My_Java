
public class Method01 {

	public static void main(String[] args) {
		//void 존재하면 실행 후 종료
		//1. void method1() : 매개변수 X
		//2. void method2(매개변수, ...) : 매개변수 O, 여러개가 존재 가능
		
		//3. 타입 method3() : 반드시 타입과 일치하는 return 값이 존재해야함
		//4. 타입 method4(매개변수, ...) : return 필요, 매개변수 O
		
		//5. 재귀함수
		
		method1();
		//↑메소드 호출
	}
	
	//메소드의 정의↓
	public static void method1() {
		for (int i = 0; i < 5; i++) {
			System.out.println("method1 호출");
		}
	}
	
	public static void showName() {
		String name = "홍길동";
		System.out.println(name);
	}
	
	//메소드 오버로딩(중복 정의)
	//1. 매개변수 타입이 다름,
	//2. 매개변수 개수가 다름
	public static void showName(String name) {
		System.out.println(name);
	}
	
	public static void showName(String name, int age) {
		
	}

}
