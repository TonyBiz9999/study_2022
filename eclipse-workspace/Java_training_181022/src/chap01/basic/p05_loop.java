package chap01.basic;

public class p05_loop {
	public static void main(String[] args) {
// Loop " for"
//		for(int i=1; i<=10; i++) {
//			System.out.println(i+" Java is not difficult !");
//	}
//		Loop "while"
//		int 	j=1;
//		while(j<=10) {
//			System.out.println(	j+" Java is not difficult !");
//			j++;
//		}
// Loop"Do while":
//		int k =1;
//		do {
//			System.out.println(k+" Java is not difficult !");
//			k++;
//		}while(k<=10);
		/* Bài tập bảng cửu chương:*/
//		int number =5;
//		for(int i=1; i<=10; i++) {
//		System.out.println(number+"x"+i	+"=" +number*i);
//		System.out.printf("%d x %d = %d \n" , number, i, number*i );
//		int number =5;
//		int j=1;
//		while(j<=10){
//			System.out.printf("%d x %d = %d \n" , number, j, number*j );
//			j++;
//		}
//	int k=1;
//	int number = 2;
//	do {
//		System.out.printf("%d x %d = %d \n" , number, k, number*k );
//		k++;
//	}while(k<=10);
//	}
//public static void main001(String[] args) {
	// Loop " for"
//			for(int i=1; i<=10; i++) {
//				System.out.println(i+" Java is not difficult !");
//		}
//			Loop "while"
//			int 	j=1;
//			while(j<=10) {
//				System.out.println(	j+" Java is not difficult !");
//				j++;
//			}
	// Loop"Do while":
//			int k =1;
//			do {
//				System.out.println(k+" Java is not difficult !");
//				k++;
//			}while(k<=10);
//		004 BREAK AND CONTINUE:
		for (int i=1; i<=20; i++) {
			if( i	%	7 ==	0) {
				System.out.println(" OK : "+i );
			}
			System.out.println( i );
		}
		
		}
}