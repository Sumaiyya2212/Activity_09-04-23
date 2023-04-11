package abstraction;
interface University{
   void UniversityName();
   
}
interface Clg extends University
{
    void Collegename();
}
interface Department extends University
{
	 void Departmentname();
}
class Student implements Clg,Department
{

	@Override
	public void UniversityName() {
		System.out.println("University Name : Solapur University");
		
	}
	
	@Override
	public void Collegename() {
		System.out.println("College Name : WIT Solapur");
		
	}

	@Override
	public void Departmentname() {
		System.out.println("Department : CSE");
		
	}
	public void StudentInfo()
	{
		System.out.println("Student Name : Sumaiyya Shakil Shaikh");
		System.out.println("Id Number : 19030978");
		System.out.println("Mob No. :7030307341");
	}
}
public class HybridInheritance {

	public static void main(String[] args) {
		Student student = new Student();
		student.UniversityName();
		student.Collegename();
		student.Departmentname();
		student.StudentInfo();
	 
	}

}
