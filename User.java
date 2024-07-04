import java.util.*;
class User
{
	public static void main(String args[])
	{
		String username,password;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username:");
		username=sc.nextLine();
		System.out.println("Enter Password:");
		password=sc.nextLine();
		try
		{
			if(username.equals("admin") && password.equals("123"))
			{
				System.out.println("Authentication Succesfull");
			}
			else
			{
				System.out.println("Authentication Failed");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
