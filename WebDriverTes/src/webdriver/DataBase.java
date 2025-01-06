package webdriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {
public static void main(String[] args) throws SQLException {
	
	Connection con=DriverManager.getConnection("jdbc:sqlserver://GURU\\SQLEXPRESS;databaseName=Guru","sa","guru@143");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from login");
	while(rs.next()){
		System.out.println(rs.getString("Id")+" "+rs.getString("Name")+" "+rs.getString("Course"));
	}
}
}
