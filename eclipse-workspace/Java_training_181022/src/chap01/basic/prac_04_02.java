package chap01.basic;

import java.util.Scanner;

public class prac_04_02 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);    
	System.out.print("Enter your number :  \n");  
	int height= sc.nextInt(); 
	 sc.close();
	 String shape 	= "";
	 String record 	= "";

	 for (int i = 1; i <= height; i++) {
		 if(i==1 || i==height) {
			 record = ("*").repeat(height);
		 }
		 else {
		 record = ("-").repeat(height);
	     record = record.substring(i, height )+"*"+record.substring(0, i-1) ;
		 }
	 	shape += record + "\n";
	 }
	System.out.print (shape);
}
}

