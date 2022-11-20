package chap01.basic;

import java.util.Scanner;

public class prac_02_01 {
	
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);    
	System.out.print("Enter your number :  \n");  
	int number= sc.nextInt(); 
	 sc.close();
	int numDigits = String.valueOf(number).length();
	System.out.println("number digit is : "+numDigits);
	int numDigits2 = (number + " ").length();
	System.out.println("number digit is : "+(numDigits2-1));
}
}
