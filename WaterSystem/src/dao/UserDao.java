package dao;

import model.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class UserDao extends BaseDao {
    public static User login(User ur) throws SQLException {
        String sql = " select * from user1 where name='"+ur.getName()+"' and password='"+ur.getPassword()+"'";

        //传SQL语句给数据库对象
        Statement statement=con.createStatement();

        ResultSet rs=statement.executeQuery(sql);
        User ResultUser = null;
        if (rs.next()) {
            ResultUser = new User();
            ResultUser.setId(rs.getInt("id"));
            ResultUser.setName(rs.getString("name"));
            ResultUser.setPassword(rs.getString("password"));


        }
                con.close();//关闭数据库

        return ResultUser;

    }

}
