package java_1007;

public class Main {

	public static void main(String[] args) {
		// User 클래스의 인스턴스 만들기
		User user1 = new User();
		user1.id = "what";
		user1.acccountNumber = "123";
		user1.balance = 3000;
		
		User user2 = new User();
		user2.id = "why";
		user2.acccountNumber = "456";
		user2.balance = 2500;
		
		//Class를 이용한 static 접근
		User.network = "bitcoin";
		//Instance를 이용한 접근
		user1.network = "etherium";
		
		System.out.println(user1.id);
		System.out.println(user2.id);
		
		//network는 static 속성이라서 공유
		System.out.println(User.network);
		System.out.println(user1.network);
		System.out.println(user2.network);
		
		//지역 변수 : 메서드 안에서 만든 변수
		//자동 초기화가 안되므로 데이터를 대입하지 않고 사용하는 것은 에러
		//int x;
		//System.out.println(x);
		
		User user3 = new User();
		System.out.println(user3.id);
		System.out.println(user3.balance);
		
		user3.balance = 100;
		final int readOnlyValue = user3.balance;
		//readOnlyValue = 200;
		
		
	}

}
