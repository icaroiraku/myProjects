
package br.com.atividade5.controle;

import br.com.atividade5.modelo.Pessoa;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean
public class BandaBean {
    
    //declaração dos objetos da classe pessoa
    private Pessoa integrante;
    private List<Pessoa> banda;
    
    //construtor 
    public BandaBean(){
        integrante = new Pessoa();
        banda = new ArrayList<>();
    }
    
    //get e set
    public Pessoa getIntegrante() {
        return integrante;
    }

    public void setIntegrante(Pessoa integrante) {
        this.integrante = integrante;
    }

    public List<Pessoa> getBanda() {
        return banda;
    }

    public void setBanda(List<Pessoa> banda) {
        this.banda = banda;
    }
    
    //método adicionar que será invocado quando
    //na ação (action) do botão 
    public void adicionar(){
        banda.add(integrante);
        integrante = new Pessoa();
    }
    
}//fim da classe
