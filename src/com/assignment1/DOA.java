package com.assignment1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class DOA {
     UI u = new UI();
	Scanner sc = new Scanner(System.in);
	public void DisplayAllBook() {
		try{  
			
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/bookmanage","root","samprith123");  
			  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from book");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getDouble(4));  
			con.close();  
			}catch(Exception e){ System.out.println(e);}  
			}  
			
		
	
	
	public void searchById() {
		System.out.println("Enter the ID");
		int x = sc.nextInt();
      try{  
			
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/bookmanage","root","samprith123");  
			  
			PreparedStatement stmt=con.prepareStatement("select * from book where id = ?");  
			stmt.setInt(1, x);
			ResultSet rs=stmt.executeQuery();  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getDouble(4));  
			con.close();  
			}catch(Exception e){ System.out.println(e);}  
			}  
			
		
	
	
	public void insert() {
		System.out.println("Enter the bookid");
		int id =sc.nextInt();
		System.out.println("Enter the book name");
		String name = sc.next();
		System.out.println("Enter the author name");
		String au = sc.next();
		System.out.println("Enter the price ");
		double p =sc.nextDouble();
		 try{  
				
				Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/bookmanage","root","samprith123");  
				  
				PreparedStatement stmt=con.prepareStatement("insert into book values(?,?,?,?)");  
				stmt.setInt(1, id);
				stmt.setString(2, name);
				stmt.setString(3, au);
				stmt.setDouble(4, p);
				
				int i=stmt.executeUpdate();  
				System.out.println(i+" records inserted"); 
				con.close();  
				}catch(Exception e){ System.out.println(e);}  
				}  
	
	
	
	public void deleteById() {
		System.out.println("Enter the ID");
		int x = sc.nextInt();
      try{  
			
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/bookmanage","root","samprith123");  
			  
			PreparedStatement stmt=con.prepareStatement("delete from book where id=?");  
			stmt.setInt(1, x);
			
			
			int i=stmt.executeUpdate();  
			System.out.println(i+" records deleted"); 
			con.close();  
			}catch(Exception e){ System.out.println(e);}  
			}  
			
	
	public void update() {
		
		System.out.println("Enter the ID");
		int x = sc.nextInt();
		System.out.println("Enter updated price");
		double d =sc.nextDouble();
		 try{  
				
				Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/bookmanage","root","samprith123");  
				  
				PreparedStatement stmt=con.prepareStatement("update book set price=? where id=?"); 
				stmt.setDouble(1,d);
				stmt.setInt(2, x);
				
				int i=stmt.executeUpdate();  
				System.out.println(i+" records updated");   
				con.close();  
			}catch(Exception e){ System.out.println(e);}  
			}  

}
