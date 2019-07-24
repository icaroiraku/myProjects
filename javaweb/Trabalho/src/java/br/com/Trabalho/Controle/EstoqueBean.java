package br.com.Trabalho.Controle;
import br.com.Trabalho.modelo.Produto;
import br.com.Trabalho.modelo.Categoria;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean

public class EstoqueBean {
    private Produto produto;
    private Categoria categoria;
    
  
    private List<Produto> listProd;
    private List<Categoria>listCat;

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

    public List<Produto> getListProd() {
        return listProd;
    }

    public void setListProd(List<Produto> listProd) {
        this.listProd = listProd;
    }

    public List<Categoria> getListCat() {
        return listCat;
    }

    public void setListCat(List<Categoria> listCat) {
        this.listCat = listCat;
    }
    
    public void adicionarProduto(){
        listProd.add(produto);
        produto=new Produto();
    }
    
    public void adicionarCategoria(){
        listCat.add(categoria);
        categoria=new Categoria();
    }
    
    
}

