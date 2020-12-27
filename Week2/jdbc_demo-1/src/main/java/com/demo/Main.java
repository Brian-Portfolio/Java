package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
public class Main {
	
	public static void main(String[] args) {
		//System.out.println("Hello world with Maven");
		Connection connection = null;
		try {
			//Step 1 - Load Driver 
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Loaded Successfully");
			
			//Step 2 - Open Connection(URL, username, password)
			String url ="jdbc:postgresql://localhost:5432/postgres";
			String username="postgres";
			String password="Aguilar10";
			connection=DriverManager.getConnection(url, username, password);
			System.out.println("Connection Success");
			
			//Step 3 - Create Statement
			Statement statement=connection.createStatement();
			String sql="select player_id, player_name, team_id, player_age, state_id, jersey_no, manager_id, position_id from test.player";
			
			//Step 4 - Execute Query
			ResultSet resultSet = statement.executeQuery(sql);
			System.out.println("Query executed");
			
			//Step 5 - Process Results
			while(resultSet.next()) {
				System.out.println("player_id : "+resultSet.getInt("player_id"));
				System.out.println("player_name : "+resultSet.getString("player_name"));
				System.out.println("team_id : "+resultSet.getInt("team_id"));
				System.out.println("player_age : "+resultSet.getInt("player_age"));
				System.out.println("state_id : "+resultSet.getInt("state_id"));
				System.out.println("jersey_no : "+resultSet.getInt("jersey_no"));
				System.out.println("manager_id : "+resultSet.getInt("manager_id"));
				System.out.println("position_id : "+resultSet.getInt("position_id"));
			}
			System.out.println("Results Processed");
			
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}finally {
			try {
				//Step 6 - Close Connection
				connection.close();
				System.out.println("Connection Closed");
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
	}
}
