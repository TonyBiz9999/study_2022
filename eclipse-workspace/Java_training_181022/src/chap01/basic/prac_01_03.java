package chap01.basic;

public class prac_01_03 {
public static void main(String[] args) {
	int yourAge = 10;
	String message = "Bạn được xem phim Thế giới lập trình";
	if (yourAge  < 15) {
		message = "Bạn KHÔNG được xem phim Thế giới lập trình";
	}

	System.out.println("message :  " + message);
}
}
