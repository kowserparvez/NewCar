package NewCar;

public class MainClass {

	public static void main(String[] args) {

		SuperClass s1 = new SuperClass("Myname");
		s1.methodOne();

		SubClass sb1=new SubClass("yourname");
		sb1.methodOne();
	}

}
