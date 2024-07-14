package java0709_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class BoardDAO {
	private Connection conn; // �����ͺ��̽� �������� ����
	private Statement st; // SQL��ɾ� ���ް� ��� �ޱ�
	private PreparedStatement pt; // SQL��ɾ� ���ް� ��� �ޱ�
	private ResultSet rs;// ������ ��ȸ ��� ����
	
	public BoardDAO() {
		DriverLoad(); // �����ͺ��̽� ����̹� �ε�
		Connect(); // �����ͺ��̽� ����
	}
	
	// test_board ���̺��� ������ �����ͼ� BoardŬ���� ��ü�� �����ϱ�
	public Board[] findByAll() {
		Board[] list = new Board[7]; // BoardŬ���� ��ü 7�� �����ϱ� ���� �迭
		
		String sql = "select * from test_board";//sql���ǹ�, ������
		
		// select ���� - executeQuery �޼��� , 
		// insert,update,delete ���� - executeUpdate �޼���
		try {
			st = conn.createStatement(); // statement����
			rs = st.executeQuery(sql);
			int i=0; // �迭�� �ε���
			while(rs.next()) {
				list[i] = new Board(  rs.getInt("board_id") ,
						rs.getString("title"), rs.getString("writer"),
						rs.getString("content"), rs.getInt("hit") );
				i++;
			}
			
		}catch(Exception e) {
			System.out.println("������ �������� ����");
		}
		
		return list;
	}
	
	
	
	
	
	private void DriverLoad() { // ����̹� �ε�
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			System.out.println("����̹� �ε� ���� ");
		}
		
	}
	private void Connect() { // �����ͺ��̽� ����
		String username = "melon";
		String password = "1234";
		String url="jdbc:mysql://localhost:3306/melon";
		
		try {
			conn = DriverManager.getConnection(url,username,password);
		}catch(Exception e) {
			System.out.println("���� ����");
		}
	}
	
}



/*
	Connection , Statement �Ǵ� PreparedStatement , ResulSet
	�������� �ʿ�
	
	1. �����ͺ��̽��� �����ϱ����� ����̹� �ε�
	   (mysql 5���� ���� - com.mysql.cj.jdbc.Driver 
	    5���� ���� - com.mysql.jdbc.Driver
	    
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    
	    
	2. �����ͺ��̽��� ���� �ϱ�
	   �����ͺ��̽� ������, ��й�ȣ, �ּ�
	   conn = DriverManager.getConnection( �ּ�, ������, ��й�ȣ );
	   
	    ������ �õ��� ����� Connection�� ���������� ����
	
	3. conn�� ���ؼ� Statement �Ǵ� PreparedStatement�� ��ü �����Ͽ�
	   SQL��ɾ� ������
 */