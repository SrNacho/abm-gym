/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abm;

import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Nacho
 */
public class Conns {

    Connection con;

    public void Insertar(String consulta) throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conns.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/gym?allowMultiQueries=true&rewriteBatchedStatements=true", "root", "");
            Statement stmt = con.createStatement();
            stmt.executeUpdate(consulta);
            JOptionPane.showMessageDialog(null, "Registro insertado");
        } catch (java.sql.SQLIntegrityConstraintViolationException ex) {
            JOptionPane.showMessageDialog(null, "Un registro con ese DNI ya existe");
            System.out.print(ex);
        }
    }

    public String Consultar(String consulta) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conns.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/gym", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(consulta);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return null;
    }

    public void Eliminar(String consulta) {
        String sql = "select distinct * FROM `anotados`,`fechas` WHERE dni=" + consulta + "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conns.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/gym", "root", "");
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Statement st = con.createStatement();
                String sqll = sql.replace("select distinct * FROM `anotados`,`fechas` WHERE dni=" + consulta + "", "DELETE from `anotados` WHERE dni=" + consulta + "");
                st.executeUpdate(sqll);
                JOptionPane.showMessageDialog(null, "Registro borrado");
            } else {
                // Quest not completed yet
                JOptionPane.showMessageDialog(null, "Registro inexistente");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public boolean ValNum(String num) {
        int c = 0;
        int m = 0;
        int t = 0;
        int p = num.length();
        for (int i = 0; i < num.length(); i++) {
            char b = num.charAt(i);
            int h = (int) b;
            if (h >= 48 && h <= 57) {
                c = c + 1;
            }
        }
        if (c == p && p != 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean valLetras(String str) {
        int c = 0;
        int ho = 0;
        int m = 0;
        int t = 0;
        int p = str.length();
        if (str.isBlank()) {
            return false;
        } else {
            for (int i = 0; i < str.length(); i++) {
                char b = str.charAt(i);
                int h = (int) b;
                if (h >= 65 && h <= 90) {
                    c = c + 1;
                } else if (h >= 97 && h <= 122) {
                    ho = ho + 1;
                }
            }
            if (c == p || ho == p && p != 0) {
                return true;
            } else {
                return false;
            }
        }
    }
    
    /*public void Modificacion(String dni){ 
    String sql = "select * from anotados where dni="+dni+"";
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/gym","root","");
            Statement stmt = con.createStatement();
            PreparedStatement pst=con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            if(rs.next()){
            modifi.setLabelText(rs.getString(1));
            
            //Modificacion.jLabel2.setText(rs.getString(3));
            //Modificacion.jLabel3.setText(rs.getString(4));
            //Modificacion.jLabel4.setText(rs.getString(5));
            }else {
                JOptionPane.showMessageDialog(null, "Producto no encontrado");
            }


        }catch (SQLException ex){
            Logger.getLogger(Modifi.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"No se pudo conectar a la base de datos");
        }
    }*/
}
