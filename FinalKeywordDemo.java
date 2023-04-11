package abstraction;
//If a class is declared as final that class cannot be inherited/extended
class Bike{
	//any method declared as final it cannot be changed/updated/override
	final void speed()
	{
		System.out.println("Speed : 60km/hr");
	}
}
public class FinalKeywordDemo extends Bike {
      //Final Variable
	   final int a = 100;
	public static void main(String[] args) {
		FinalKeywordDemo demo = new FinalKeywordDemo();
		//demo.a=500; //final Variable cannot be changed
		System.out.println("Value of a: "+demo.a);
		demo.speed();

	}

}
