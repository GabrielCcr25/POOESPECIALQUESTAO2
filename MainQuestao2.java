package br.com.Questao2POO;
import java.util.Scanner;
public class MainQuestao2 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Entre com o numero do pedido: ");
        int numeroPedido = ler.nextInt();
        System.out.println("Entre com a hora: ");
        String hora = ler.nextLine();
        System.out.println("Entre com o preco total: ");
        int precoTotal = ler.nextInt();
        System.out.println("Entre com o status do pedido: ");
        int statusPedido = ler.nextInt();

        Pedido p1 = new Pedido();

        PedidoItens pedidoItens1 = new PedidoItens();

        p1.listaPedidos.add(pedidoItens1);
        
    }
}
