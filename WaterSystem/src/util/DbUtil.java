package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
	
	public static void main(String[] args) {
		DbUtil dbUtil=new DbUtil();
		try {
			dbUtil.getCon();
			System.out.println("连接成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("连接失败");
		}
	}
}
