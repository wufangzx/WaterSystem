package dao;

import util.DbUtil;

import java.sql.Connection;
/*创建数据库连接对象，所有于适用数据库都用这个对象

 */
public class BaseDao {
    public static Connection con=new DbUtil().getCon();
}
