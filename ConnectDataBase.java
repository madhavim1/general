/* Write a program to make use of JDBC and 
 * insert/update/select values in the database.
 */
package com.training.general;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDataBase {

	public static void main(String[] args) throws ClassNotFoundException {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(  
			"hr.cwjgdp1wxdy2.us-west-1.rds.amazonaws.com:1521:ORCL","whiteboxqa","Excellence");  
			Statement stmt = con.createStatement(); 
			ResultSet rs = stmt.executeQuery("select * from emp");
			//stmt.executeUpdate("UPDATE emp SET location ='NEW YORK' WHERE id = 101");
			//stmt.executeUpdate("INSERT INTO emp VALUES (999, 'Kim', 'MANAGER', 29, 40000)");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			}
			rs.close();
			stmt.close();
			con.close();
		}catch(SQLException e) { 
			e.printStackTrace();
		}  
	}  
}
