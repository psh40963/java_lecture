package g_oop2;

public class SampleParent {
	/*
	 * 상속
	 * - 기존의 클래스를 물려받아 새로운 클래스를 만드는 것이다.
	 * - 자식클래스명 extends 부모클래스명 {}
	 * - 부모 클래스의 생성자와 초기화블럭을 제외한 모든 멤버를 물려받는다.
	 * - 하나의 클래스만 상속받을 수 있다.
	 * - 상속받지 않는 모든 클래스는 Object 클래스를 상속받는다.
	 * - 자식 클래스는 부모 클래스의 멤버 외의 새로운 멤버를 가질 수 있으므로 
	 * 	자식 클래스는 부모 클래스보다 크거나 같다.
	 * - 두개 이상의 클래스를 만드는데 공통된 멤버가 있는 경우 부모클래스로 만든다.
	 */
	
	String var;
	{
		var = "초기화 블럭은 물려주지 않는다.";
	}
	
	SampleParent(){
		var = "생성자도 물려주지 않는다.";
	}
	
	int method(int a, int b){
		return a+b;
	}
	
	public static void main(String[] args) {
		SampleChild sc = new SampleChild();
		SampleParent sp = new SampleChild();
		//SampleChild2
		//sp = new SampleChild2();
		//SampleChild3
		//sp = new SampleChild3();
		//부모 타입의 변수로 자식 타입의 객체를 사용하는 것이 다형성이다.
		
		// 부모와 자식 간에는 서로 형변환이 가능하다.
		sc = (SampleChild)sp;
		sp = (SampleParent)sc;
		// 자식타입 -> 부모타입의 형변환은 생략될 수 있다.
		
		SampleChild sc2 = (SampleChild)new SampleParent();
		// SampleParent는 2개의 멤버를 가지고 있다.
		// SampleChild는 5개의 멤버를 가지고 있다.
		// SampleChild 타입의 변수는 5개의 멤버를 사용할 수 있어야 하는데
		// SampleParent 객체는 2개의 멤버만 가지고 있다.
		// 그러므로 부모타입의 객체를 자식 타입으로 형 변환 하는 것은 에러를 발생시킨다.
		
		//SampleParent 타입의 변수로는
		//SampleChild 객체를 가지고도 2개의 멤버만 사용할 수 있다.
		sp = sc;
		
		
	}

}
