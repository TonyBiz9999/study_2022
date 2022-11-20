package chap03;

//import java.util.Arrays;

//String str 		= "php/12/1/typescript/92/3";
//Chuỗi có dạng name/time/student: tên khóa học / thời lượng khóa học / số học viên trong khóa học đó
//php/12/1 khóa php có 12 giờ có 1 học viên
//Yêu cầu 1: In ra danh sách khóa học
//1. Php - 12 giờ - 1 học viên
//2. Typescript - 92 giờ - 3 học viên

//Yêu cầu 2: In ra khóa học có thời gian nhiều nhất
//Typescript - 92 giờ

//Yêu cầu 3: In ra thời lượng trung bình của các khóa học
//Avg = (12 + 92) / 2 = 52 giờ
public class prac_04_04 {
public static void main(String[] args) {
	String str 		= "php/12/1/typescript/92/3/Kotlin/90/5";
	String strArr []	= str.split("/");
//	System.out.println(Arrays.toString(strArr)); /* print all element of array.*/
	int indexFindTime = 1;
	int maxTime = 0;
	int indexCount = 0;
	int sumHour = 0;
	String shape ="";
	for(int i = 1; i < strArr.length-1; i+=3) {
//	Yêu cầu 1: In ra danh sách khóa học
		indexCount ++;
		System.out.println(indexCount+". "+strArr[i-1]+" - "+strArr[i] +" gio" + " - " + strArr[i+1]+ " hoc vien" );		
		sumHour += Integer.parseInt(strArr[i]);  /* tinh tong gio hoc */
		shape += strArr[i] + " +";
//Yêu cầu 2: In ra khóa học có thời gian nhiều nhất		
		if(Integer.parseInt(strArr[i]) >  maxTime) {
			maxTime = Integer.parseInt(strArr[i]);
			indexFindTime = i;
		}
}
	int Avg = sumHour/indexCount;
	shape = shape.substring(0, shape.length()-1);  /* bo phan tu cuoi cua string  */
	
	System.out.println("Khoa hoc " +strArr[indexFindTime-1] +" co thoi gian "+ maxTime + " gio " +" la khoa hoc dai nhat");
	System.out.println("Avg" +" = " +"("+shape + ")" +"/" +indexCount+" = " +Avg+" Gio");
	
}
}
