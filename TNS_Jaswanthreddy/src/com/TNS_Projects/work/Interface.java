package com.TNS_Projects.work;
interface student1
{
	int age=25;
	void display();
	}
class student2 implements student1
{
	System.out.println("The student1 is an interface");
}

public class Interface {

	public static void main(String[] args) {
		student1 st=new student2();
		st.display();		
	}
}
