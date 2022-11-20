package chap03;

import java.util.Scanner;

public class Prac_03_01 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);    
	System.out.print("Enter your number :  \n");  
	int yourNumber= sc.nextInt(); 
	 sc.close();
//	 String tiengViet []= {"Thu Hai", "Thu Ba","Thu Tu","Thu Nam","Thu Sau","Thu Bay","Chu Nhat"};
//	 String engLish [] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
	 int yourLanguage = yourNumber / 10;
	 int yourDay = yourNumber % 10;

	 String result = "";
	 String[] dateVN = {"0", "1", "Thứ 2","Thứ 3","Thứ 4","Thứ 5","Thứ 6","Thứ 7", "Chủ nhật"};
	 String[] dateEN = {"0", "1", "Mon","Tue","Wed","Thu","Fri","Sat", "Sun"};
	 String[] dateFR = {"0", "1", "Mon","Tue","Wed","Thu","Fri","Sat", "Sun"};
	 if ( (yourLanguage == 1 || yourLanguage == 2) && (yourDay >= 2 && yourDay <= 8)) { // giải max được
	 	if(yourLanguage == 1) {
	 		result = dateVN[yourLanguage];
	 	}else if(yourLanguage == 2) {
	 		result = dateEN[yourLanguage];
	 	}else if(yourLanguage == 3) {
	 		result = dateFR[yourLanguage];
	 	}
	 }else{
	 	result = "Không giải mã được" ;
	 }
	 System.out.println(result);
}
}
