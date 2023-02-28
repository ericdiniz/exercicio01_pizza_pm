public class Pizza {
    /*
     * AQUI CONTÉM A CLASSE PIZZA
     */
    private int id;
    private int qtd_adicionais;
    private static final double valor_fixo = 25;
    private static final double valor_adicionais = 4;

    // CONSTRUCTORS
    public Pizza() {

    }

    public Pizza(int qtd_adicionais) {
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
        if (qtd_adicionais >= 0 || qtd_adicionais < 9) {
            this.qtd_adicionais = qtd_adicionais;
        }
    }

    /**
     * @return sem parametros, retorna o valor final com adicionais
     */
    public double valor_Final() {
        return this.getValor_fixo() + (this.getQtd_adicionais() * valor_adicionais);
    }

    public void gerar_Nota() {
        System.out.println(
                "O valor final da pizza de calabresa e queijo é: " + valor_Final() + " e contém "
                        + this.getQtd_adicionais() + " adicionais");
    }

}
