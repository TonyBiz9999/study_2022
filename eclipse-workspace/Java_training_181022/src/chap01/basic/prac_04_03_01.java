package chap01.basic;
//* * * * *
//
//   *   *
//
//      *
//
//    *   *
//
//* * * * *   height = 5;
import java.util.Scanner;

public class prac_04_03_01 {
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
//				 0 12 *4 56 - 4
//				 0 1* 3* 56  - 3
//				 0 *2 34 *6  - 2
//				 record.substring(i, height -i-1)
//				 =======
		     record = record.substring(0, i-1) +"*=*"+record.substring(height-i, height);
			 }
		 	shape += record +"\n";
		 }
		 
		System.out.print (shape);
}		 
}
