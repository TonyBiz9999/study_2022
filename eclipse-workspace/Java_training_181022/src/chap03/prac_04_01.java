package chap03;
/*Enter your number :  
5
----1
22---
--333
4444-
55555
*/
import java.util.Scanner;

public class prac_04_01 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);    
	System.out.print("Enter your number :  \n");  
	int height= sc.nextInt(); 
	 sc.close();
//	 String shape 	= "";
//	 String record 	= "";
//
//	 for (int i = 1; i <= height; i++) {
//		 if(i%2==1) {
//	     String left = "-".repeat(height - i);
//	     String number = (i+"").repeat(i);
//
//	 		record = left + number;
//	 		shape += record + "\n";
//		 }
//		 else {
//			 String left =  (i+"").repeat(i);
//			 String number ="-".repeat(height - i);
//		     record = left + number;
//			 shape += record + "\n";
	 String record 	= "";
	 String shape 	= "";
	 for (int i = 1; i <= height; i++) {
	     String listCharacter = "-".repeat(height - i);
	     String number = (i+"").repeat(i);
	     if(i % 2 == 0) {
	         record = number + listCharacter;
	     }else{
	         record = listCharacter + number;
	     }
	     shape += record + "\n";
	 }
 
	 System.out.println(shape);
}
}

