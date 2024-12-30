package dao;
import cedd.ConectaBD;
import model.Compras;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author andsu
 */
public class DaoCompras {
    Connection con = null;
    PreparedStatement pstm = null;
    ConectaBD cc = new ConectaBD();
    
    public List<Compras> getCompras(){
        List<Compras> listaCompras = new ArrayList();
        ResultSet rs = null;
        con = cc.coneccao();
        try{
            pstm = con.prepareStatement("SELECT * FROM compras", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = this.pstm.executeQuery();
            if(rs.first()){
                do{
                    Compras co = new Compras();
                    co.codBebida = rs.getInt("codigo_bebida");
                    co.codCompra = rs.getInt("cod_compra");
                    co.diaCompra = rs.getString("dia_compra");
                    co.idCliente = rs.getInt("id_usuario");
                    co.precoBebida = rs.getInt("preco_bebida");
                    co.quantidade = rs.getInt("quantidade");
                    co.total = rs.getInt("total");
                    listaCompras.add(co);
                }while(rs.next());
            }
        }catch (SQLException e) {
            System.err.println("ERRO AO BUSCAR DADOS ::" + e);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException err) {
                System.err.println("Erro ao fechar a conexão de busca " + err);
            }
            return listaCompras;
        }  
    }
    
    public void novaCompra(Compras co){
        con = cc.coneccao();
        try{
            pstm = con.prepareStatement("INSERT INTO compras(id_usuario, codigo_bebida, quantidade, dia_compra, total, preco_bebida) VALUES (?,?,?,?,?,?)");
            pstm.setInt(1, co.idCliente);
            pstm.setInt(2, co.codBebida);
            pstm.setInt(3, co.quantidade);
            pstm.setString(4, co.diaCompra);
            pstm.setDouble(5, co.total);
            pstm.setDouble(6, co.precoBebida);
            pstm.execute();
        }catch (SQLException e) {
            System.err.println("ERRO AO ADCIONAR DADOS ::" + e);
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException err) {
                System.err.println("Erro ao fechar a conexão de busca " + err);
            }
        }  
    }
    
    public void excluirCompra(int id){
        con = cc.coneccao();
        try{
            pstm = con.prepareStatement("DELETE FROM compras WHERE cod_compra = ?");
            pstm.setInt(1, id);
            pstm.executeUpdate();
        }catch (SQLException e) {
            System.err.println("ERRO AO EXCLUIR DADOS ::" + e);
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException err) {
                System.err.println("Erro ao fechar a conexão de busca " + err);
            }
        }  
    }
    
    public List<Compras> getHistCompras(int id){
        con = cc.coneccao();
        ResultSet rs = null;
        List<Compras> listaC = new ArrayList();
        try{
            pstm = con.prepareStatement("SELECT * FROM compras WHERE id_usuario = ?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            if(rs.first()){
                do{
                    Compras co = new Compras();
                    co.codCompra = rs.getInt("cod_compra");
                    co.codBebida = rs.getInt("codigo_bebida");
                    co.diaCompra = rs.getString("dia_compra");
                    co.precoBebida = rs.getInt("preco_bebida");
                    co.quantidade = rs.getInt("quantidade");
                    co.total = rs.getInt("total");
                    listaC.add(co);
                }while(rs.next());
            }
        }catch (SQLException e) {
            System.err.println("ERRO AO BUSCAR DADOS ::" + e);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException err) {
                System.err.println("Erro ao fechar a conexão de busca " + err);
            }
        }
        return listaC;
    }
}
