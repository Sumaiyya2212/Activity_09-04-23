package abstraction;
interface Drawing
{
	void draw();//abstract method
	void paint();
	
	//We can add the body of a method in an interface by making if default
	default void message()
	{
	   System.out.println("Java 8, default methof was introdued.");
	}
	
	//before Java 8 static and default methods were not present
	static int multiply(int a,int b)
	{
		return a*b;
	}
}
class Circle implements Drawing
{

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		
	}

	@Override
	public void paint() {
		System.out.println("Painting Circle");
	}	
}
public class DefaultMethodDemo {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.draw();//Implementing draw method.
		circle.paint();//implementing paint method.
		circle.message();//implementing message mehod
		//Calling static method declared in Drawing interface
		System.out.println(Drawing.multiply(5, 5));
	}

}
