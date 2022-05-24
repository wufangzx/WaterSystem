package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static dao.BaseDao.con;

public class DbUtil {
	private String dbUrl="jdbc:sqlserver://localhost:1433;databaseName=test"; //
	private String dbUserName="sa"; //
	private String dbPassword="1234"; //
	private String jdbcName="com.microsoft.sqlserver.jdbc.SQLServerDriver"; //
	/*
	 */
	public Connection getCon(){
		try {
			Class.forName(jdbcName);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con = null;
		try {
			con = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	/**
	 *关闭数据库
	 * @param con
	 * @throws Exception
	 */
	public void closeCon(Connection con)throws Exception{
		if(con!=null){
			con.close();
		}
	}
	
	public static void main(String[] args) throws SQLException {
		DbUtil dbUtil=new DbUtil();
		try {
			dbUtil.getCon();
			System.out.println("1");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("0");
		}
//
//		String Sql = "update user1 set password=3 where name=4";
//		PreparedStatement pst = con.prepareStatement(Sql);
//		int rst=pst.executeUpdate();
//		if(rst>0)
//		{
//			System.out.println("2");
//
//		}
	}
}
