package com.jsp.add;
//static variables and methods can be accessed through the class name,without creating the object
//Cannot access static methods from non-static method
//non-static methods can be accessed only through object reference
public class AdditionMethodOverLoading {
	static int d;  //instance variable
	static int m=100;//static variable  

	static int add(int a,int b){
		int c=a+b;  //local variable
		System.out.println("Addition of a,b,c = "+c);
		return c;
	}
	void  add(int a,int b,int x){
		int c=a+b+x;
		System.out.println("Addition of a,b = "+c);
		//return c;
	}
	
	AdditionMethodOverLoading(int x,int y){
		System.out.println("Area of x,y="+x*y);
	}
	//creating a default constructor
	AdditionMethodOverLoading() {
	}
	public static void main(String args[]){
		AdditionMethodOverLoading a=new AdditionMethodOverLoading();   //creating an object
		//a.add(10,20);
		a.add(10,20,30);//accessing non-static method of Addition class
		AdditionMethodOverLoading.add(10,20);//accessing static method of Addition class
		System.out.println("value of d is "+d);
		AdditionMethodOverLoading ab=new AdditionMethodOverLoading(4,5);
	}
}
