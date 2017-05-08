package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDemo {

	public static void main(String[] args) 
	{
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:8086:XE","system","manager");
		PreparedStatement pstmt=con.prepareStatement("insert into Patientlist values(?,?,?,?,?)");
		pstmt.setString(1,args[0]);
		pstmt.setInt(2,Integer.parseInt(args[1]));
		pstmt.setString(3,args[2]);
		pstmt.setString(4,args[3]);
		pstmt.setLong(5,Long.parseLong(args[4]));
		pstmt.executeUpdate();
		System.out.println(" Record Inserted Successfully");
	}catch(Exception e)
	{
		System.err.println(e);
	}
	}

}
