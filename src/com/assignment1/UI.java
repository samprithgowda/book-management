package com.assignment1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.util.TreeSet;



public class UI {

	public   TreeSet<Book> data;
	{
		data=new TreeSet<>();
	    
	    
	}
	
	
	public static void main(String[] args) {

		
		
		
		
		
		
		DOA d = new  DOA();
 		
		Scanner sc = new Scanner(System.in);
		String str;
		do {

			System.out.println(" 1) VIEW ALL BOOKS \n 2) SEARCH BOOK BY ID "
					+ "\n 3) INSERT A BOOK \n 4)DELETE A BOOK \n 5)UPDATE THE BOOK PRICE By ID" + " \n 6)EXIT  ");

			System.out.println("Enter Your Choice...");
                String x = sc.next();
			switch (x) {
			case "1":
				d.DisplayAllBook();
				break;

			case "2":
                 d.searchById();
				break;
				
			case "3":
				
                 d.insert();
				break;
			case "4":
                  d.deleteById();
				break;
			case "5":
                  d.update();
				break;
			case "6": return;
				
				
			default:
				System.out.println("please Enter valid choice");
				break;
			}
			
			
			System.out.println("Enter Y to Main Menu");
			 str = sc.next();
		}while(str.equalsIgnoreCase("y"));

	}

	

}
