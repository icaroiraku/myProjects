
package br.com.orcamento.bean;

import br.com.orcamento.modelo.Item;
import br.com.orcamento.modelo.NotaFiscal;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean(name = "bean")
public class OrcamentoBean {
    
    private NotaFiscal nota;
    private Item item;
    private List<Item> itens;
    
    //construtor para inicializar os objetos
    public OrcamentoBean(){
            nota = new NotaFiscal();
            item = new Item(nota);
            itens = new ArrayList<>();
    }
    
    //get e set

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

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
    
    
    public void adicionarItem(){
        itens.add(item);
        item = new Item(nota);
    }
    
}
