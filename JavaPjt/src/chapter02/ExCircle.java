package chapter02;

import java.util.Scanner;

public class ExCircle {
	public static void main(String[] args) {
		System.out.println("반지름을 입력하세요");
		Scanner scanner = new Scanner(System.in);
		
		int radius = scanner.nextInt();
		
		double circleArea = 3.14 * radius * radius;
		
		System.out.println("원의 면적은"+circleArea+"입니다.");
		
		scanner.close();
	}
}
