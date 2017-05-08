package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class SelectDemo {

	public static void main(String[] args)
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:8086:XE","system","manager");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("Select * from Patientlist");
			ResultSetMetaData rm=rs.getMetaData();
			int n=rm.getColumnCount();
			for(int i=1;i<=n;i++)
			{
				System.out.print(rm.getColumnName(i)+"\t");
			
			}
			System.out.println();
			while(rs.next())
			{
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getInt(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString(4)+"\t");
				System.out.println(rs.getLong(5));
				
			}
				
		}catch(Exception e)
		{
			System.err.println(e);
		}
	}

}
