import java.util.*;
class Arithmetic
{
	int a,b;
	Scanner s1=new Scanner(System.in);

	Arithmetic()
	{
		System.out.println("Enter any 2 integers:");
		a=s1.nextInt();
		b=s1.nextInt();
	}
	
void display()
{
	System.out.println("addition="+(a+b));
	System.out.println("subtraction="+(a-b));
	System.out.println("multiplication="+(a*b));
	System.out.println("division="+(a/b));
}

Arithmetic(float a1,float b1)
{
	System.out.println("addition="+(a1+b1));
	System.out.println("subtraction="+(a1-b1));
	System.out.println("multiplication="+(a1*b1));
	System.out.println("division="+(a1/b1));
}

void display(int x)
{
	System.out.println("Square of "+x+" is "+(x*x));
}
}
class Main
{
	public static void main(String args[])
	{
	Scanner s1=new Scanner(System.in);
	System.out.println("arithmetic operations of integer are:");
	Arithmetic a=new Arithmetic();
	a.display();
	System.out.println("\n arthimetic operations on float are:");
	System.out.println("Enter any two float numbers:");
	float a1=s1.nextFloat();
	float b1=s1.nextFloat();
	Arithmetic arth1=new Arithmetic(a1,b1);
	System.out.println("\n Enter number to find square:");
	int x=s1.nextInt();
	a.display(x);
}
}


