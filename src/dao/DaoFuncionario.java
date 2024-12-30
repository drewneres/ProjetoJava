package dao;

import cedd.ConectaBD;
import model.Funcionario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author andsu
 */
public class DaoFuncionario {
    Connection con;
    PreparedStatement pstm = null;
    ConectaBD cc = new ConectaBD();

    public List<Funcionario> getFuncionario() {
        List<Funcionario> listaFuncionario = new ArrayList();
        ResultSet rs = null;
        con = cc.coneccao();

        try {
            pstm = con.prepareStatement("SELECT * FROM funcionario", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = this.pstm.executeQuery();
            if (rs.first()) {
                do {
                    Funcionario cl = new Funcionario();
                    cl.cpfFunc = rs.getString("cpf");
                    cl.emailFunc = rs.getString("email");
                    cl.idFunc = rs.getInt("id");
                    cl.nomeFunc = rs.getString("nome");
                    cl.senhaFunc = rs.getString("senha");
                    cl.usuarioFunc = rs.getString("usuario");
                    listaFuncionario.add(cl);
                } while (rs.next());
            }
            System.out.println("DADOS PEGOS COM SUCESSO");
            pstm.close();
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
            return listaFuncionario;
        }
    }

    public boolean loginFuncionario(String usuario, String senha) {
        ResultSet ss = null;
        con = new ConectaBD().coneccao();

        try {
            pstm = con.prepareStatement("SELECT * FROM funcionario WHERE usuario = ? AND senha = ?");
            pstm.setString(1, usuario);
            pstm.setString(2, senha);
            ss = pstm.executeQuery();
            boolean result = ss.next();
            return result;
        } catch (SQLException e) {
            System.err.println("ERRO AO CONECTAR DADOS ::" + e);
            return false;
        } finally {
            try {
                if (ss != null) {
                    ss.close();
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

    public void cadastroFuncionario(Funcionario cl) {
        con = new ConectaBD().coneccao();
        try {
            pstm = con.prepareStatement("INSERT INTO funcionario(nome, cpf, usuario, senha, email) VALUES (?,?,?,?,?)");
            pstm.setString(1, cl.nomeFunc);
            pstm.setString(2, cl.cpfFunc);
            pstm.setString(3, cl.usuarioFunc);
            pstm.setString(4, cl.senhaFunc);
            pstm.setString(5, cl.emailFunc);
            this.pstm.executeUpdate();
        } catch (SQLException e) {
            System.err.println("ERRO AO INSERIR DADOS ::" + e);
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

    public boolean verificarFuncionario(String usuario) {
        con = new ConectaBD().coneccao();
        try {
            ResultSet rs = null;
            pstm = con.prepareStatement("SELECT usuario FROM funcionario WHERE usuario = ?");
            pstm.setString(1, usuario);
            rs = this.pstm.executeQuery();
            boolean result = rs.next();
            return result;
        } catch (SQLException e) {
            System.err.println("ERRO AO CONECTAR DADOS ::" + e);
            return false;
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
    
    public void atualizarFuncionario(Funcionario clie){
        con = cc.coneccao();
        try{
            pstm = con.prepareStatement("UPDATE funcionario SET nome=?, cpf=?, usuario=?, senha=?, email=? WHERE id=?");
            pstm.setString(1, clie.nomeFunc);
            pstm.setString(2, clie.cpfFunc);
            pstm.setString(3, clie.usuarioFunc);
            pstm.setString(4, clie.senhaFunc);
            pstm.setString(5, clie.emailFunc);
            pstm.setInt(6, clie.idFunc);
            pstm.executeUpdate();
        }catch (SQLException e) {
            System.err.println("ERRO AO EDITAR DADOS DO FUNCIONARIO ::" + e);
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
    
}
