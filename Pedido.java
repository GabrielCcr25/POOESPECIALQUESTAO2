package br.com.Questao2POO;

import java.util.ArrayList;

public class Pedido {
    private int numeroPedido;
    private time dataHoraPedido;
    private int precoTotal;
    private int statusPedido;

    ArrayList<Pedido> listaPedidos = new ArrayList<Pedido>();


    public Pedido() {
        this.numeroPedido = numeroPedido;
        this.dataHoraPedido = dataHoraPedido;
        this.precoTotal = precoTotal;
        this.statusPedido = statusPedido;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public time getDataHoraPedido() {
        return dataHoraPedido;
    }

    public void setDataHoraPedido(time dataHoraPedido) {
        this.dataHoraPedido = dataHoraPedido;
    }

    public int getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(int precoTotal) {
        this.precoTotal = precoTotal;
    }

    public int getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(int statusPedido) {
        this.statusPedido = statusPedido;
    }
    public int alterarStatus(){
        setStatusPedido(statusPedido);
        return statusPedido;
    }
    Pedido p1 = new Pedido();
    public void inserirPedido(){
        listaPedidos.add(p1);

    }
    public void excluirPedido(){
        listaPedidos.remove(p1);
    }
    public void consultarPedido(){
        System.out.println(p1);
    }


    ArrayList<PedidoItens> listaItensPedidos = new ArrayList<PedidoItens>();
    PedidoItens pedidoItens = new PedidoItens();
    public void inserirItensPedido(){
        listaItensPedidos.add(pedidoItens);
    }
    public int verificaEstoque(){
       listaPedidos.get(verificaEstoque());
       return pedidoItens.getQtdeItensPedido();
    }


}
