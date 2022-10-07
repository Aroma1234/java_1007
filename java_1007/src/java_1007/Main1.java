package java_1007;

public class Main1 {

	public static void main(String[] args) {
		// Hello Java를 3번 출력하는 작업을 자주 수행
		
		//메서드 호출
		//MethodClass.threeJava();
		
		//static이 붙지 않은 메서드 호출
		//인스턴스를 생성한 후 인스턴스를 이용해서 호출
		MethodClass methodClass =
			new MethodClass();
		methodClass.threeJava();
		
		//매개변수가 정수 1개인 메서드를 호출
		methodClass.printDisp(6);
		
		//매개변수가 문자열과 정수인 메서드 호출
		//자바는 매개변수를 순서대로 대입
		methodClass.disp("안녕", 2);
		
		methodClass.returnMethod(true);
		
		//정수 2개를 받아서 더하는 메서드 호출
		methodClass.noReturn(10, 20);
		
		//10 + 20 + 30
		int r = methodClass.hasReturn(10, 20);
		r= methodClass.hasReturn(r, 30);
		System.out.println(r);
	}

}
