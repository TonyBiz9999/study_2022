package chap01.basic;

import java.util.Scanner;

public class prac_02_03 {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int num1 = input.nextInt();
    System.out.print("Enter an operator: ");
    char operator = input.next().charAt(0);
    System.out.print("Enter a second number: ");
    int num2 = input.nextInt();
    input.close();
   
    if (operator == '+' ) {
    	double result = num1+num2;
        System.out.println("result is " + result);
    } 
    else if ('-' == operator) {
        System.out.println("result is " + (num1 - num2));
    } 
    else if (operator == '*' || operator == 'x') {
        System.out.println("result is " + (num1 * num2));
    } 
    else if ('/' == operator|| operator == ':') {
    	double result = num1/num2;
        System.out.println("result is " + (result));
    }
    else {
        System.out.println("Your operator is not valid");
    }

  
}
}
