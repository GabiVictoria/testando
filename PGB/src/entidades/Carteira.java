package entidades;

import listagem.Listas;

public class Carteira {
    private String codigo;
    private Listas<Ativos> ativos = new Listas<>();

    public Carteira(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public Listas<Ativos> getAtivos() {
        return ativos;
    }

    public void addAtivo(Ativos a) {
        ativos.add(a);
    }


    @Override
    public String toString() {
        String exibir;
        exibir = "\nCarteira " +
                "Codigo: " + codigo+ "\nAtivos: \n";
        for (int i = 0; i < ativos.getSize(); i++) {
            Ativos a = ativos.retornarValor(i);
            exibir+= a.toString();
        }
        exibir+='\n';
        return exibir;
    }
}

