package chapter02;

public class TernaryOperator {
	public static void main(String[] args) {
		int a=3,b=5;
		
		System.out.println("두 수의 차는 "+((a>b)?(a-b):(b-a)));
//		a가 b보다 크지 않으므로 (b-a)값으로 출력
	}
}
