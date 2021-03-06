package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		/*
		 * 산술연산자
		 * - 사칙연산 : +, -, *, /, %(나머지)
		 * - 복합연산자 : +=, -=, *=, /=, %=
		 * - 증감연산자 : ++, --
		 */
		
		int result=0;
//		 result = 10 + 20 - 30 * 40 / 50 % 60;
//		// 곱하기와 나누기가 더하기 빼기보다 우선 순위가 높다.
//		System.out.println("10 + 20 - 30 * 40 / 50 % 60 = "+result);
//		
//		// 나머지 연산
//		result = 10/3;
//		System.out.println("10/3 = "+result); // result의 자료형이 int기 때문에 3.333으로 나오지 않고 정수만 표현 된다.
//		result = 10%3;
//		System.out.println("10%3 = "+result);
		
		// 5개의 산술연산자를 사용해 5개의 연산을 수행 후 출력 해 주세요.
//		result = 10 + 3;
//		System.out.println("10+3 = "+result);
//		result = 10 - 3;
//		System.out.println("10-3 = "+result);
//		result = 10 * 3;
//		System.out.println("10*3 = "+result);
//		result = 10 / 3;
//		System.out.println("10/3 = "+result);
//		result = 10 % 3;
//		System.out.println("10%3 = "+result);
		
		//복합연산자
		//변수에 저장되어 있는 값에 연산을 수행 할 때 수행할 연산자와 대입 연산자를 결합해 사용 할 수 있다.
//		result = result + 3;
//		System.out.println(result);
//		result += 3;
//		System.out.println("+=3 "+result);
//		result -= 5;
//		System.out.println("-=5 "+result);
//		result *= 2;
//		System.out.println("*=2 "+result);
		
		//아래의 문장을 복합연산자를 사용한 문장으로 만들어주세요.
		// result = result + 10;
		// result = result -2 *3;
		// result = result %5;
//		
//		result += 10;
//		System.out.println(result);
//		result -=2*3;
//		System.out.println(result);
//		result %= 5;
//		System.out.println(result);
//		
		// 증감연산자
		// 증감 연산자(++) : 변수의 값을 1 증가시킨다.
		// 감소 연산자(--) : 변수의 값을 1 감소시킨다.
		int i = 0;
		
//		++i; //전위형 : 변수의 값을 읽어오기 전에 1 증가된다.
//		System.out.println(i);
//		i++; //후위형 : 변수의 값을 읽어 온 후에 1 증가된다.
//		System.out.println(i);
		
//		i = 0;
//		System.out.println("++i = "+ ++i);
//		i = 0;
//		System.out.println("i++ = "+ i++);
//		
//		--i; 
//		i--;
//		
//		// 피 연산자의 타입이 서로 같아야만 연산이 가능하다.
		int _int = 10;
//		double _double = 3.14;
//		double result2 = _int + _double; //표현범위가 더 큰 타입으로 형변환된다.
//		System.out.println(result2);
//		
//		long _long = 100L;
//		_long = _int + _long;
//		_int = _int + (int)_long;
//		
//		
//		byte _byte = 5;
//		short _short = 10;
//		int result3 = _byte + _short; //int 보다 작은 타입은 int로 형 변환된다.
//		System.out.println(result3);
		
//		char _char = 'a';
//		char _char2 = 'b';
//		_int = _char + _char2;
//		System.out.println(_int);
//		
		// 오버플로우, 언더플로우
		// 표현 범위를 벗어나는 값을 표현 할 때 발생하는 현상
//		byte b= 127;
//		b++;
//		System.out.println(b);
//		b--;
//		System.out.println(b);
		
		// data type 을 선택 할 때 연산의 범위를 고려해야 한다.
		
		// 다음을 한 줄 씩 계산해서 최종 결과값을 출력 해 주세요.
		// 1. 123456 + 654321
		// 2. 1번의 결과값 * 123465
		// 3. 2번의 결과값 / 123456
		// 4. 3번의 결과값 - 654321
		// 5. 4번의 결과값 % 123456
		
//		long l1;
//		l1 = 123456+654321;
//		System.out.println(l1);
//		l1 *= 123456;
//		System.out.println(l1);	
//		l1 /= 123456;
//		System.out.println(l1);
//		l1 -= 654321;
//		System.out.println(l1);
//		l1 %= 123456;
//		System.out.println(l1);
		
		// 3 개의 int 형 분수를 선언 및 초기화 후 합계와 평균을 구해주세요.
		int i1=1, i2=2, i3=4;
		int sum = i1 + i2 + i3;
		double average = sum/3.0;
		System.out.println("sum:"+sum+" average:"+average);
		
		// 반올림
		average = Math.round(100*average)/100.0;
		System.out.println(average);
		
		//랜덤
		int random = (int)(Math.random()*100) +1; // 0.0~0.99999 ...
		System.out.println(random);
		
	}

}
