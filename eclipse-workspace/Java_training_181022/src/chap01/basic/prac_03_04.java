package chap01.basic;
//print : 
//* * * * *
//  * * * *
//     * * *
//        * *
//           *
import java.util.Scanner;

public class prac_03_04 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);    
	System.out.print("Enter your number :  \n");  
	int height= sc.nextInt(); 
	 sc.close();
	 String shape 	= "";
	 String record 	= "";

	 for (int i = 1; i <= height; i++) {
	     String left =(" ").repeat(i-1);
	     String number = "*".repeat(height - i+1);

	 	record = left + number;
	 	shape += record + "\n";
	 }
	 System.out.println(shape);
}

}
