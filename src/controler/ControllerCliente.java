package controler;

import cedd.ConectaBD;
import dao.DaoCliente;
import model.Cliente;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author andsu
 */
public class ControllerCliente {
    DaoCliente dao = new DaoCliente();
    List<Cliente> lista = new ArrayList();


    public boolean verificarCliente(String usuario, String senha) {
        boolean func = dao.loginCliente(usuario, senha);
        return func;
    }

    public void cadastroCliente(Cliente cl) {
        if (!cl.nomeCliente.equals("") && !cl.emailCliente.equals("") && !cl.senhaCliente.equals("") && !cl.usuarioCliente.equals("")) {
            dao.cadastroCliente(cl);
            System.out.println("CLIENTES CADASTRADOS COM SUCESSO");
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
        }
    }

    public boolean verificarUserCliente(String usuario) {
        boolean func = dao.verificarUsuario(usuario);
        return func;
    }
    
    public int pegaIdCliente(String usuario){
        int idC = dao.idCliente(usuario);
        return idC;
    }
    
    public List<Cliente> pegaTudoCliente(){
        List<Cliente> lista = new ArrayList();
        lista = dao.getCliente();
        return lista;
    }
    
    public void editarCliente(Cliente clie){
        if (!clie.nomeCliente.equals("") && !clie.emailCliente.equals("") && !clie.senhaCliente.equals("") && !clie.usuarioCliente.equals("")) {
            dao.atualizarCliente(clie);
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
        }
    }
}
