package chapter02;

public class IntegerLiteralExample {
	public static void main(String[] args) {
		int var1=0b1011;      //2��3��*1 + 2��1��*1 + 2��0��*1 = 8+2+1
		int var2=0206;        //8��2��*2 + 8��0��*6 = 134
		int var3=365;         //10����
		int var4=0xB3;        //16��1��*11 + 16��0��*3 = 179
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
	}
}
