import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.naming.directory.InvalidAttributesException;

public class Pedido {
    /*
     * CONTINUAÇÃO DO EXERCICIO 1
     * CLASSE FEITA A PARTIR DE TDD
     * DATA: 18/03/23
     * FEITA POR: ERIC RODRIGUES DINIZ
     */

    // CONSTANTES
    private final int quantMaxPorPedido = 10;
    Scanner teclado = new Scanner(System.in);
    // ATRIBUTOS
    private int id;
    private List<Pizza> listaDaPizza = new ArrayList<>();
    private static int proxPedido;
    private Date data;

    static {
        proxPedido = 58;
    }

    public Date getData() {
        return data;
    }

    public int getId() {
        return id;
    }

    public Pedido() {
        this.id = proxPedido;
        proxPedido++;
        this.data = new Date();
    }

    /**
     * METODO PARA ADICIONAR UMA PIZZA NO PEDIDO ATUAL;
     */
    public boolean adicionarPizzaNoPedido(Pizza p) throws InvalidAttributesException {
        boolean resultado = false;
        if (listaDaPizza.size() < quantMaxPorPedido) {
            listaDaPizza.add(p);
            resultado = true;
        }
        return resultado;
    }

    public String exibirCadaDescECadaValorPizza() {
        StringBuilder sb = new StringBuilder();
        sb.append("Id: " + id + "\n").append("Data: " + data + "\n");
        for (Pizza pizza : listaDaPizza) {
            sb.append(pizza.gerar_Nota() + "\n");
        }
        sb.append("\n\n").append("VALOR FINAL DO PEDIDO -> R$").append(exibirValorTotalDoPedido()).append("\n\n");
        return sb.toString();
    }

    public float exibirValorTotalDoPedido() {
        float valorTotal = 0;
        for (Pizza pizza : listaDaPizza) {
            valorTotal += pizza.valor_Final();
        }
        return valorTotal;
    }

    public void alterarPedido(int indexPizza, int quantidadeDeAdicionais) {
        Pizza pizza = listaDaPizza.get(indexPizza);
        pizza.setQtd_adicionais(quantidadeDeAdicionais);
        listaDaPizza.set(indexPizza, pizza);
    }
}
