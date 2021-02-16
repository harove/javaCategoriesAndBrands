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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MarcaDao {
    public boolean insertarMarca(Marca dto){
        try {
            Connection conexion = Conexion.getConnection();
            PreparedStatement ps = conexion.prepareStatement("insert into marca (codigomarca,nombremarca) values(?,?)");
            ps.setInt(1,dto.getCodigoMarca());
            ps.setString(2, dto.getNombreMarca());
            ps.executeUpdate();
            ps.close();
            conexion.close();
            return true; 
        } catch (SQLException ex) {
            Logger.getLogger(MarcaDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean deleteMarca(int codigoMarca){
        try{
            Connection conexion = Conexion.getConnection();
            PreparedStatement ps = conexion.prepareStatement("delete from marca where codigomarca = ?");
            ps.setInt(1,codigoMarca );
            ps.execute();
            ps.close();
            conexion.close();
            return true;
        }catch(SQLException ex){
            Logger.getLogger(MarcaDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
        public List<Marca> listMarca(){
        try{
            List<Marca> list = new ArrayList<Marca>();
            Connection conexion = Conexion.getConnection();
            PreparedStatement ps = conexion.prepareStatement("select codigomarca,nombremarca from marca");
            ResultSet rs = ps.executeQuery();           
    
            while(rs.next()){
                Marca marca = new Marca();
                marca.setCodigoMarca(rs.getInt("codigomarca"));
                marca.setNombreMarca(rs.getString("nombremarca"));
                list.add(marca);
            }
            conexion.close();
            ps.close();
            return list;
        }catch(SQLException ex){
            Logger.getLogger(MarcaDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    
    
}
