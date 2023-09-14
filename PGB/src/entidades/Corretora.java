package entidades;

public class Corretora {
    private Bolsa bolsa;

    public Corretora(Bolsa bolsa) {
        this.bolsa = bolsa;
    }

    public void ordemCompra(Investidor investidor, String codigoAtivo, int quantidade, double precoMaximo) {
        bolsa.ordemCompra(investidor, codigoAtivo, quantidade, precoMaximo);
    }

    @Override
    public String toString() {
        return "Corretora: " +
                "Bolsa: " + bolsa.toString() +
                '\n';
    }
}
