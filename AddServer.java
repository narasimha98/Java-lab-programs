package rmi;

import java.rmi.Naming;

public class AddServer
{
	public static void main(String[] args)
	{
		try
		{
			AddServerImpl Server= new AddServerImpl();
			Naming.rebind("registerme", Server);
			System.out.println("Server is running");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}


