package chap03;

public class prac_04_02 {
public static void main(String[] args) {
	String id 	= "69";
	String str	= "78, 60,62,69,69,68,73,85,66    ,69,65,74,63,67 ,65,64,68,73,75,69,73,169";
	int count 	= 0;
	str = str.replaceAll("\\s+",""); // xóa khoản trắng trong chuỗi.
	String[] strArr = str.split(",");
	for(int i=0; i<strArr.length; i++) {
		if(strArr[i].equals(id)) {
		count++;
	}

}
	System.out.println(count);
}
}