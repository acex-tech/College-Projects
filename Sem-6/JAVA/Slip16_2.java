import java.sql.*;

public class Slip16_2 {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps;
		
		// TODO Auto-generated method stub
		try 
		{
			Class.forName("org.postgresql.Driver");
			 con = DriverManager.getConnection(
	                    "jdbc:postgresql://localhost:5432/vjw",
	                    "tybcs",
	                    "123"
	            );			ps=con.prepareStatement("Select * from teacher where subject=?;");
			ps.setString(1, "JAVA");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				System.out.println("tno"+rs.getInt(1)+"\t tname :"+rs.getString(2)+"\tsub :"+rs.getString(3));
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
