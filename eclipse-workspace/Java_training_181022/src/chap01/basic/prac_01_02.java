package chap01.basic;

public class prac_01_02 {
public static void main(String[] args) {
	int number	= -9;
	String str1	= "dương";
	String str2	= "chẵn";
	
	if(number < 0) 	
		str1 = "âm";
	if(number %2 == -1 || number %2 == 1 ) 	str2 = "lẻ";
//	if(number %2 == 0) 	str2 = "chan";

	System.out.println("nguyên " + str1 + " " + str2);
}
}
