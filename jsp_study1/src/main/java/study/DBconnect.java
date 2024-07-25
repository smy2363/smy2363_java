package study;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;

public class DBconnect {
	public Connection conn;
	public PreparedStatement pt;
	public ResultSet rs;
	public DBconnect() {
		dblink();
	}
	private void dblink() {

	 	// newMem 객체의 데이터를 데이터베이스에 저장
	 	// 1. 데이터베이스 드라이버 로드
	 	// 2. 데이터베이스 계정 접속
	 	
	 	try{
	 		Class.forName("com.mysql.cj.jdbc.Driver");
	 	}catch(Exception e){
	 		System.out.println("드라이버 로드 실패");
	 	}

	 // 계정 접속
	 
	 	String user="smy2363";
	 	String password="1234";
	 	String url="jdbc:mysql://localhost:6000/smy2363";

	 	try{conn = DriverManager.getConnection(url, user, password);
	 		
	 	}catch(SQLException e){
	 		System.out.println("접속실패");
	 	}
	 	
		
	}
}
