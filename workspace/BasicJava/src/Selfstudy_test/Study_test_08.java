package Selfstudy_test;


public class Study_test_08 {
	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 2_000_000;
		long c = a*b; // int * int 는 int 가 반환되면서 overflow 발생. c is long type, however a*b already returned overflowed value
		System.out.println(c); 
		System.out.println((long)a*b);

		char char_A = 'A';
		System.out.println((char)(char_A+32));
		System.out.println("string".equalsIgnoreCase("StriNg"));
	}

}