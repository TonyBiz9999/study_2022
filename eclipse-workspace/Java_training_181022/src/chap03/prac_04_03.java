package chap03;

public class prac_04_03 {
public static void main(String[] args) {
	String str 		= "php/12/typescript/230/jquery/190/angular/220";
	String strArr []	= str.split("/");

//	0	1	2			3	4		5		6			7
//	php	12	typescript	92	jquery	190		angular		220
//
//	Tên khoá học nằm ở chỉ số chẵn
//	Time khoá học nằm ở chỉ số lẻ

	int indexFindTime = 1;
	int maxTime = 0;
	for(int i = 1; i < strArr.length; i+=2) {
		if(Integer.parseInt(strArr[i]) >  maxTime) {
			maxTime = Integer.parseInt(strArr[i]);
			indexFindTime = i;
		}
	}
//	input: str, strArr;
//	ouput: strArr[indexFindTime - 1]: strArr[indexFindTime]
	System.out.println("Khoa hoc " +strArr[indexFindTime-1] +" co thoi gian "+ maxTime + " buoi" +" la khoa hoc dai nhat");
}
}