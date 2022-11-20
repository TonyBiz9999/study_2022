package chap01.basic;

public class prac_04_03_02 {
public static void main(String[] args) {
	String strTest = "0123456";    //     0 i                                           i+1 , h -i -1                       h -i h
	String strTest1 = strTest.substring(0,2)+"*"+strTest.substring(3,4)+"*"+strTest.substring(5,7); // i=2
	System.out.println(strTest);
	System.out.println(strTest1);
	
}
}
