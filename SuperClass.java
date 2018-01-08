package NewCar;

public class SuperClass {
String name;

	public SuperClass() {
		System.out.println("This is first constructor");
	
	}
	public SuperClass(String name) {
		this.name=name;
		System.out.println(name);
	
	}
	public void methodOne() {
		System.out.println("Coming from super class");
		
	}
}
