package dao;

import model.Worker;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class WorkerDao extends BaseDao {
    public static Worker login(Worker wr) throws SQLException {
        String sql = " select * from Worker where name='"+wr.getName()+"' and password='"+wr.getPassword()+"'";

        //传SQL语句给数据库对象
        Statement statement=con.createStatement();

        ResultSet rs=statement.executeQuery(sql);
        Worker Resultworker= null;
        if (rs.next()) {
            Resultworker = new Worker();
            Resultworker.setId(rs.getInt("id"));
            Resultworker.setName(rs.getString("name"));
            Resultworker.setPassword(rs.getString("password"));

        }
        con.close();//关闭数据库

       return Resultworker;
    }

}
