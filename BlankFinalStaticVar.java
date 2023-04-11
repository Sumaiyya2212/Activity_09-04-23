package abstraction;

public class BlankFinalStaticVar {
     
	static final int data;
	static //static block
	{
		data=5;
	}
	int cube(final int n)
	{
		//n=n+3//the value cant be changed as it has been assigned as final
		return n*n*n;
	}
	public static void main(String[] args) {
	     BlankFinalStaticVar blank = new BlankFinalStaticVar();
	     System.out.println("Value of data : "+blank.data);
	     System.out.println(blank.cube(4));

	}

}
