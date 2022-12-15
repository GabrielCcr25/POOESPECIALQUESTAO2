package br.com.Questao2POO;

public class PedidoItens extends Pedido {

    private int qtdeItensPedido;
    private int vrItensPedido;

    public PedidoItens() {

        this.qtdeItensPedido = qtdeItensPedido;
        this.vrItensPedido = vrItensPedido;
    }


    public int getQtdeItensPedido() {
        return qtdeItensPedido;
    }

    public void setQtdeItensPedido(int qtdeItensPedido) {
        this.qtdeItensPedido = qtdeItensPedido;
    }

    public int getVrItensPedido() {
        return vrItensPedido;
    }

    public void setVrItensPedido(int vrItensPedido) {
        this.vrItensPedido = vrItensPedido;
    }
    public int atualizaEstoque(){
        return qtdeItensPedido;
    }


}
