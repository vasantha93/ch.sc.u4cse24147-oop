class person{
	String name;
	int age;
	String address;
	public void personinfo(String name,String address,int age){
		System.out.println("Name of person="+name);
		System.out.println("Address of person="+address);
		System.out.println("Age of person="+age);

	}
}
class student extends person{
	int id;
	int marks;
	public void studentinfo(int id,int marks){
		System.out.println("Id of student="+id);
		System.out.println("Marks of student="+marks);

	}
}
public class StudentInformation{
	public static void main(String args[]){
		student obj=new student();
		obj.personinfo("vasu","guntur",21);
		obj.studentinfo(123,600);
		

	}
}