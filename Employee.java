import java.util.*;
 class Employee
 {
 int e_no;
 String e_name;
 int e_salary;
 Scanner sc=new Scanner(System.in);
 void getdetails()
 {
          Scanner sc=new Scanner(System.in);
	System.out.println("enter e number:");
	this.e_no=sc.nextInt();
	System.out.println("enter the name:");
	this.e_name=sc.next();
	System.out.println("enter the salary:");
	this.e_salary=sc.nextInt();
}
void display()
{
	System.out.println("employee number"+this.e_no);
	System.out.println("employee name"+this.e_name);
	System.out.println("employee salary"+this.e_salary);
}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	Employee[]a1=new Employee[5];
	int t=0;
	for(int i=0;i<5;i++)
	{
		a1[i]=new Employee();
		a1[i].getdetails();
	}
	System.out.println("enter the id to be searched");
	int id=sc.nextInt();
	int f=0;
	for(int i=0;i<5;i++)
	{
		if(id==a1[i].e_no)
		{
			a1[i].display();
			f=0;
			break;
		}
		else
		{
			f++;
		}
		if(f!=0)
		{
			System.out.println("no match is found");
		}
	}
}
}
	
	
