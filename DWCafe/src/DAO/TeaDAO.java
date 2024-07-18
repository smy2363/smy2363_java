
package DAO;

import java.sql.SQLException;
import java.util.HashMap;
import DTO.Tea;

public class TeaDAO extends ParentDAO{
	
	public HashMap<Integer, Tea> findAll(){
		HashMap<Integer, Tea> data = new HashMap<>();
		
		String sql="select * from tea";
		
		try {
			pt = conn.prepareStatement(sql);
			rs = pt.executeQuery();
		
			while(rs.next()) {
				data.put(rs.getInt("tea_di"),
					new Tea(rs.getInt("price"), rs.getString("name")) 
					);
						
			}
			
		}catch(SQLException e) {
			System.out.println("tea테이블 조회실패");
		}
		
		return data;
	}

}
