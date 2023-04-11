package abstraction;
interface B
{
	void add(int a,int b); //abstract method
}
abstract class A
{
	public void demo() //concrete method
	{
	   System.out.println("Abstract Class");	
	}
	abstract void display();//abstract method
}
class Child extends A implements B
{

	@Override
	public void add(int a, int b) {
		System.out.println("Sum : "+(a+b));
	}

	@Override
	void display() {
         System.out.println("Another way of achieving multiple inheritance");
		
	}
	
}
public class MultipleInheritaneDemo {

	public static void main(String[] args) {
	    Child child = new Child();
	    child.add(5, 5);
	    child.display();
	    child.demo();

	}

}
