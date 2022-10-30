/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexiones;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author cgcr1
 */
public class conexion_usuarios {
    Connection conect = null;
    public Statement sentencia;
    public ResultSet resultado;
    public Connection conexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventario_usuarios","root","");
            sentencia = conect.createStatement();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al conectar la base de datos" + e);
        }
        return conect;
    }
}
