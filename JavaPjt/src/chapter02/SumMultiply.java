package chapter02;

import java.util.Scanner;

public class SumMultiply {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("2���� ���� �Է�>>");
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.println("�� ���� ���� " + (a+b));
		System.out.println("�� ���� ���� " + (a*b));
		
		scanner.close();
	}
}
