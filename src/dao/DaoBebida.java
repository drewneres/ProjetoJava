package dao;
import cedd.ConectaBD;
import model.Bebida;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author andsu
 */
public class DaoBebida {
    Connection con = null;
    PreparedStatement pstm = null;
    ConectaBD cc = new ConectaBD();

    public List<Bebida> getBebida() {
        List<Bebida> listaBebida = new ArrayList();
        ResultSet rs = null;
        con = cc.coneccao();
        try {
            pstm = con.prepareStatement("SELECT * FROM bebida", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = this.pstm.executeQuery();
            if (rs.first()) {
                do {
                    Bebida bb = new Bebida();
                    bb.codigoBebida = rs.getInt("codigo");
                    bb.nomeBebida = rs.getString("nome");
                    bb.precoBebida = rs.getDouble("preco");
                    bb.qtdeEstoque = rs.getInt("quantidade_estoque");
                    bb.tipoBebida = rs.getString("tipo_bebida");
                    listaBebida.add(bb);
                } while (rs.next());
                System.out.println("DADOS PEGOS COM SUCESSO");
            }
        } catch (SQLException e) {
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
            return listaBebida;
        }
    }

    public void adcionarBebida(Bebida bb) {
        con = cc.coneccao();
        try {
            pstm = con.prepareStatement("INSERT INTO bebida(nome, quantidade_estoque, tipo_bebida, preco) VALUES(?, ? , ?, ?)");
            pstm.setString(1, bb.nomeBebida);
            pstm.setInt(2, bb.qtdeEstoque);
            pstm.setString(3, bb.tipoBebida);
            pstm.setDouble(4, bb.precoBebida);
            pstm.execute();
        } catch (SQLException e) {
            System.err.println("ERRO AO ADCIONAR BEBIDA ::" + e);
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

    public void editarBebida(Bebida bb) {
        con = cc.coneccao();
        try {
            pstm = con.prepareStatement("UPDATE bebida SET nome=?, quantidade_estoque=?, tipo_bebida=?, preco=? WHERE codigo=?");
            pstm.setString(1, bb.nomeBebida);
            pstm.setInt(2, bb.qtdeEstoque);
            pstm.setString(3, bb.tipoBebida);
            pstm.setDouble(4, bb.precoBebida);
            pstm.setInt(5, bb.codigoBebida);
            pstm.executeUpdate();
        } catch (SQLException e) {
            System.err.println("ERRO AO RDITAR BEBIDA ::" + e);
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

    public void excluirBebida(int codigo) {
        con = cc.coneccao();
        try {
            pstm = con.prepareStatement("DELETE FROM bebida WHERE codigo = ?");
            pstm.setInt(1, codigo);
            pstm.executeUpdate();
        } catch (SQLException e) {
            System.err.println("ERRO AO EDITAR BEBIDA ::" + e);
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
    
    public boolean verificarCodBebida(int codio){
        con = cc.coneccao();
        ResultSet rs = null;
        try{
            pstm = con.prepareStatement("SELECT codigo FROM bebida WHERE codigo = ?");
            pstm.setInt(1, codio);
            rs = this.pstm.executeQuery();
            boolean result = rs.next();
            return result;
        }catch (SQLException e) {
            System.err.println("ERRO AO CONECTAR DADOS ::" + e);
            return false;
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
    }
    
    public void atualizaQtdeEstoque(int cod, int novaQuantidade){
        con = cc.coneccao();
        try{
            pstm = con.prepareStatement("UPDATE bebida SET quantidade_estoque=? WHERE codigo=?");
            pstm.setInt(1, novaQuantidade);
            pstm.setInt(2, cod);
            pstm.executeUpdate();
        }catch (SQLException e) {
            System.err.println("ERRO AO EDITAR BEBIDA ::" + e);
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
    
    public Bebida getBebidaByCodigo(int codi){
        con = cc.coneccao();
        ResultSet rs = null;
        Bebida bb = new Bebida();
        try{
            pstm = con.prepareStatement("SELECT * FROM bebida WHERE codigo = ?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            pstm.setInt(1, codi);
            rs = this.pstm.executeQuery();
            if (rs.first()) {
                do {
                    bb.codigoBebida = rs.getInt("codigo");
                    bb.nomeBebida = rs.getString("nome");
                    bb.precoBebida = rs.getDouble("preco");
                    bb.qtdeEstoque = rs.getInt("quantidade_estoque");
                    bb.tipoBebida = rs.getString("tipo_bebida");
                } while (rs.next());
            }
        } catch (SQLException e) {
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
            return bb;
        }
    }
    
    public List<Bebida> histCompra(int id){
        List<Bebida> listaB = new ArrayList();
        con = cc.coneccao();
        ResultSet rs = null;
        try{
            pstm = con.prepareStatement("SELECT * FROM bebida WHERE codigo = ?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            pstm.setInt(1, id);
            rs = this.pstm.executeQuery();
            if(rs.first()){
                do{
                    Bebida bb = new Bebida();
                    bb.nomeBebida = rs.getString("nome");
                    bb.tipoBebida = rs.getString("tipo_bebida");
                    listaB.add(bb);
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
            return listaB;
        }
    }
    
    public List<Bebida> pegaBebidaViaTipo(String tipo){
        List<Bebida> listaB = new ArrayList();
        con = cc.coneccao();
        ResultSet rs = null;
        try{
            pstm = con.prepareStatement("SELECT * FROM bebida WHERE tipo_bebida = ?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            pstm.setString(1, tipo);
            rs = this.pstm.executeQuery();
            if(rs.first()){
                do{
                    Bebida bb = new Bebida();
                    bb.nomeBebida = rs.getString("nome");
                    bb.precoBebida = rs.getDouble("preco");
                    bb.qtdeEstoque = rs.getInt("quantidade_estoque");
                    listaB.add(bb);
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
            return listaB;
        }
    }
    
    public int pegaCodBebida(String nome, double preco){
        con = cc.coneccao();
        ResultSet rs = null;
        int codi = -1;
        try{
            pstm = con.prepareStatement("SELECT * FROM bebida WHERE nome = ? AND preco = ?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            pstm.setString(1, nome);
            pstm.setDouble(2, preco);
            rs = this.pstm.executeQuery();
            if(rs.first()){
                do{
                    Bebida bb = new Bebida();
                    codi = bb.codigoBebida = rs.getInt("codigo");
                }while(rs.next());
            }
        }catch (SQLException e) {
            System.err.println("ERRO AO BUSCAR CODIGO DA BEBIDA ::" + e);
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
            return codi;
        }
    }
}
