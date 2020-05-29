package Studing;

import java.sql.*;

public class Jodb1day {

    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/zzdata?useSSL=false","root","3333");
            stmt = conn.createStatement();
            String sql = "insert into emp (empno) values (7780)";
            stmt.executeUpdate(sql);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            if (stmt!=null) {
                try {
                    stmt.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (conn!=null) {
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}
