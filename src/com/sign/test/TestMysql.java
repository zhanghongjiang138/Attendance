package com.sign.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestMysql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendance", "root", "king2015");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM sign_test");
			while(rs.next()){
				System.out.println(rs.getString(1));
			}
		}catch(Exception err){
			System.out.println(err.toString());
		}

	}
}
