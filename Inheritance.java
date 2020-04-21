class A
{
	int x,y;
	void showxy()
	{
		System.out.println("x = "+x + "\ny ="+y);
	}
}
class B extends A
{
	int z;
	void showz()
	{
		System.out.println("z= " +z);
		System.out.println("x+y+z ="+(x+y+z));
	}
}
class Inheritance
{
	public static void main(String args[])
	{
		A baseob = new A();
		B dervob = new B();
		baseob.x = 10;
		baseob.y = 20;
		System.out.println("Contents of base class object:");
		baseob.showxy();
		dervob.x = 3;
		dervob.y = 4;
		dervob.z = 5;
		System.out.println("Contents of derived class object:");
		dervob.showxy();
		dervob.showz();
		
		
	}
}
