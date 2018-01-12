/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author kened
 */
public class Connection {
    static String bd = "programa";
    static String login = "root";
    static String password = "1234";
    static String url="jdbc:mysql://localhost/"+bd;
    
    Connection conn = null;
    
    public Connection(){
        try{
            Class.forName("com.mysqul.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(url,login,password);
            if(conn!=null){
                System.out.println("Conexion exitosa");
            }
        }
        catch(SQLException e){
            System.out.println(e);
        }
        catch(ClassNotFoundException e){
            System.out.println(e);
        }
    }
    
    public Connection getConnection(){
        return conn;
    }
    
    public void desconectar(){
        conn=null;
    }
}
