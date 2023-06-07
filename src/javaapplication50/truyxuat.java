/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication50;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author admin
 */
public class truyxuat {
    private final Connection conn;
    public truyxuat() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlhocvien","root","");
    }
    public ResultSet GetTable(String sql) throws SQLException{
        ResultSet rs =null;
        Statement st = this.conn.createStatement();
        rs=st.executeQuery(sql);
        return rs;
    }
    
    public void ThemSuaXoa(String sql) throws SQLException{
        Statement st = this.conn.createStatement();
        st.executeUpdate(sql);
    }
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
        truyxuat tx = new truyxuat();
    }
}

