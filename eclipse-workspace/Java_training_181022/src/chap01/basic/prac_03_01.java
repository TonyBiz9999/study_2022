package chap01.basic;

import java.util.Scanner;

public class prac_03_01 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);    
	System.out.print("Enter your number :  \n");  
	int height= sc.nextInt(); 
	 sc.close();
	String shape = "";
	String record = null;
//	for(int i = 1; i<= height; i++){
//		int a=i % 2;
//		switch (a) {
//		case 1:
//			record = "-".repeat(i); 
//			break;
//		case 0:
//	        record = "+".repeat(i); 
//	       break;
//		}
//	    shape += i+record  + "\n";
		for (int i = 1; i <= height; i++) {
			String character = "-";

			if(i % 2 == 0) {
				character = "+";
			}
			record = i + character.repeat(i);
			shape += record + "\n";
	}
		System.out.println (shape);
	}

}
