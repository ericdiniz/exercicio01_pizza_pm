import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import javax.naming.directory.InvalidAttributesException;

import org.junit.jupiter.api.Test;

class PizzaTeste {

    public Pizza pizzaSemAdicionais = new Pizza();
    public Pizza pizzaComAdicionais = new Pizza();

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
        pizzaComAdicionais.setQtd_adicionais(8);
        assertEquals(8, pizzaComAdicionais.getQtd_adicionais());
    }

    /**
     * Teste para objeto pizza sem adicionais ou igual a 0
     */
    @Test
    void pizzaSemAdicionais() {
        pizzaSemAdicionais.setQtd_adicionais(0);
        assertEquals(0, pizzaSemAdicionais.getQtd_adicionais());
    }

    /**
     * Teste para qtd do adicionais maior que 8
     */
    @Test
    void maxDeAdicionaisMaiorQueOito() {
        assertThrows(InvalidAttributesException.class, () -> new Pizza(9));
    }

    /**
     * Teste para gerar nota com descrição e valor final da pizza
     */
    @Test
    void gerarNota() {
        // assertEq("O valor final da pizza de calabresa e queijo é: 25 e contém 0
        // adicionais", pizzaSemAdicionais.gerar_Nota());
        String descricao = "O valor final da pizza de calabresa e queijo é: 25.0 e contém 0 adicionais";
        // assertTrue(descricao.equals(pizzaSemAdicionais.gerar_Nota()), true);
        assertEquals(descricao, pizzaSemAdicionais.gerar_Nota());
    }

    /**
     * Teste para gerar valor final após passar a qtd do adicionais
     */
    @Test
    void gerarValorFinal() {
        assertEquals(25, pizzaSemAdicionais.valor_Final());
    }
}