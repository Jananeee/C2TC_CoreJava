package com.cg.connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Client {

	public static void main(String[] args) throws SQLException {
		Connection connection = DBUtil.getconnection();
		if(connection!=null) {
			System.out.println("JDBC:Connection is established");
			CreateEmployee();
		}
	}
		public static void CreateEmployee() throws SQLException{
			Connection connection = DBUtil.getconnection();
			Statement stmt = connection.createStatement();
			String sqlinsert = "insert into employees(name,salary,bonus)"+"values('raji',500.00,20.00)";
			int executeupdate = stmt.executeUpdate(sqlinsert);
			if(executeupdate==1) {
				System.out.println("entry is added");
			}
			
		}
		public static void UpdateEmployee() throws SQLException{
			Connection connection = DBUtil.getconnection();
			Statement stmt = connection.createStatement();
			String sqlupdate = "update employees set bonus =50.0 where id =1";
			int executeupdate = stmt.executeUpdate(sqlupdate);
			if(executeupdate==1) {
				System.out.println("update is performed");
			}
	}
		public static void DeleteEmployee() throws SQLException{
			Connection connection = DBUtil.getconnection();
			Statement stmt = connection.createStatement();
			String sqldelete = "delete from employees where id =1";
			int executeupdate = stmt.executeUpdate(sqldelete);
			if(executeupdate==1) {
				System.out.println("delete is performed");
			}
	}
		public static void RetrieveEmployeeyId() throws SQLException{
		Connection connection = DBUtil.getconnection();
		Statement stmt = connection.createStatement();
		String sqlretrieve = "select * from employees where id =2";
		ResultSet rs = stmt.executeQuery(sqlretrieve);
		if(rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			Double Salary = rs.getDouble("salary");
			Double bonus = rs.getDouble("bonus");
			System.out.println(id+" "+name+" "+Salary+" "+bonus);
		}
		else {
			System.out.println("employee doesnot exist with provided id");
		}
	}
		public static void RetrieveEmployee()throws SQLException{
			Connection connection = DBUtil.getconnection();
			Statement stmt = connection.createStatement();
			String sqlretrieve = "select * from employees";
			ResultSet rs = stmt.executeQuery(sqlretrieve);
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				Double Salary = rs.getDouble("salary");
				Double bonus = rs.getDouble("bonus");
				System.out.println(id+" "+name+" "+Salary+" "+bonus);
			}
		}

}
