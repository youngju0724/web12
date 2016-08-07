package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.spotVO;

public class spotDAO {
	
	public ArrayList<spotVO> getspotList(){
		
		ArrayList<spotVO> spotList = new ArrayList<spotVO>();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			Class.forName("com.mysql.jdbc.Driver");
			//String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String url = "jdbc:mysql://db12.ctrmjrtgka38.ap-northeast-2.rds.amazonaws.com:3306/db12";
			String user = "youngju";
			String password = "201202163";

			con = DriverManager.getConnection(url, user, password);

			StringBuilder sql = new StringBuilder();
			
			sql.append(" SELECT spot_name ");
			sql.append(" FROM spot_List ");

			pstmt = con.prepareStatement(sql.toString());


			rs = pstmt.executeQuery();
			
			while(rs.next()){
				spotVO spot = new spotVO();
				spot.setidspot(rs.getString("spot_name"));
			
				spotList.add(spot);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return spotList;
	}

}
