package chapter02;

public class FloatDoubleExample {
	public static void main(String[] args) {	
//		float var1=3.14;  //기본타입이 Double이라 오류 발생
		float var1=3.14f;
		double var2=3.14;
		
		float var3=0.1234567890123456789012345678901234567890f;
		float var4=0.98765432109876543210f;
		
		double var5=0.1234567890123456789012345678901234567890;
		double var6=0.98765432109876543210;
		
		double var7=3e6;
		float var8=3e6F;
		double var9=2e-3;
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		System.out.println("var8: " + var8);
		System.out.println("var9: " + var9);
	}
}
