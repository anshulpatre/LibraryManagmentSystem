/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyConn;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author anshu
 */
public class dataCon {
    public static void main(String[] args) {
        Connection con;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","123456");
            System.out.println("Connection created");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
