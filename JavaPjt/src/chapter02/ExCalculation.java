package chapter02;

import java.util.Scanner;

public class ExCalculation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("2���� �Ǽ� �Է�");
		
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		
		System.out.println("�� ���� ������" + (a+b));
		System.out.println("�� ���� ������" + (a-b));
		System.out.println("�� ���� ������" + (a*b));
		System.out.println("�� ���� ��������" + (a/b));
		
		scanner.close();
	}
}
