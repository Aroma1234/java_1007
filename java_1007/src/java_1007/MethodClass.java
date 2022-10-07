package java_1007;

public class MethodClass {
	public static void threeJava() {
		for(int i=0; i<3; i=i+1) {
			System.out.println("Hello Java");
		}
	}

	//매개변수가 있는 메서드
	//정수 1개를 받아서 작업을 수행하는 메서드
	//이 메서드를 호출할 때는 반드시 정수 1개를 대입
	public void printDisp(int n) {
		for(int i=0; i<n; i=i+1) {
			System.out.println("Hello Java");
		}
	}

	public void disp(String str, int n) {
		for(int i=0; i<n; i=i+1) {
			System.out.println(str);
		}
	}
	//boolean 1개를 받아서 수행하는 메서드
	public void returnMethod(boolean b) {
		//b가 false이면 더 이상 작업을 수행하지 않고 종료
		if(b == false) {
			return;
		}

		System.out.println("수행");
	}

	//2개의 정수를 더하는 메서드
	//리턴하지 않고 출력하는 메서드
	public void noReturn(int a, int b) {
		int result = a + b;
		System.out.println(result);
	}

	public int hasReturn(int a, int b) {
		int result = a + b;
		//메서드가 데이터를 가지고 리턴할 때는 리턴하는 데이터의
		//자료형을 메서드 이름 앞에 기재해야 함
		return result;
	}
}



