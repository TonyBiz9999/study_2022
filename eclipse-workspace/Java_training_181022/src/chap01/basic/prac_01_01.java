package chap01.basic;

public class prac_01_01 {
	public static void main(String[] args) {
		int numberOne		= 285;
		int numberTwo		= 1225;
		int numberThree	= 185;	
		int numberFour		= 325;
		int tempNum1 	= Math.max(numberOne, numberTwo);
		int tempNum2 	= Math.max(numberThree, numberFour);
		int maxNum = Math.max(tempNum1, tempNum2);
		System.out.println("Max number is : " + maxNum);
		
	}
}
