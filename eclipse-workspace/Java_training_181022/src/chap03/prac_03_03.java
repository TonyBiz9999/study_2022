package chap03;

public class prac_03_03 {
public static void main(String[] args) {
	int[] arrInt	= {1,2,7,9,2};
	String flag ="Không tồn tại";
	int a = arrInt.length;
	for (int i = 1; i < a-1; i++) {
		if( arrInt[i]==arrInt[i-1]+arrInt[i+1]) {
				flag ="Tồn tại";
	}	
}	

	System.out.println(flag);
}
}