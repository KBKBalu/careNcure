package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateDemo {

	public static void main(String[] args) 
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:8086:XE","system","manager");
			Statement stmt=con.createStatement();
			stmt.execute("create table Patientlist(pName varchar2(20),pId number(4),Gender varchar2(6),Gurdain varchar2(21),phNo number(10))");
			System.out.println("Table created Successfully");
			
		}catch(Exception e)
		{
			System.err.println(e);
		}

	}

}
