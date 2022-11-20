package chap01.basic;

import java.util.Scanner;

public class prac_02_03_01 {
public static void main(String[] args) {
	int num1;
    int num2;


    Scanner input = new Scanner(System.in);

    System.out.println("please enter the first number");
    num1 = input.nextInt();

    System.out.println("please enter the second number");
    num2 = input.nextInt();


        System.out.println("Please enter operation");
    char operation = input.next().charAt(0);
    input.close();

    if ( '+' == operation);{
        System.out.println("your answer is " + (num1 + num2));
//    }else if  ('-' == operation ); {
//        System.out.println("your answer is " + (num1 - num2));
//    }else if (operation == '/');{
//        System.out.println("your answer is " + (num1 / num2));
//    }
//    else if (operation == '*'){
//        System.out.println("your answer is " + (num1 * num2));
//    }
//    else{
        System.out.println("invalue operator " );
    }
}
}
