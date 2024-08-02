package DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DTO.MemberDTO;

public class MemberDAO extends DBConnect {  // ȸ�� ���� �����ͺ��̽� �۾� �ϴ� Ŭ����
	
	public boolean login( String id, String pw) { // �α��� ó��
		String sql="select * from member where user_id=? and user_password=?";
		
		try {
			pt = conn.prepareStatement(sql);
			pt.setString(1, id);
			pt.setString(2, pw);
			rs = pt.executeQuery();// ����ڰ��Է��� ���̵� ����� �����Ѵٸ� �����ְ�
			                       // ��ġ�ϴ� ���� ������  �ƹ����� ����.
			if( rs.next() ) {
				return true;
			}
		}catch(SQLException e) {
			System.out.println("ȸ�� �α��� ��ȸ �� �����߻�");
		}
		
		return false;
		
	}
	
	
	
	public void save(MemberDTO member) { // ȸ������ ���� member ���̺� ����
		
		String sql="insert into member(user_id, user_password, user_email, user_name) "
				+" values(?,?,?,?)";
		
		try {
			pt = conn.prepareStatement(sql);
			pt.setString(1, member.getUserId());
			pt.setString(2, member.getUserPassword());
			pt.setString(3, member.getUserEmail());
			pt.setString(4, member.getUserName());
			pt.executeUpdate(); 
			
		}catch(SQLException e) {
			System.out.println("ȸ������ member���̺� ���� ����");
			e.printStackTrace();
		}
	}



	public List<String> findAllUserId() { // ȸ������ �� ��ü ���̵� ��ȸ
		
		String sql ="select user_id from member";
		
		List<String> list = new ArrayList<>();
		try {
			pt = conn.prepareStatement(sql);
			rs = pt.executeQuery();
			while( rs.next() ) {
				list.add( rs.getString("user_id") );
			}
			
			
		}catch(SQLException e) {
			System.out.println("��ü ���̵� ��ȸ ����");
			e.printStackTrace();
		}
		
		
		return list;
	}

}