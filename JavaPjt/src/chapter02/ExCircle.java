package chapter02;

import java.util.Scanner;

public class ExCircle {
	public static void main(String[] args) {
		System.out.println("�������� �Է��ϼ���");
		Scanner scanner = new Scanner(System.in);
		
		int radius = scanner.nextInt();
		
		double circleArea = 3.14 * radius * radius;
		
		System.out.println("���� ������"+circleArea+"�Դϴ�.");
		
		scanner.close();
	}
}
