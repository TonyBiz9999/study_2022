package chap01.basic;

import java.util.Scanner;

public class prac_04_03 {
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
		 else if (i==(height/2+1)){
			 record = ("-").repeat(height);
			 record = record.substring(0, i-1) +"*"+record.substring(i, height );
		 }
		 else {
			 record = ("-").repeat(height);
			
			 if (i<=height/2) {
				 record = record.substring(0, i-1) +"*"+record.substring(i,height-i)+"*"+record.substring(height-i, height-1);
			 }
			 else {
				 record = record.substring(0,height-i) +"*"+record.substring(height-i,i-2)+"*"+record.substring( i-1, height-1);
			 }
		 }
	 	shape += record + "\n";
	 }
	System.out.print (shape);
}
}
