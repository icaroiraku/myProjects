
package br.com.atividade4.bean;
import br.com.atividade4.bean.OrcamentoBean;
import br.com.atividade4.controle.Item;
import br.com.atividade4.controle.NotaFiscal;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean(name="bean")
public class OrcamentoBean {
    private NotaFiscal nota;
    private Item item;
    private List<Item>itens;
    
    
    public OrcamentoBean(){
        nota=new NotaFiscal();
        item= new Item(nota);
        itens=new ArrayList<>();
    }

    public NotaFiscal getNota() {
        return nota;
    }

    public void setNota(NotaFiscal nota) {
        this.nota = nota;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public List<Item> getIntens() {
        return itens;
    }

    public void setIntens(List<Item> intens) {
        this.itens = intens;
        
    }
    public void adicionarItem(){
        itens.add(item);
        item = new Item(nota);
    }
    
}

