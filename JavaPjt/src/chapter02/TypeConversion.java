package chapter02;

public class TypeConversion {
	public static void main(String[] args) {
		byte b=127;
		int i=100;
		
		System.out.println(b+i);
		System.out.println(10/4);
		System.out.println(10.0/4);
		System.out.println(2.9 + 1.8);
		System.out.println((int)2.9 + 1.8);  //2.9?? 2?? ??????
		System.out.println((int)(2.9 + 1.8));  //4.7?? 4?? ??????
		System.out.println((int)2.9 + (int)1.8);  //2+1?? ??????
	}
}
