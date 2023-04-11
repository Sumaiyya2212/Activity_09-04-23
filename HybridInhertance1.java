package abstraction;
interface University4{
	default void UniversityName(String universityname)
	{
		System.out.println("University Name : "+universityname);
	}
}
interface Clg3 extends University4
{
	default void ClgName(String clgname){
	     System.out.println("College Name : "+clgname);
	}
}
abstract class Dept implements University4{
	public void DeptInfo(String Dept,String HODName)
	{
		System.out.println("Department : "+Dept);
		System.out.println("HOD : "+HODName);	
	}
}
class Student3 extends Dept implements Clg3
{
	public void StudentInfo()
	{
		System.out.println("Student Name : Sumaiyya Shakil Shaikh");
		System.out.println("Id Number : 19030978");
		System.out.println("Mob No. :7030307341");
	}
}
public class HybridInhertance1 {

	public static void main(String[] args) {
		Student3 student = new Student3();
		student.UniversityName("Solapur University");
		student.ClgName("WIT Solapur");
		student.DeptInfo("CSE","abc");
		student.StudentInfo();
		
	}

}
