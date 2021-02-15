/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.Marca;
import Sql.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author edgar.haro
 */
public class MarcaDao {
    public boolean insertarMarca(Marca dto){
        try {
            Connection conexion = Conexion.getConnection();
            PreparedStatement ps = conexion.prepareStatement("insert into marca values(?,?)");
            ps.setInt(1,dto.getCodigoMarca());
            ps.setString(2, dto.getNombreMarca());
            ps.execute();
            ps.close();
            conexion.close();
            return true; 
        } catch (SQLException ex) {
            Logger.getLogger(MarcaDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
}
