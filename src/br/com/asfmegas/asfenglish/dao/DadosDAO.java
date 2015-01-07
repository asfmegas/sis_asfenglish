package br.com.asfmegas.asfenglish.dao;

import br.com.asfmegas.asfenglish.bean.Dados;
import br.com.asfmegas.asfenglish.util.CreateConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
    
    public List<Dados> pesquisar(String nome){
        String sql = "select * from dados where palavra like ?";
        try{
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.execute();
            
            ResultSet rs = stmt.executeQuery();
            List<Dados> listaDados = new ArrayList<>();
            while(rs.next()){
                Dados d = new Dados();
                d.setId(rs.getInt("id"));
                d.setPalavra(rs.getString("palavra"));
                d.setTexto(rs.getString("texto"));
                listaDados.add(d);
            }
            stmt.close();
            return listaDados;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao listar dados\n"+e.getMessage());
        }
        return null;
    }
    
    public void apagar(Dados dados){
        String sql = "delete from dados where id = ?";
        try{
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, dados.getId());
            stmt.execute();
            stmt.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao apagar dados\n"+e.getMessage());
        }
    }
    
    public void alterar(Dados dados){
        String sql = "update dados set palavra = ?,texto = ? where id = ?";

        try{
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, dados.getPalavra());
            stmt.setString(2, dados.getTexto());
            stmt.setInt(3, dados.getId());
            
            stmt.execute();
            
            stmt.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao salvar dados\n"+e.getMessage());
        }
    }
}
