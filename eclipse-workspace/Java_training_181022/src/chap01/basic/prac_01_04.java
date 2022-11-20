package chap01.basic;
import java.util.*;
public class prac_01_04 {
public static void main(String[] args) {
	double percent	= 5;
	//System.in is a standard input stream  
	Scanner sc= new Scanner(System.in);    
	System.out.print("Enter total sales ($) :  \n");  
	int totalSales= sc.nextInt();  
	 sc.close();
	if(100<totalSales	&& totalSales<=300) {
		percent = 10;
	}
	else if(totalSales>300) {
		percent = 20;
	}
	
	System.out.println("Total profit commission = " +(totalSales	*percent/100) +"$");
}
}
