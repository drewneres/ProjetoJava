package controler;

import cedd.ConectaBD;
import dao.DaoFuncionario;
import model.Funcionario;

import javax.swing.*;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class ControllerFuncionario {
    Connection con = new ConectaBD().coneccao();
    DaoFuncionario dao = new DaoFuncionario();
    List<Funcionario> lista = new ArrayList();


    public boolean verificarFuncionario(String usuario, String senha) {
        boolean func = dao.loginFuncionario(usuario, senha);
        return func;
    }

    public void cadastroFuncionario(Funcionario cl) {
        if (!cl.nomeFunc.equals("") && !cl.emailFunc.equals("") && !cl.senhaFunc.equals("") && !cl.usuarioFunc.equals("")) {
            dao.cadastroFuncionario(cl);
            System.out.println("CLIENTES CADASTRADOS COM SUCESSO");
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
        }
    }

    public boolean verificarUserFuncionario(String usuario) {
        boolean func = dao.verificarFuncionario(usuario);
        return func;
    }
    
    public List<Funcionario> pegaTudoFuncionario(){
        List<Funcionario> lista = new ArrayList();
        lista = dao.getFuncionario();
        return lista;
    }
    
    public void editarFuncionario(Funcionario clie){
        if (!clie.nomeFunc.equals("") && !clie.emailFunc.equals("") && !clie.senhaFunc.equals("") && !clie.usuarioFunc.equals("")) {
            dao.atualizarFuncionario(clie);
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
        }
    }
}
