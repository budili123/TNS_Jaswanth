package com.tnsif.Day2.EncapuslationOOPs;

public class Encapusulation {

	String name;
	int age;
	String dept;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "OopsConceptDemo [Name=" + name + ", age=" + age + ", dept=" + dept + "]";
		
	}
	
	public static void main(String[] args) {
		Encapusulation obj = new Encapusulation();
		obj.setName("Abhi");
		obj.setAge(22);
		obj.setDept("CSE");
		System.out.println(obj);
	}	
	

	}


