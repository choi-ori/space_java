package chapter02;

public class CharExample {
	public static void main(String[] args) {
		char c1='A';
		char c2=65;  //���� 65�� ���ڷ� ��ȯ�Ǿ A�� ��� (A�� �����ڵ�)
		char c3='\u0041';  //16������ 65�� ǥ�� -> A�� ���
		
		char c4='��';
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
