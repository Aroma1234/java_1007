package java_1007;

public class Main2 {

	public static void main(String[] args) {
		// 현재 시간 출력
		long now = System.currentTimeMillis();
		System.out.println(now);

		//0.0에서 1.0 사이의 난수를 생성해주는 함수
		double su = Math.random();
		System.out.println(su);

		//3.4와 2.7 중에서
		double r = Math.min(3.4, 2.7);
		System.out.println(r);

		//문자열 인스턴스 생성 : String 이름 = "내용";

		//한국어의 길이를 출력
		String str = "한국어";
		int len = str.length();
		//"Hijava"를 대문자로 출력
		String eng = "HiJava";
		String.upp = eng.toUpperCase();
		System.out.println(upp);

		//"HelloJava"에 Java의 포함여부를 출력
		String t = "Hello Java";
		int result = t.indexOf("Java");
		System.out.println(result);
		if(result >=0) {
			System.out.println("있음");
		}else {
			System.out.println("없음");
		}
	}

}


