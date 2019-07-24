
package br.com.hello.bean;

import br.com.hello.modelo.Pessoa;
import javax.faces.bean.ManagedBean;

@ManagedBean (name="mb")
public class HelloMB {
    
    private Pessoa pessoa;
    private String mensagem;
    
    //método construtor
    public HelloMB(){
        pessoa = new Pessoa();
    }

    //get e set do objeto pessoa e da String mensagem
    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
    //criar o método enviarMensagem
    public void enviarMensagem(){
        mensagem = "Hello World \n"+pessoa.getNome();
    }
    
}
