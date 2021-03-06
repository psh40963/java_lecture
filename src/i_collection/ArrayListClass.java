package i_collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListClass {
	public static void main(String[] args) {
		/*
		 * boolean add(Object obj) : 마지막 위치에 객체를 추가 후 성공 여부를 반환한다.
		 * void add(int index, Object obj) : 지정된 위치에 객체를 추가한다.
		 * Object set(int index, Object obj) : 지정된 위치에 객체를 저장 후 기존 객체를 반환한다.
		 * Object get(int index) : 저장된 위치의 객체를 반환한다
		 * int size() : 저장된 객체의 수를 반환한다.
		 * boolean remove(int index) : 지정된 위치의 객체를 제거한다.
		 */

		ArrayList sample = new ArrayList();

		sample.add("abc");
		sample.add(100);
		sample.add(false);
		System.out.println(sample);


		// 제네릭을 지정하지 않으면 넣을때는 편하나 꺼낼때는 타입을 예측하기 힘들다.
		// 따라서 제네릭의 사용이 권장된다
		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		//		list.add("String");
		list.add(20);
		System.out.println(list.add(30));

		System.out.println(list);

		list.add(1,40);
		System.out.println(list);


		System.out.println(list.set(2, 50));
		System.out.println(list);

		Integer integer = list.get(2);
		System.out.println(integer);

		for( int i=list.size()-1; 0<=i; i--){
			System.out.println(i + " : " + list.get(i));
			list.remove(i);
		}


		/*
		 * Wrapper 클래스 : 기본형 타입을 객체로 사용해야 할 때 대신 사용하는 클래스
		 * - boolean : Boolean
		 * - char : Character 
		 * - byte : Byte
		 * - short : Short
		 * - int : Integer
		 * - long : Long
		 * - float : Float
		 * - double : Double
		 */

		ArrayList<Integer> li = new ArrayList<>();

		li.add(new Integer(10));
		li.add(10); // 오토박싱 : 기본형 타입이 wrapper 클래스로 자동 변환

		Integer _integer = li.get(0);
		int ii = li.get(0); //  언박싱 : wrapper 클래스가 기본형타입으로 자동 변환

		System.out.println(list);
		// list에 1~ 100 사이의 랜덤 값을 10개 저장해주세요.

		int sum = 0;
		final int SIZE=10;
		int max=0, min=100;
		for(int i=0; i<SIZE; i++){
			list.add(i,(int)(Math.random()*100)+1);
			sum += list.get(i);
			if(max < list.get(i))
				max = list.get(i);
			if(list.get(i) < min)
				min = list.get(i);
		}

		System.out.println(list);
		System.out.println("합계 : " + sum+" 평균 : "+sum/(double)list.size()+ " 최대 : "+max+" 최소 : "+min);
		//list에 저장된 값의 합계와 평균을 구해주세요


		//[[정렬 ]]

		for(int i=1; i<list.size(); i++){
			int temp = list.get(i);
			int j;
			for(j=i-1; j>=0; j--){
				if(temp<list.get(j))
					list.set(j+1,list.get(j));
				else break;
			}
			list.set(j+1,temp);
		}
		System.out.println(list);
		
		// 2차원
		
		ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
		
		ArrayList<Integer> _list = new ArrayList<>();
		_list.add(10);
		_list.add(20);
		_list.add(30);
		
		list2.add(_list);
		
		_list = new ArrayList<>();
		_list.add(40);
		_list.add(50);
		list2.add(_list);
		
		System.out.println(list2);
		
		for(int i=0; i<list2.size(); i++){
			ArrayList<Integer> tempList = list2.get(i);
			for(int j=0; j<tempList.size(); j++){
				System.out.println(tempList.get(j)+"\t");
			}
			System.out.println();
		}





	}

}
