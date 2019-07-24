
package br.com.atividade2.controle;

import br.com.atividade2.modelo.Pessoa;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/*O ManagedBean neste caso é uma classe classe que delega 
  funções para cada view. É um elo de ligação entre a view
  e as classes java*/

@ManagedBean (name="bean")
/*significa que todos os objetos e atributos vinculados ao
ManagedBean, sobreviverão durante a toda a sessão do usuário
*/
@SessionScoped
public class PessoaBean {
    
    //declaração dos objetos da classe 
    private Pessoa pessoa;
    private List pessoas;
    
    //metodo construtor 
    /*o metodo construtor sempre tera o mesmo nome da classe
      pode receber parametros ou não
      neste caso o construtor esta sendo usado para instanciar (criar)
      os objetos
    */
    public PessoaBean(){
        pessoa = new Pessoa();
        pessoas = new ArrayList<Pessoa>();
    }
    
    //metodos get e set
     public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List getPessoas() {
        return pessoas;
    }

    public void setPessoas(List pessoas) {
        this.pessoas = pessoas;
    }
    
    
    //metodo adicionar
    public void adicionar(){
        pessoas.add(pessoa);
        pessoa = new Pessoa();
    }
    
}//fim da classe
