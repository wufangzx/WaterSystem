package dao;

import model.User;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class UserDao extends BaseDao {
    public static User login(User ur) throws SQLException {
        String sql = " select * from user1 where name='" + ur.getName() + "' and password='" + ur.getPassword() + "'";

        //传SQL语句给数据库对象
        Statement statement = con.createStatement();

        ResultSet rs = statement.executeQuery(sql);
        User ResultUser = null;
        if (rs.next()) {
            ResultUser = new User();
            ResultUser.setId(rs.getInt("id"));
            ResultUser.setName(rs.getString("name"));
            ResultUser.setPassword(rs.getString("password"));


        }


        return ResultUser;

    }

    public String UserChangePassword(User us, String newpassword) throws SQLException {
        String sql = " select * from user1 where name='" + us.getName() + "' and password='" + us.getPassword() + "'";
        //传SQL语句给数据库对象
        Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        User ResultUser = null;
        if (!rs.next()) {
            String ReString = "旧密码错误";
            return ReString;
        }


        String Restring = "密码修改失败";
        int id = 0;
        String Sql = "update user1 set password=? where id=?";
        PreparedStatement pst = con.prepareStatement(Sql);
        pst.setString(1, newpassword);
        pst.setInt(2, us.getId());
        int rst = pst.executeUpdate();
        if (rst > 0) {
            Restring = "密码修改成功";

        }

        return Restring;
    }

}
