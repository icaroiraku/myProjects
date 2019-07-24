
package br.com.orcamento.modelo;


public class Item {
    private int id;
    private String descricao;
    private String tipo;
    private double valor;
    private NotaFiscal nota;
    
    //construtor
    public Item(NotaFiscal nota){
        this.nota = nota;
    }
    
    //get e set

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public NotaFiscal getNota() {
        return nota;
    }

    public void setNota(NotaFiscal nota) {
        this.nota = nota;
    }
    
}
