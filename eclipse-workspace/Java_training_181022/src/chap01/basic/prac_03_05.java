package chap01.basic;
import java.util.Scanner;

//1
//12
//123
//1234
//12345
public class prac_03_05 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);    
	System.out.print("Enter your number :  \n");  
	int height= sc.nextInt(); 
	 sc.close();

	 String left = "" ;
	 String right = "";
	 for (int i = 1; i <= height; i++) {
		 for(int j=1; j<=i; j++) {
	     left =(j+"" );
	     System.out.print(left);
	     }
		 right =  " ".repeat(height - i);
		 System.out.println(right);

}

}
}