import java.sql.*;
public class DataSql{
public static void insert()throws Exception{
	String url="jdbc:mysql://127.0.0.1:3306/ven";
	String username="root";
	String password="6112@sql191";
	String Query="insert into ten values(?,?,?)";
	Connection con =DriverManager.getConnection(url,username,password);
	PreparedStatement pst=con.prepareCall(Query);
	pst.setInt(1, 12);
	pst.setString(2,"Vengatesh");
	pst.setString(3,"2k19@gamil.com");
	pst.executeUpdate();
	con.close();
}
public static void main(String[]args) throws Exception {
	insert();
}
}
