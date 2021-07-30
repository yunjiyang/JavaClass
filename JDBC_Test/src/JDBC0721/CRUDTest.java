package JDBC0721;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDTest {
	// CRUD
	// CREATE(생성)
	// READ(검색, 조회)
	// UPDATE(수정)
	// DELETE(삭제)
	
	Connection con;
	Statement stmt = null;
	
	
	public void insert() {
		// SQL문을 DB로 전송하는 역할
		Statement stmt = null;
		
		try {
			
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "YUNJI", "1234");
			stmt = con.createStatement();
			
			String sql = "INSERT INTO JAVASQL VALUES('자바이름')";
			
			int count = stmt.executeUpdate(sql);
			
			if(count > 0) {
				System.out.println("Insert Success!");
			} else {
				System.out.println("Insert Fail!");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Insert Fail SQLException!");
		}
		
		
		
	}

}
