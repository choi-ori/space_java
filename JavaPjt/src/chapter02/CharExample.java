package chapter02;

public class CharExample {
	public static void main(String[] args) {
		char c1='A';
		char c2=65;  //숫자 65가 문자로 변환되어서 A로 출력 (A의 유니코드)
		char c3='\u0041';  //16진수로 65를 표현 -> A로 출력
		
		char c4='가';
		char c5=44032;
		char c6='\uac00';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
	}
}
