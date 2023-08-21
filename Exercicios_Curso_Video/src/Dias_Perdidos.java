 import java.util.Scanner;

public class Dias_Perdidos
{
    public static void main (String[]args){
    Scanner ler = new Scanner (System.in);
    String nome;
    float dias,cigarros, anos;
        System.out.println(" Ola vamos descobrir quanto tempo da sua vida voce ja perdeu ate agora!!!");
        System.out.println(" Primeiro nos Fale o seu nome.");
        nome = ler.nextLine();
        System.out.println(" Quantos cigarros voce fuma por dia " + nome + "?");
        cigarros = ler.nextInt();
        System.out.println(" A quantos anos voce fuma?");
        anos = ler.nextInt();
        dias = (((cigarros*anos*365*10)/60)/24);
        System.out.println(" Voce perde aproximadamente 10 minutos da sua vida a cada cigarro que voce fuma!");
        System.out.println("");
        System.out.println(" Parabens " + nome + " voce ja perdeu " + dias + " dias de vida!!!");
    }
}
