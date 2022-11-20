package chap01.basic;

import java.util.Scanner;

public class prac_03_02 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);    
	System.out.print("Enter your number :  \n");  
	int height= sc.nextInt(); 
	 sc.close();
	 String shape 	= "";
	 String record 	= "";

	 for (int i = 1; i <= height; i++) {
	     String left = "  ".repeat(height - i);
	     String number = (i+"").repeat(i);

	 	record = left + number;
	 	shape += record + "\n";
	 }
	System.out.println (shape);

}
}
