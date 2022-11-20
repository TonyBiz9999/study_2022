package chap01.basic;

public class p031_operator {
	public static void main(String[] args) {
//		int num1=2;
//		int num2=100;
////		Toán tử số học : + - * /
//		int num3= (num1+num2);
//		System.out.println(num3);
//		int num4= (num2-num1);
//		System.out.println(num4);
//		int num5= (num1*num2);
//		System.out.println(num5);
//		int num6= (num2/num1);
//		System.out.println(num6);
////	Toán tử gán += -= *= /= 	
//		num1 +=10;
//		System.out.println(num1);
//		num2 -=10;
//		System.out.println(num2);
//		num2 *=10;
//		System.out.println(num2);
//		num2 /=10;
//		System.out.println(num2);
////	Toán tử ++ --
//		int numberStar = 20;
//		int numberEnd = 0;
////		numberStar ++ trả về giá trị numberStar, sau đó giá trị numberStar tăng 1 đơn vị
////		numberEnd = numberStar++;  
////		numberStar -- trả về giá trị numberStar, sau đó giá trị numberStar giảm 1 đơn vị		
////		numberEnd = numberStar --;  
////		++ numberStar tăng 1 đơn vị	sau đó sẽ gán vào numberStar	
////		numberEnd = ++numberStar;  
////		--  numberStar giảm 1 đơn vị sau đó sẽ gán vào numberStar		
//		numberEnd = -- numberStar ;  
//		System.out.println("numberStar = " + numberStar);
//		System.out.println("numberEnd = " + numberEnd );
//		int numberOne	=	20;
//		int numberTwo	= 10;
//		boolean result;
//		result 	=	numberOne > numberTwo;
//		System.out.println(numberOne	+	" > "+	numberTwo 	+	" is "	+	result);
//		result 	=	numberOne >= numberTwo;
//		System.out.println(numberOne	+	" >= "+	numberTwo 	+	" is "	+	result);
//		result 	=	numberOne < numberTwo;
//		System.out.println(numberOne	+	" < "+	numberTwo 	+	" is "	+	result);
//		result 	=	numberOne <= numberTwo;
//		System.out.println(numberOne	+	" <= "+	numberTwo 	+	" is "	+	result);
//		result 	=	numberOne == numberTwo;
//		System.out.println(numberOne	+	" == "+	numberTwo 	+	" is "	+	result);
//		result 	=	numberOne != numberTwo;
//		System.out.println(numberOne	+	" !=  "+	numberTwo 	+	" is "	+	result);
//		result	=	(numberOne	> numberTwo)	&&	(numberOne	>= numberTwo);
//		System.out.println("(numberOne	> numberTwo)	&&	(numberOne	>= numberTwo) "	+"is	"+result);
//		result	=	(numberOne	> numberTwo)	||	(numberOne	<= numberTwo);
//		System.out.println("(numberOne	> numberTwo)	||	(numberOne	<= numberTwo) "	+"is	"+result);
//		result	=	!((numberOne	> numberTwo)	||	(numberOne	<= numberTwo));
//		System.out.println("(numberOne	> numberTwo)	||	(numberOne	<= numberTwo) "	+"is	"+result);
		int numberOne = 25;
		int numberTwo = 125;
		double numberThree = 123.555;
		int maxNumber = Math.max(numberOne, numberTwo);
		System.out.println("Max is: "+maxNumber);
		int minNumber = Math.min(numberOne, numberTwo);
		System.out.println("Min is: "+minNumber);
		/* Hàm làm tròn : ceil ( tròn lên), floor(tròn xuống), round(làm tròn đến số nguyên gần nhất)*/
		double finalResult = Math.ceil(numberThree);
		System.out.println("finalResult is : "+finalResult);
		double finalResult1 = Math.floor(numberThree);
		System.out.println("finalResult1 is : "+finalResult1);
		double finalResult2 = Math.round(numberThree);
		System.out.println("finalResult2 is : "+finalResult2);
		/* Hàm random là hàm tạo ra giá trị ngẫu nhiên từ 0 đến 1*/
		double randomNumber = Math.random();
		System.out.println("randomNumber is : "+randomNumber);
		/* Hàm random một số tự nhiên trong khoản cho trước*/
		int min	= 14;
		int max	=	19;
		int range =( max	-	min)+1;
		int randomNum = (int)(Math.random()	*	range)+min;
		System.out.println("randomNumber is : "+randomNum);
		
		
	}
}
