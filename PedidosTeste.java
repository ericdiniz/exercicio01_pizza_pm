
// import static org.junit.jupiter.api.Assertions.assertThrows;
//import javax.naming.directory.InvalidAttributesException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import javax.naming.directory.InvalidAttributesException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PedidosTeste {
     /*
      * CLASSE FEITA A PARTIR DE TDD
      * DATA: 18/03/23
      * FEITA POR: ERIC RODRIGUES DINIZ
      */

     Pedido pedido1;
     Pedido pedido2;
     Pizza pizza;
     Pizza pizza2;

     @BeforeEach
     public void prepare() throws InvalidAttributesException {
          pedido1 = new Pedido();
          pizza = new Pizza(2);
          pedido2 = new Pedido();
          pizza2 = new Pizza();
     }

     @Test
     /**
      * Teste para realizar um pedido entre 1 e 10 pizzas
      * sem parametros
      */
     public void realizarUmPedidoNovo() throws InvalidAttributesException {
          assertTrue(pedido1.adicionarPizzaNoPedido(pizza));
     }

     @Test
     /**
      * Teste para exibir a descricao de cada pizza.
      */
     public void exibirDescricaoeValorCadaPizza() throws InvalidAttributesException {
          pedido1.adicionarPizzaNoPedido(pizza);
          assertTrue(pedido1.exibirCadaDescECadaValorPizza().contains("VALOR FINAL DO PEDIDO -> R$33"));
     }

     @Test
     /**
      * Teste para exibir a soma total do pedido.
      * sem parametros
      */
     public void exibirSomaTotal() throws InvalidAttributesException {
          for (int i = 0; i < 4; i++) {
               pedido1.adicionarPizzaNoPedido(pizza);
          }
          assertEquals(132, pedido1.exibirValorTotalDoPedido());
     }

     @Test
     /**
      * Teste para garantir que cada pedido contém um id diferente do anterior.
      */
     public void cadaIdDeveSerDiferenteDoAnterior() {
          int a = pedido1.getId();
          int b = pedido2.getId();
          System.out.println(a);
          System.out.println(b);
          assertTrue(a != b);
     }

     @Test
     /**
      * Teste para alterar um pedido.
      */
     public void alterarPedido() throws InvalidAttributesException {
          pedido1.adicionarPizzaNoPedido(pizza);
          assertEquals(33, pedido1.exibirValorTotalDoPedido());
          int indexPizza = 0, quantidadeDeAdicionais = 1;
          pedido1.alterarPedido(indexPizza, quantidadeDeAdicionais);
          assertEquals(29, pedido1.exibirValorTotalDoPedido());
     }

}
