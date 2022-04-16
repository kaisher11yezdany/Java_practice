/**************************************************************************************************
Name:Akshay Balasaheb Nikale                                                           Roll No:17
Sub: Advanced Java                                                                               Batch:A2
Assignment No:Student Registration for using swings and Jdbc Connection
**************************************************************************************************/
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
public class Akshay extends JFrame implements ActionListener
{
     JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
     JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
     JButton f,n,p,l;
     Connection con;
     Statement stmt;
     ResultSet rs;
    
     public Akshay()// Constructor
     {
     	     getContentPane().setBackground(Color.cyan);
             setLayout(null);
             setTitle("AK Nikale Creation");
             t1=new JTextField();
             t2=new JTextField();
             t3=new JTextField();
             t4=new JTextField();
             t5=new JTextField();
             t6=new JTextField();
             t7=new JTextField();
             t8=new JTextField();
             t9=new JTextField();
             l10=new JLabel("REGISTRATION FORM");
             l1=new JLabel("FIRST_NAME");
             l2=new JLabel("LAST _NAME");
             l3=new JLabel("EMAIL_ID");
             l4=new JLabel("MOBILE_NO");
             l5=new JLabel("ADDRESS");
             l6=new JLabel("CITY");
             l7=new JLabel("PINCODE");
             l8=new JLabel("STATE");
             l9=new JLabel("COUNTRY");
             f=new JButton("First");
             n=new JButton("Next");
             p=new JButton("Prev");
             l=new JButton("Last");
          
             l10.setBounds(300,20,400,40);
             l10.setFont(new Font("Dialog",Font.ITALIC,24));
             l1.setBounds(100,80,150,40);
             t1.setBounds(350,80,180,30);
             l2.setBounds(100,140,150,40);
             t2.setBounds(350,140,180,30); 
             l3.setBounds(100,200,150,40);
             t3.setBounds(350,200,180,30); 
             l4.setBounds(100,260,150,40);
             t4.setBounds(350,260,180,30); 
             l5.setBounds(100,320,150,40);
             t5.setBounds(350,320,180,30); 
             l6.setBounds(100,380,150,40);
             t6.setBounds(350,380,180,30); 
             l7.setBounds(100,440,150,40);
             t7.setBounds(350,440,180,30); 
             l8.setBounds(100,500,150,40);
             t8.setBounds(350,500,180,30); 
             l9.setBounds(100,560,150,40);
             t9.setBounds(350,560,180,30);
             f.setBounds(200,620,100,30);
             n.setBounds(400,620,100,30);
             p.setBounds(600,620,100,30);
             l.setBounds(800,620,100,30);
             setSize(980,900);
             setVisible(true);
             add(l1);add(l10);
             add(t1);  add(l2);  add(t2);  add(l3);  add(t3);  add(l4);  add(t4);
             add(l5);  add(t5);  add(l6);  add(t6);  add(l7);  add(t7);  add(l8);
             add(t8);  add(l9);  add(t9);  add(f);  add(n);  add(p);  add(l);
           
             f.addActionListener(this);
             n.addActionListener(this);
             p.addActionListener(this);
             l.addActionListener(this);
            
            //connection
            try
            {
                 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                 con=DriverManager.getConnection("jdbc:odbc:ANDSN");
                 stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                 rs=stmt.executeQuery("select * from student");
                 
                 while(rs.next())
                 {
                 t1.setText(rs.getString("FRIST_NAME"));
                 t2.setText(rs.getString("LAST_NAME"));
                 t3.setText(rs.getString("EMAIL_ID")); 
                 t4.setText(rs.getString("MOBILE_NO"));  
                 t5.setText(rs.getString("ADDRESS"));
                 t6.setText(rs.getString("CITY")); 
                 t7.setText(rs.getString("PINCODE"));
                 t8.setText(rs.getString("STATE"));
                 t9.setText(rs.getString("COUNTRY"));
                 }
                 
           }
           catch(Exception e1)
           {
                  System.out.println("Driver Error");
           }
           
           
           
     }//End constructor
            
     public void actionPerformed(ActionEvent e)
     {
           String str=e.getActionCommand();
           if(str.equals("First"))
           {
                   
                  try
                  {
                          rs.first();
                          {
                           t1.setText(rs.getString("FRIST_NAME"));
                           t2.setText(rs.getString("LAST_NAME"));
                           t3.setText(rs.getString("EMAIL_ID")); 
                           t4.setText(rs.getString("MOBILE_NO"));  
                           t5.setText(rs.getString("ADDRESS"));
                           t6.setText(rs.getString("CITY")); 
                           t7.setText(rs.getString("PINCODE"));
                           t8.setText(rs.getString("STATE"));
                           t9.setText(rs.getString("COUNTRY"));
                          }
                  }
                  catch(Exception e2)
                  {
                    
                  }
                  
          }
          
           if(str.equals("Next"))
           {
                   
                  try
                  {
                          rs.next();
                          {
                           t1.setText(rs.getString("FRIST_NAME"));
                           t2.setText(rs.getString("LAST_NAME"));
                           t3.setText(rs.getString("EMAIL_ID")); 
                           t4.setText(rs.getString("MOBILE_NO"));  
                           t5.setText(rs.getString("ADDRESS"));
                           t6.setText(rs.getString("CITY")); 
                           t7.setText(rs.getString("PINCODE"));
                           t8.setText(rs.getString("STATE"));
                           t9.setText(rs.getString("COUNTRY"));
                          } 
                           
                  }
                  catch(Exception e3)
                  {
                     
                  }
          }
          
          
          
          if(str.equals("Prev"))
           {
                   
                  try
                  {
                          rs.previous();
                          {
                           t1.setText(rs.getString("FRIST_NAME"));
                           t2.setText(rs.getString("LAST_NAME"));
                           t3.setText(rs.getString("EMAIL_ID")); 
                           t4.setText(rs.getString("MOBILE_NO"));  
                           t5.setText(rs.getString("ADDRESS"));
                           t6.setText(rs.getString("CITY")); 
                           t7.setText(rs.getString("PINCODE"));
                           t8.setText(rs.getString("STATE"));
                           t9.setText(rs.getString("COUNTRY"));
                          } 
                           
                  }
                  catch(Exception e4)
                  {
                     
                  }
          }
       
          if(str.equals("Last"))
           {
                   
                  try
                  {
                         rs.last();
                          {
                           t1.setText(rs.getString("FRIST_NAME"));
                           t2.setText(rs.getString("LAST_NAME"));
                           t3.setText(rs.getString("EMAIL_ID")); 
                           t4.setText(rs.getString("MOBILE_NO"));  
                           t5.setText(rs.getString("ADDRESS"));
                           t6.setText(rs.getString("CITY")); 
                           t7.setText(rs.getString("PINCODE"));
                           t8.setText(rs.getString("STATE"));
                           t9.setText(rs.getString("COUNTRY"));
                          } 
                           
                  }
                  catch(Exception e5)
                  {
                   
                  }
          }
          
     }
     public static void main(String args[])throws Exception
     {
           new Akshay();
     }
   }   
          
