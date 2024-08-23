package com.TNS_Projects.work;
class Number
{
	int num1;
	int num2;
	int result;
	void sum(int a,int b) 
	{
	   num1=a;
	   num2=b;
	   result=a+b;
	   System.out.println("the result is:"+result);
	}
	void sum(int a,double b) 
	{
		 num1=a;
		   num2=(int)b;
		   result=a+(int)b;
		   System.out.println("the result is:"+result);   	
	}
	void sum(double a,double b) 
	{
		 num1=(int)a;
		   num2=(int)b;
		   result=(int)a+(int)b;
		   System.out.println("the result is:"+result);
	}
}

public class Overload {

	public static void main(String[] args) {
		Number n =new Number();
		n.sum(10,20);
		n.sum(15, 20.50);
		n.sum(33.0 , 30.0);

	}

}
