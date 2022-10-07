package java_1007;

public class User {
	//static 속성
	public static String network;
	
	//유저의 아이디, 계좌번호, 잔액을 각각의 유저가 소유하도록 선언
	//인스턴스 속성으로 생성
	public String id;
	public String acccountNumber;
	public int balance;
	
	//이 클래스가 처음 사용될 때 한 번 수행
	static {
		System.out.println("처음에 한 번 수행");
	}
	//일반 초기화 : 인스턴스 생성 시 호출
	//new를 만나면 인스턴스가 생성됨
	//생성자를 이용해서 작업하는 것이 일반적
	{
		System.out.println("인스턴스 생성할 때 수행");
	}
	
	//값을 변경하지 못하는 읽기 전용 속성을 생성
	//실제 프로그램에서는 옵션을 설정하거나 보여주기 위한 변수로 사용
	//public final String CONTRACTNAME;
	


}
