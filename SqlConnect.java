/**
 * 该部分主要用于与数据库建立连接
 */

import java.sql.*;
import java.util.Scanner;
import static java.sql.DriverManager.getConnection;

public class SqlConnect {
    public Connection SqlConnect() {

        Connection dbConn = null;
        /*
        注意dburl中需要修改的部分仅为数据库的名称
         */
        String dbURL = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=My_first_database";
        try {
            //1.加载驱动
            /*
             * 第一次加载类：执行静态代码块（完成驱动的注册）
             *
             * 在高版本的jar包中会自动到指定的位置找到驱动的路径，所以Class.forname()可以省略
             * */
            /**
             * 注意此处的需要修改的部分仅为getConnection函数中的用户名和密码
             */
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //2.连接
            dbConn = DriverManager.getConnection(dbURL, "sa", "123456");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("连接数据库失败！");
        }
        return dbConn;
    }
}
