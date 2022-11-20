package chap01.basic;

public class p03_data_type {
	public static void main(String[] args) {
		int  var1 = 1;
		double  var2 = 1.23;
		int  var3 = var1 + (int) var2; //  thu hẹp narowing
		double  var4 = var1 + var2;// nới rông widening
		System.out.println(var3);
		System.out.println(var4);
	}
}
