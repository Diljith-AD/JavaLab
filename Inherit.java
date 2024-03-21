import java.util.*;
class Publisher
{
	String publisher;
	Publisher(String pub)
	{
		this.publisher=pub;
	}
}
class Book extends Publisher
{
	String book;
	Book(String pub, String boo)
	{
		super(pub);
		book=boo;
	}
}
class Literature extends Book
{
	Literature(String pub,String boo)
	{
		super(pub,boo);
	}
	void display();
	{
		System.out.println("Publisher:"+publisher);
		System.out.println("Book"+book);
	}
}
class Fiction extends Book
{
	Fiction(String pub,String boo)
	{
		super(pub,boo);
	}
	void display()
	{
		System.out.println("Publisher:"+publisher);
		System.out.println("Book:"+book);
	}
}
class Inherit
{
	public static void main(String args[])
	{
		System.out.println("Enter the no of Literature Book:");
		Scanner sc1=new Scanner(System.in);
		int num1=sc1.nextInt();
		Literature arr[]=new Literature[num];
		System.out.println("Enter the Literature Book details:");
		int n=0;j=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<num;i++)
		{
			n=i+1;
			System.out.println("\n"+x1+".");
			System.out.println("\n Book");
			String boo=sc.next();
			System.out.println("\nPublisher:");
			String pub=sc.next();
			arr[i]=new Literature(pub,boo);
		}
		System.out.println("Enter the no of Fiction Books:");
		int num1=sc1.nextInt();
		Fiction arr1[]=new Fiction[num1];
		System.out.println("Enter the Fiction Book Details:\n");
		int x1=0;j1=0;
		for (int i=0;i<num;i++)
		{
			x1=i+1;
			System.out.println(x1);
			System.out.println("Book:");
			String boo=sc.next();
			System.out.println("Publisher:");
			String pub=sc.next();
			arr1[i]=new Fiction(pub.boo);
		}
		sc.close();
		sc1.close();
		System.out.println("****Information of the Literature Books****");
		for(int i=0;i<num;i++)
		{
			j=j+1;
			System.out.println("\n"+j);
			arr[i].display();
		}
		System.out.println("****Information of all the Fiction Books****");
		for(int i=0;i<num1;i++)
		{
			j1=i+1;
			System.out.println("\n+j1");
			arr[i].display();
		}
	}
}

