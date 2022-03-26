package com.share;
//Static can applies to variable, method, inner class, block
//static variable- dtata is shared in all object
class Studentdetails
 
{
	int stu_id;
	String stud_name;
	static  String sch_name;
	static 
	{
		sch_name="PKIET";
	}
	public Studentdetails(int stu_id, String stud_name)
	{
		this.stu_id=stu_id;
		this.stud_name=stud_name;
	}
	void display()
	{
	   System.out.println("Student id:  "+stu_id);
	   System.out.println("Student name:  "+stud_name);
	   System.out.println("School Name:  "+sch_name);
	}
}
	public class Student
	{

	public static void main(String[] args) 
	{
	   Studentdetails s= new Studentdetails(45,"Thara");
	   Studentdetails s1=new Studentdetails(46, "divi");
	   System.out.println("student details");
	   s.display();
	   s1.display();
	}

}
