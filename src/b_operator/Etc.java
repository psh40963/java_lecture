package b_operator;

import java.util.Scanner;

public class Etc {

	public static void main(String[] args) {
		/*
		 * 비트연산자
		 * - |, &, ^, ~, <<, >>
		 * - 비트 단위로 연산한다.
		 * 
		 * 기타 연산자
		 * - .(참조연산자) : 특정 범위 내에 속해 있는 멤버를 지칭할 때 사용한다.
		 * - (type) : 형변환
		 * - ?:(삼항연산자) : 조건식? 조건식이 참 일 경우 수행할 문장 : 조건식이 거짓일 경우 수행 할 문장
		 */
		
//		System.out.println(10 | 15); // | : 둘다 0 인 경우 0 그외 1
//		// 10 : 00001010
//		// 15 : 00001111
//		
//		int x = 10;
//		int y = 20;
//		int result = x<y ? x:y;
//		System.out.println(result);
//		
//		// 주민등록 번호 뒷자리 첫번째 숫자가 1이면 남자 2면 여자
//		int regNo = 3;
//		String gender = regNo == 1? "남자" : "여자";
//		System.out.println("당신의 성별은 " + gender + "입니다.");
//		
//		gender = regNo == 1? "남자" : (regNo == 2 ? "여자" : "확인불가");
//		System.out.println("당신의 성별은 " + gender + "입니다.");
//		
		// 2개의 숫자를 입력 받고, 둘 중 더 큰 숫자를 출력해주세요.
//		int x,y;
		Scanner sc= new Scanner(System.in);
//		
//		System.out.print("첫번째 숫자를 입력 :");
//		x = Integer.parseInt(sc.nextLine());
//		System.out.print("두번째 숫자를 입력 :");
//		y = Integer.parseInt(sc.nextLine());
//		
//		System.out.println(x+"와 "+y+"중 더 큰 숫자는 "+(x>y? x:y)+"입니다" );
		
		// 숫자를 입력 받고, 그 숫자가 1 이나 3이면 남자를, 2나 4면 여자를 출력해주세요.
		// 그 외의 숫자를 입력하면 확인불가를 출력해주세요.
		while(true){
		System.out.print("주민등록 번호를 - 없이 입력하세요 :");
		long x = Long.parseLong(sc.nextLine());
		x = (x/1000000)%10;
		System.out.println("성별 식별번호는 "+x+" 이며 "+((x==1||x==3)?"남자":(x==2||x==4)?"여자":"확인 불가")+"입니다\n");
		}
	}

}
