package chapter02;

import java.util.Scanner;

public class ExRectangle {
	public static void main(String[] args) {
		System.out.println("����, ���� ���̸� �Է��ϼ���");
		Scanner scanner = new Scanner(System.in);
		
		int width = scanner.nextInt();
		int height = scanner.nextInt();
		
		int rectangleArea = width * height;
		
		System.out.println("�簢���� ������ " + rectangleArea + " �Դϴ�.");
		
		scanner.close();
	}
}