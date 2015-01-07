package br.com.asfmegas.asfenglish.dao;

import br.com.asfmegas.asfenglish.bean.Dados;
import br.com.asfmegas.asfenglish.util.CreateConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author asfmegas
 */
public class DadosDAO {
    private Connection conexao;
    
    public DadosDAO() {
        Conexao con = new Conexao();
        this.conexao = con.getConexao(CreateConnection.DRIVER_MYSQL);
    }
    
    
    
    public void salvarDados(Dados dados){
        String sql = "insert into dados (palavra,texto) values (?,?)";

        try{
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, dados.getPalavra());
            stmt.setString(2, dados.getTexto());
            
            stmt.execute();
            
            stmt.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao salvar dados\n"+e.getMessage());
        }

    }
    
}
