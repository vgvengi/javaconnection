package file;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class Data {
	public static void insert() {
			String url="jdbc:mysql://127.0.0.1:3306/hel";
			String username="root";
			String password="6112@sql191";
			String Query="insert into user values(?,?,?)";
			Connection con =DriverManager.getConnection(url,username,password);
			PreparedStatement pst=con.prepareCall(Query);
			pst.setInt(1, 12);
			pst.setString(2,"Vengatesh");
			pst.setString(3,"2k19ece083@gamil.com");
			pst.executeUpdate();
			con.close();
		}
		public static void main(String[]args) {
			insert();
		}
	}
