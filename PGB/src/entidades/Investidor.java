package entidades;


import listagem.Listas;

import java.util.ArrayList;
import java.util.List;

public class Investidor {
    private String nome;
    private Listas<Carteira> carteiras = new Listas<>();


    public Investidor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void enviarOrdemCompra(Corretora corretora, String codigoAtivo, int quantidade, double precoMaximo) {
        corretora.ordemCompra(this, codigoAtivo, quantidade, precoMaximo);
    }

    public void addAtivonaCarteira(Ativos a, String codigo) {
        for (int i = 0; i < carteiras.getSize(); i++) {
            Carteira c = carteiras.retornarValor(i);
            if (c.getCodigo().equals(codigo)) {
                c.addAtivo(a);
            }
        }
    }


    public void addCarteira(Carteira c){
        carteiras.add(c);
    }

    @Override
    public String toString() {
        String exibir;
        exibir = "Investidor: " + nome +";" + " \nCarteiras: ";
        for (int i = 0; i < carteiras.getSize(); i++) {
            Carteira c = carteiras.retornarValor(i);
            exibir+= c.toString();
        }
        exibir += "\n";
        return exibir;
    }
}
