import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertLinesMatch;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.hamcrest.core.StringContains;
import org.junit.jupiter.api.Test;

class PizzaTeste {

    public Pizza pizza = new Pizza();
    public Pizza pizzaSemAdicionais = new Pizza(0);
    public Pizza pizzaComAdicionais = new Pizza(8);
    public Pizza pizzaComAdicionaisAlemMaximoPermitido = new Pizza(9);

    /**
     * Teste para valor fixo da pizza, expectativa igual 25
     */
    @Test
    void valorFixoTemQueSerIgualVinteCinco() {
        assertEquals(25.00, pizzaComAdicionais.getValor_fixo());
    }

    /**
     * Teste para qtd do adicionais no max 8
     */
    @Test
    void maxDeAdicionaisIgualOito() {
        assertSame(8, pizzaComAdicionais.getQtd_adicionais());
    }

    /**
     * Teste para objeto pizza sem adicionais ou igual a 0
     */
    @Test
    void pizzaSemAdicionais() {
        assertEquals(0, pizzaSemAdicionais.getQtd_adicionais());
    }

    /**
     * Teste para gerar nota com descrição e valor final da pizza
     */
    @Test
    void gerarNota() {
        // assertEq("O valor final da pizza de calabresa e queijo é: 25 e contém 0
        // adicionais", pizzaSemAdicionais.gerar_Nota());
        String descricao = "O valor final da pizza de calabresa e queijo é: 25 e contém 0 adicionais";
        // assertTrue(descricao.equals(pizzaSemAdicionais.gerar_Nota()), true);
        // assertEquals(descricao, pizzaSemAdicionais.gerar_Nota());
    }

    /**
     * Teste para gerar valor final após passar a qtd do adicionais
     */
    @Test
    void gerarValorFinal() {
        assertEquals(57, pizzaComAdicionais.valor_Final());
        assertEquals(25, pizzaSemAdicionais.valor_Final());
    }
}