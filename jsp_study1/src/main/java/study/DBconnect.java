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

	 	// newMem ��ü�� �����͸� �����ͺ��̽��� ����
	 	// 1. �����ͺ��̽� ����̹� �ε�
	 	// 2. �����ͺ��̽� ���� ����
	 	
	 	try{
	 		Class.forName("com.mysql.cj.jdbc.Driver");
	 	}catch(Exception e){
	 		System.out.println("����̹� �ε� ����");
	 	}

	 // ���� ����
	 
	 	String user="smy2363";
	 	String password="1234";
	 	String url="jdbc:mysql://localhost:6000/smy2363";

	 	try{conn = DriverManager.getConnection(url, user, password);
	 		
	 	}catch(SQLException e){
	 		System.out.println("���ӽ���");
	 	}
	 	
		
	}
}
