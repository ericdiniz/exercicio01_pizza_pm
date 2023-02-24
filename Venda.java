public class Venda {
    /*
     * AQUI CONTÉM A CLASSE VENDA
     */

    private int id;
    private String descricao;
    public static Pizza pizza;
    private static final double valor_adicionais = 4;

    // CONSTRUCTORS
    public Venda() {

    }

    public Venda(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    // GETTERS AND SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // METODOS
    public static void gerar_Nota() {
        double valorFinal = 0;
        valorFinal = gerar_ValorFinal();
        System.out.println(
                "O valor final da pizza é: " + valorFinal + " e contém " + pizza.getQtd_adicionais() + " adicionais");
    }

    public static Double gerar_ValorFinal() {
        double resposta = 0;
        double valorFixo = pizza.getValor_fixo();
        resposta = valorFixo + (pizza.getQtd_adicionais() * valor_adicionais);
        return resposta;
    }

}
