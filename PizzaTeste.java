import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PizzaTeste {

    public Pizza pizza = new Pizza();
    public Pizza pizzaSemAdicionais = new Pizza(0);
    public Pizza pizzaComAdicionais = new Pizza(7);
    public Pizza pizzaComAdicionaisAlemMaximoPermitido = new Pizza(9);

    @Test
    void valorFixoTemQueSerIgualVinteCinco() {
        assertEquals(25.00, pizzaComAdicionais.getValor_fixo());
    }

    @Test
    void maxDeAdicionaisIgualOito() {
        pizzaComAdicionais.setQtd_adicionais(7);
        assertSame(7, pizzaComAdicionais.getQtd_adicionais());
    }

    @Test
    void pizzaSemAdicionais() {
        pizzaSemAdicionais.getQtd_adicionais();

    }

    // gerar nota final
    @Test
    void gerarNota() {

    }

    // gerar valor final
    @Test
    void gerarValorFinal() {
        assertEquals(53, pizzaComAdicionais.valor_Final());
    }
}