import javax.naming.directory.InvalidAttributesException;

public class Pizza {
    /*
     * Feito por: ERIC RODRIGUES DINIZ
     * MATRÍCULA: 707760
     * 🍕Exercício 01: Conceitos básicos de POO 🍕
     * Uma pizzaria precisa de um sistema de software para controlar suas vendas. O
     * primeiro passo para isso é automatizar o valor cobrado pelas pizzas vendidas.
     * A pizzaria está iniciando os negócios com um modelo simplificado de vendas,
     * seguindo estas regras:
     *
     * A pizza básica contém queijo e calabresa, custando R$25.
     * A pizza pode ser personalizada com até 8 ingredientes adicionais. Já que
     * todos têm o mesmo valor, não é necessário diferenciar os tipos ou nomes de
     * adicionais. Cada ingrediente adicional custa R$4.
     * Cada pizza vendida deve gerar uma nota de compra simplificada, contendo
     * descrição e valor a ser pago pela pizza.
     * Sua tarefa inicial é analisar o problema e projetar uma classe Pizza que
     * atenda aos requisitos levantados. Para criar o modelo, utilize uma das
     * ferramentas indicadas na página inicial da disciplina.
     *
     * ATENÇÃO PARA O COMPLEMENTO DA TAREFA:
     *
     * Para terminar a primeira fase do projeto, escreva o código para sua classe
     * Pizza. Você precisa ter certeza que a sua classe está correta. Então, escreva
     * uma classe de teste unitário utilizando JUnit, verificando a correção da
     * classe Pizza.
     */

    /*
     * AQUI CONTÉM A CLASSE PIZZA
     */
    private int id;
    private int qtd_adicionais;
    private String descricaoPizza = "pizza básica de calabresa e queijo";
    private static final double valor_fixo = 25; // atributo de classe
    private static final double valor_adicionais = 4; // atributo de classe

    // CONSTRUCTORS
    public Pizza() {
        // Pizza basica s/ adicional
        this.qtd_adicionais = 0;
    }

    /**
     * @param qtd_adicionais colocar como parametro apenas a quantidade de
     *                       adicionais, e irá retornar um objeto com o param
     *                       inserido
     */
    public Pizza(int qtd_adicionais) throws InvalidAttributesException {

        if (qtd_adicionais > 8 || qtd_adicionais < 0) {
            throw new InvalidAttributesException("Digite um valor entre 0 e 8");
        }
        this.qtd_adicionais = qtd_adicionais;
    }

    // GETTERS AND SETTERS
    public int getId() {
        return id;
    }

    // public void setId(int id) {
    // this.id = id;
    // }

    public double getValor_fixo() {
        return valor_fixo;
    }

    public int getQtd_adicionais() {
        return qtd_adicionais;
    }

    public void setQtd_adicionais(int qtd_adicionais) {
        try {
            if (qtd_adicionais >= 0 || qtd_adicionais < 9) {
                this.qtd_adicionais = qtd_adicionais;
            }
        } catch (Exception e) {
            System.err.println("Digite a quantidade entre 0 e 8, valor atual inserido: " + qtd_adicionais);
        }
    }

    /**
     * @return sem parametros, retorna o valor final com adicionais
     */
    public double valor_Final() {
        return this.getValor_fixo() + (this.getQtd_adicionais() * valor_adicionais);
    }

    public StringBuilder gerar_Nota() {
        StringBuilder descricaoCompleta = new StringBuilder();
        descricaoCompleta.append(descricaoPizza)
                .append(" com ")
                .append(getQtd_adicionais())
                .append(" adicionais e o valor da pizza é: ")
                .append(valor_Final());
        return descricaoCompleta;
    }

}
