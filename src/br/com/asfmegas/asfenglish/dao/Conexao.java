
package br.com.asfmegas.asfenglish.dao;

import br.com.asfmegas.asfenglish.util.CreateConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author asfmegas
 */
public class Conexao implements CreateConnection{

    @Override
    public Connection getConexao(String driver) {
        Connection con = null;
        try{
           con = DriverManager.getConnection(driver+"bdasfenglish","root","asfmegas18");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao se conectar com banco de dados\n"+e.getMessage());
        }
        return con;
    }
}
