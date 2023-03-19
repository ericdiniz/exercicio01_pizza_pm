import javax.naming.directory.InvalidAttributesException;

public class Main {
    public static void main(String[] args) throws InvalidAttributesException {
        Pizza pizza = new Pizza();
        Pedido pedido = new Pedido();
        Pizza pizza2 = new Pizza(8);

        for (int i = 0; i < 6; i++) {
            pedido.adicionarPizzaNoPedido(pizza);
        }
        pedido.adicionarPizzaNoPedido(pizza2);
        System.out.println(pedido.exibirCadaDescECadaValorPizza());

        Pedido pedido2 = new Pedido();
        pedido2.adicionarPizzaNoPedido(pizza2);
        System.out.println(pedido2.exibirCadaDescECadaValorPizza());

    }
}