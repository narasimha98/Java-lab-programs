package rmi;
import java.rmi.*;
public class AddClient
{
	public static void main(String[] args)
	{
		try
		{
			AddServerIntf Client=(AddServerIntf)Naming.lookup("registerme");
			System.out.println("First number is:" +args[0]);
			int x = Integer.parseInt(args[0]);
			System.out.println("Second number is:" +args[1]);
			int y = Integer.parseInt(args[1]);
			System.out.println("Sum = "+ Client.add(x,y));
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
	}
}

