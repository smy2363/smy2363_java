package DAO;

import java.sql.SQLException;
import java.util.HashMap;

import DTO.Coffe;

public class CoffeDAO extends ParentDAO{

	public HashMap<Integer, Coffe> findAll(){
		HashMap<Integer, Coffe> data = new HashMap<>();
										   // desc - ��������, asc - ��������
		String sql="select * from coffe";  // coffe order by price desc;
		
		try {
			
			pt=conn.prepareStatement(sql);
			rs=pt.executeQuery(); // select - executeQuery, 
								  // insert update delete - executeUpdate
			
			while(rs.next()) {
				// rs.get������Ÿ��("�÷���")
				data.put(rs.getInt("coffe_id"),
					new Coffe(rs.getInt("price"), rs.getString("item_name"),
							rs.getBoolean("decaffein")) );
				
			}
			
			
		}catch(SQLException e) {
			System.out.println("coffe���̺� ��ȸ ����");
		}
		
		
		return data;
	}
}

