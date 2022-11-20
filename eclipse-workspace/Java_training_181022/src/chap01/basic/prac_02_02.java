package chap01.basic;
import java.util.Scanner;
public class prac_02_02 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);    
	System.out.print("Enter your number :  \n");  
	int height= sc.nextInt(); 
	 sc.close();
	String shape = "";

	for(int i = 1; i<= height; i++){
	    String record = "+".repeat(i); 
	    shape += i+record  + "\n";
	}
		System.out.println (shape);
	}
	
}

