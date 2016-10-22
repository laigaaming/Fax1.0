package main.fx;

import java.sql.*;

import datetime.Datetime;
import util.DBUtil;

public class FXDB {
	public static int insertDB(String table, String scur, String tcur, double rate) {
		Connection conn = null;
		Statement stmt = null;
		int result = 0;
		Datetime datetime=new Datetime();
		String date=datetime.getDate();

		String sql = "insert into "+table+"(scur,tcur,rate,date) values('"+scur+"','"+tcur+"',"+rate+",'"+date+"')";
		System.out.println(sql);
		
		
		conn = DBUtil.getConnection();
		try {
			stmt = conn.createStatement();
			result=stmt.executeUpdate(sql);
//			System.out.println("regist result:"+result);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return result;
	}
	
	/*public static void main(String agrs[]) {
		insertDB("fx", "USD", "CNY", 6.4737);
	}*/
}
