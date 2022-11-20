package chap01.basic;

import java.util.Scanner;

public class prac_04_05 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);    
	System.out.print("Enter your number :  \n");  
	int height= sc.nextInt(); 
	 sc.close();
	 String shape 	= "";
	 String blank="";
	 String middle="";
	
	 for (int i = 1; i <= height; i++) {
		 	if(i<=height/2+1) {
		 		middle = "*".repeat(i*2-1);
		 		blank= "-".repeat(height/2-i+1);
		 	}
		 	else {
		 		blank = "-".repeat(i- (height/2+1));  
		 		middle= "*".repeat(2*height-2*i+1);
		 	}		 
	 String record=blank+middle+blank;		 
	 shape += record + "\n";
	 }
	 System.out.print(shape);
}
	
}

