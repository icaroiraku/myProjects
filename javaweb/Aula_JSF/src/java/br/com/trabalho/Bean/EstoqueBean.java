
package br.com.trabalho.Bean;

import br.com.trabalho.modelo.Categoria;
import br.com.trabalho.modelo.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean (name="bean")
public class EstoqueBean {
    private Produto produto;
    private Categoria categoria;
    private List<Produto> listaProd;
    private List<Categoria> listaCat;

public EstoqueBean(){
    produto = new Produto();
    categoria = new Categoria();
    listaProd = new ArrayList<>();
    listaCat = new ArrayList<>();
}

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Produto> getListaProd() {
        return listaProd;
    }

    public void setListaProd(List<Produto> listaProd) {
        this.listaProd = listaProd;
    }

    public List<Categoria> getListaCat() {
        return listaCat;
    }

    public void setListaCat(List<Categoria> listaCat) {
        this.listaCat = listaCat;
    }

     public void adicionarProduto(){
        listaProd.add(produto);
        produto = new Produto();
    }
     
     public void adicionarCategoria(){
         listaCat.add(categoria);
         categoria = new Categoria();
     }
     
     

}



