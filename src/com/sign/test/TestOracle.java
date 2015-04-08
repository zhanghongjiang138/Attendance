package com.sign.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestOracle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@3.35.121.4:1521:DEVEPOP", "epop3sfdc", "gtm123epop");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM TTG_EMPLOYEE");
			while(rs.next()){
				System.out.println(rs.getString(1) + "\t" + rs.getString(2));
			}
		}catch(Exception err){
			System.out.println(err.toString());
		}

	}

}
