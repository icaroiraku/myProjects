
package br.com.atividade3.controle;
import br.com.atividade3.modelo.Livro;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean (name="bean")
@SessionScoped
public class LivroBean {
    private Livro livro;
    private List livros;


public LivroBean(){
    livro=new Livro();
    livros=new ArrayList<Livro>();
    
}

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public List getLivros() {
        return livros;
    }

    public void setLivros(List livros) {
        this.livros = livros;
    }
public void adicionar(){
        livros.add(livro);
        livro = new Livro();
    }
    
}

