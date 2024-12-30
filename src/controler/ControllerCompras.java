package controler;
import model.Compras;
import dao.DaoCompras;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ControllerCompras {
    DaoCompras dao = new DaoCompras();
    List<Compras> lista = new ArrayList();
    
    public void adcionarCompra(Compras co){
        dao.novaCompra(co);
    }
    
    public void excluirCompra(int id){
        int confirm = JOptionPane.showConfirmDialog(null, "Deseja realmente remover a bebida? ", "Confirme", JOptionPane.YES_NO_OPTION);
        switch(confirm){
            case 0: 
                dao.excluirCompra(id);
                JOptionPane.showMessageDialog(null, "Excluído com sucesso");
                break;
               
            case 1:
                JOptionPane.showMessageDialog(null, "exclusao cancelada");
                break;
        }
    }
    
    public List<Compras> getCompras(){
    lista.clear();
    lista = dao.getCompras();
    return lista;
    }
    
    public List<Compras> hist(int id){
        lista.clear();
        lista = dao.getHistCompras(id);
        return lista;
    }
}
