package chap02.oop;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main.main()");
		student studentOne	= new student();
		studentOne.birthday = 1994;
		studentOne.code	= "S001";
		studentOne .name =	"Jonh";
		
		System .out.println("Name : "+studentOne.name);
		System .out.println("Code : "+studentOne.code);
		System .out.println("Birthday : "+studentOne.birthday);
	}

}
