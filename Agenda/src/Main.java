import java.text.ParseException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner ler = new Scanner(System.in);
        Evento teste = new Evento(ler.next(), ler.next()/*,ler.next(),ler.next(),ler.next()*/);
        teste.ExibirData();

    }
}
