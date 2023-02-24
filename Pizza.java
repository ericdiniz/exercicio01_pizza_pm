public class Pizza {
    /*
     * AQUI CONTÉM A CLASSE PIZZA
     */

    private int id;
    private static final double valor_fixo = 25;
    private int qtd_adicionais;

    // CONSTRUCTORS
    public Pizza() {

    }

    public Pizza(int id, int qtd_adicionais) {
        this.id = id;
        this.qtd_adicionais = qtd_adicionais;
    }

    // GETTERS AND SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor_fixo() {
        return valor_fixo;
    }

    public int getQtd_adicionais() {
        return qtd_adicionais;
    }

    public void setQtd_adicionais(int qtd_adicionais) {
        this.qtd_adicionais = qtd_adicionais;
    }

}
