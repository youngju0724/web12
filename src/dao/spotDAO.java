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
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "madang";
			String password = "madang";

			con = DriverManager.getConnection(url, user, password);

			StringBuilder sql = new StringBuilder();
			
			sql.append(" SELECT col ");
			sql.append(" FROM TABLE1");

			pstmt = con.prepareStatement(sql.toString());


			rs = pstmt.executeQuery();
			
			while(rs.next()){
				spotVO spot = new spotVO();
				spot.setCol(rs.getString("col"));
			
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
