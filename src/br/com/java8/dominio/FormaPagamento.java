package br.com.java8.dominio;

public enum FormaPagamento {
    CARTAO("cartão"),
    DINHEIRO("dinheiro");

    private String descricao;

    FormaPagamento(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}
