package dao;

import cedd.ConectaBD;
import model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DaoCliente {
    Connection con;
    PreparedStatement pstm = null;
    ConectaBD cc = new ConectaBD();

    public List<Cliente> getCliente() {
        List<Cliente> listaCliente = new ArrayList();
        ResultSet rs = null;
        con = cc.coneccao();

        try {
            pstm = con.prepareStatement("SELECT * FROM cliente", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = this.pstm.executeQuery();
            if (rs.first()) {
                do {
                    Cliente cl = new Cliente();
                    cl.cpfCliente = rs.getString("cpf");
                    cl.emailCliente = rs.getString("email");
                    cl.idCliente = rs.getInt("id");
                    cl.nomeCliente = rs.getString("nome");
                    cl.senhaCliente = rs.getString("senha");
                    cl.usuarioCliente = rs.getString("usuario");
                    listaCliente.add(cl);
                } while (rs.next());
            }
            System.out.println("DADOS PEGOS COM SUCESSO");
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
            return listaCliente;
        }
    }

    public boolean loginCliente(String usuario, String senha) {
        ResultSet ss = null;
        con = new ConectaBD().coneccao();

        try {
            pstm = con.prepareStatement("SELECT * FROM cliente WHERE usuario = ? AND senha = ?");
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

    public void cadastroCliente(Cliente cl) {
        con = new ConectaBD().coneccao();
        try {
            pstm = con.prepareStatement("INSERT INTO cliente(nome, cpf, usuario, senha, email) VALUES (?,?,?,?,?)");
            pstm.setString(1, cl.nomeCliente);
            pstm.setString(2, cl.cpfCliente);
            pstm.setString(3, cl.usuarioCliente);
            pstm.setString(4, cl.senhaCliente);
            pstm.setString(5, cl.emailCliente);
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

    public boolean verificarUsuario(String usuario) {
        con = new ConectaBD().coneccao();
        try {
            ResultSet rs = null;
            pstm = con.prepareStatement("SELECT usuario FROM cliente WHERE usuario = ?");
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

    public int idCliente(String usuario) {
        ResultSet rs = null;
        int idCliente = -1;
        con = cc.coneccao();
        try {
            pstm = con.prepareStatement("SELECT id FROM cliente WHERE usuario = ? ");
            pstm.setString(1, usuario);
            rs = this.pstm.executeQuery();
            if (rs.next()) {
                idCliente = rs.getInt("id");
                
            }
        } catch (SQLException e) {
            System.err.println("ERRO AO CONECTAR DADOS ::" + e);

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

        return idCliente;
    }
    
    public void atualizarCliente(Cliente clie){
        con = cc.coneccao();
        try{
            pstm = con.prepareStatement("UPDATE cliente SET nome=?, cpf=?, usuario=?, senha=?, email=? WHERE id=?");
            pstm.setString(1, clie.nomeCliente);
            pstm.setString(2, clie.cpfCliente);
            pstm.setString(3, clie.usuarioCliente);
            pstm.setString(4, clie.senhaCliente);
            pstm.setString(5, clie.emailCliente);
            pstm.setInt(6, clie.idCliente);
            pstm.executeUpdate();
        }catch (SQLException e) {
            System.err.println("ERRO AO EDITAR DADOS DO CLIENTE ::" + e);
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
