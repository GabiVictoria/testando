import java.util.Random;
import java.util.Scanner;
public class JokenPo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random aleatorio = new Random();
        int maquina;
        int usuario;
        maquina = aleatorio.nextInt(3);
        System.out.println("|0| Pedra");
        System.out.println("|1| Papel");
        System.out.println("|2| Tesoura");
        System.out.println(" Digite o numero da sua escolha");
        usuario = ler.nextInt();
        System.out.println(" Eu escolho "+ maquina);
        switch (usuario) {
            case 0: if (maquina==1){
                System.out.println(" A maquina escolheu papel.");
                System.out.println(" A maquina ganhou!");
            }
            else if (maquina==2){
                System.out.println(" A maquina escolheu tesoura.");
                System.out.println(" Parabens voce ganhou!");
            }
            else {
                System.out.println(" A maquina escolheu pedra.");
                System.out.println(" Empate");
            }
                break;
            case 1:  if (maquina==0){
                System.out.println(" A maquina escolheu pedra.");
                System.out.println(" Parabens voce  ganhou!");
            }
            else if (maquina==2){
                System.out.println(" A maquina escolheu tesoura.");
                System.out.println(" A maquina  ganhou!");
            }
            else {
                System.out.println(" A maquina escolheu papel.");
                System.out.println(" Empate");
            }
                break;
            case 2: if (maquina==0){
                System.out.println(" A maquina escolheu pedra.");
                System.out.println(" A maquina ganhou!");
            }
            else if (maquina==1){
                System.out.println(" A maquina escolheu papel.");
                System.out.println(" Parabens voce  ganhou!");
            }
            else {
                System.out.println(" A maquina escolheu tesoura.");
                System.out.println(" Empate");
            }
                break;
        }
    }
}
