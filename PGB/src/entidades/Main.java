package entidades;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
    public static void main(String[] args) {
        Bolsa bolsa = new Bolsa("B3");
        bolsa.adicionarAtivo(new Acoes("DISB34", 27.12, 200));
        bolsa.adicionarAtivo(new Fundos("AIEC11 ", 68.82, 100.0));

        Investidor investidor1 = new Investidor("Emanuel");
        Investidor investidor2 = new Investidor("Alison");
        Ativos ativo = new Acoes("DISB34",200.0, 100);
        investidor1.addCarteira(new Carteira("0605"));
        investidor1.addAtivonaCarteira(new Acoes("DISB34", 27.12, 200),"0605");
        investidor2.addCarteira(new Carteira("2204"));
        investidor2.addAtivonaCarteira(new Acoes("BBDC4",15.00,500),"2204");

        Corretora corretora = new Corretora(bolsa);

        try {

            RandomAccessFile investidores = new RandomAccessFile("investidores.txt", "rw");
            investidores.seek(0);
            investidores.writeUTF(investidor1.toString());
            investidores.writeUTF(investidor2.toString());
            RandomAccessFile bolsas = new RandomAccessFile("bolsa.txt", "rw");
            bolsas.seek(0);
            bolsas.writeUTF(bolsa.toString());


        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(corretora);
        System.out.println(investidor1);
        System.out.println(investidor2);
    }

}
