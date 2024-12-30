package controler;
import model.Bebida;
import dao.DaoBebida;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import view.FrmTelaCadastroBebidas;
/**
 *
 * @author andsu
 */
public class ControllerBebida {
    DaoBebida dao = new DaoBebida();
    List<Bebida> lista = new ArrayList();
    
    public void adcionarBebida(Bebida bb){
        if(bb.precoBebida!=0 && !bb.nomeBebida.equals("") && bb.qtdeEstoque!=-1 && !bb.tipoBebida.equals("") ){
            dao.adcionarBebida(bb);
            System.out.println("BEBIDA ADCIONADA COM SUCESSO");
        }
    }
    
    public void editarBebida(Bebida bb){
        if(bb.precoBebida!=0 && bb.codigoBebida != 0 && !bb.nomeBebida.equals("") && bb.qtdeEstoque!=-1 && !bb.tipoBebida.equals("") ){
            dao.editarBebida(bb);
            System.out.println("BEBIDA EDITADA COM SUCESSO");
        }
    }
    
    public void excluirBebida(int codigo){
        int confirm = JOptionPane.showConfirmDialog(null, "Deseja realmente remover a bebida? ", "Confirme", JOptionPane.YES_NO_OPTION);
        switch(confirm){
            case 0: 
                dao.excluirBebida(codigo);
                JOptionPane.showMessageDialog(null, "Excluído com sucesso");
                break;
               
            case 1:
                JOptionPane.showMessageDialog(null, "Excluído com sucesso!!!");
                break;
        }
    }
    
    public boolean verificarCodBebida(int cod){
        boolean func = dao.verificarCodBebida(cod);
        return func;
    }
    
    public List<Bebida> pegaBebida(){
        lista.clear();
        lista = dao.getBebida();
        return lista;
    }
    
    public Bebida pegabebidaCod(int cod){
        Bebida b = new Bebida();
        b = dao.getBebidaByCodigo(cod);
        return b;
    }
    
    public void atualizarQuantidadeBebida(int cod, int novaQuantidade){
        if(novaQuantidade >= 0){
            dao.atualizaQtdeEstoque(cod, novaQuantidade);
        }
    }
    
    public List<Bebida> histCompra(int id){
        lista.clear();
        lista = dao.histCompra(id);
        return lista;
    }
    
    public List<Bebida> pegaViaTipo(String tipo){
        lista.clear();
        lista = dao.pegaBebidaViaTipo(tipo);
        return lista;
    }
    
    public int pegarCodBebida(String nome, double preco){
        int codigo = dao.pegaCodBebida(nome, preco);
        return codigo;
    }
}
