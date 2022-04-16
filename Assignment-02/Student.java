import java.sql.*;
import java.util.*;
import java.lang.*;
public class Student
{
	public static void main(String args[]) throws Exception
	{
		int id=0,id2=0,id3=0,choice,count=0,z1=0,y=0,z=0,x=0;
		String sname;
		float per;
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                                Connection con=DriverManager.getConnection("jdbc:odbc:AKDSN");
                                System.out.println("Connection Successful......");
                                Statement stmt=con.createStatement();
                                ResultSet rs;
                                Scanner sc =new Scanner(System.in);

		do
		{
			System.out.println("\n*****MENU*****\n");
			System.out.println("1>Create Table:....\n");
			System.out.println("2>Select Database:.... \n");
			System.out.println("3>Insert Databas:....\n");
			System.out.println("4>Delete Database:....\n");
			System.out.println("5>Update Database:....\n");
			System.out.println("6>Exit:....\n");
			System.out.println("\nSelect your choice:...");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:	
                                                                                       
                        x =stmt.executeUpdate("create table Student(id int,sname varchar(10),per int)");
                        if(x<0)
                        System.out.println("Table Created Successfully.....");
                        else
                        System.out.println("Table Can Not Be Created.....");
                        break;
                        
				case 2:	try	
					{
						rs=stmt.executeQuery("select * from Student");
						while(rs.next())
						{
							System.out.println("id="+rs.getInt(1));
							System.out.println("sname="+rs.getString(2));
							System.out.println("per="+rs.getFloat(3));

						}
					}
					catch(SQLException e1)
					{
						System.out.println(e1);
					}
					break;
	
				case 3: try	
					{
						System.out.println("Enter Student id:");
						id=sc.nextInt();
						System.out.println("Enter Student  Name:");
						sname=sc.next();
						System.out.println("Enter Student Percentage:");
						per=sc.nextFloat();
						y=stmt.executeUpdate("insert into student values("+id+",' "+sname+" ',"+per+")");
						
					}
					catch(SQLException e2)
					{
						System.out.println(e2);
					}
					if(y>0)
					System.out.println("\nRecord inserted successfully....");
					else
					System.out.println("\n Record Can Not Be Inserted....");
					
					break;
				case 4:	try	
					{
						System.out.println("Enter id for delete record:");
						id2=sc.nextInt();
						 z1=stmt.executeUpdate("delete from student where id="+id2);
						if(z1>0)
						System.out.println("\n Record Deleted successfully...");
						else
						System.out.printf("\n Record Can Not Be Deleted....");
		
					}
					catch(SQLException e3)
					{
						System.out.println(e3);
					}
					
					break;
				case 5:
					try	
					{
						System.out.println("Enter id for update record:");
						id3=sc.nextInt();
						int xz=stmt.executeUpdate("update student set sname='akshay' where id="+id3);
						if(xz>0)
						System.out.println("\nRecord updated  successfully...");
						else
						System.out.printf("\n Record Can Not be Updated....");
		
					}
					catch(SQLException e4)
					{
						System.out.println(e4);
					}
					
					break;
		
			}
		}while(choice!=6);
		con.close();	
	}
	
}