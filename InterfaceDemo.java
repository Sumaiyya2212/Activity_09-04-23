package abstraction;
interface Printable{
	int x=100;//Public,Static and Final by deafult
	void display();//Abstract Methods
	void fun();
}
//Inheritance 
//interface->interface->extends
//abstract class->class->extends
//interface->class->implements
interface Drawable extends Printable{
	void draw();//abstract method
}
interface Sayable
{
	void say();
	void draw();
}
//Using interface we can achieve multiple inheritance in java
//a class can implement any number of interfaces
class Print implements Drawable,Sayable
{

	@Override
	public void display() {
		System.out.println("Hello");
		
	}

	@Override
	public void fun() {
		System.out.println("This is fun");
		
	}

	@Override
	public void say() {
		System.out.println("Speaking.....");
		
	}

	@Override
	public void draw() {
		System.out.println("Drawing is Fun");
		
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		Print print = new Print();
		print.display();
		print.fun();
		print.draw();
		print.say();
	}

}
