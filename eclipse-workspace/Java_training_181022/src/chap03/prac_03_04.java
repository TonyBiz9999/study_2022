package chap03;

public class prac_03_04 {
public static void main(String[] args) {
	int [] arrInt = {2,2,6,4,5};//01234
	int sum = 0;
	int totalNumber = 0;
	String listNumber = "";

	for (int i = 0; i < arrInt.length ; i++) {
	    if(i % 2 == 0 && arrInt[i] % 2 == 0   ) {
	        totalNumber++;
	        sum+=arrInt[i];
	        listNumber += (arrInt[i] +"+"  );
	        
	        
	    }  
	    
	}

	System.out.printf("Avg: (%s)/ %d = %d", listNumber, totalNumber, sum/totalNumber   );
}
}
