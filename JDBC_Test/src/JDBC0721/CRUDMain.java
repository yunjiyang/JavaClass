package JDBC0721;

public class CRUDMain {

	public static void main(String[] args) {
		// DBConnection클래스 타입의 conn객체 생성
		DBConnection conn = new DBConnection();
		
		// DB에 접속하는 DBConnect()메소드 호출
		conn.DBConnect();
		
		/////////////////////////////////////////
		
		// CRUDTest클래스 타입의 crud객체 생성
		CRUDTest crud = new CRUDTest();
		
		// DB에 insert하는 insert() 메소드 호출
		crud.insert();

	}

}
