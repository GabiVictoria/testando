import java.util.Scanner;
public class Alistamento {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        String nome;
        int idade, anos;
        System.out.println(" Ola, digite o seu nome");
        nome = ler.nextLine();
        System.out.println(" Qual a sua idade "+ nome +"?");
        idade = ler.nextInt();
        if (idade>= 18){
            anos = idade-18;
            System.out.println(" Ja se passaram "+ anos +" anos desde o seu alistamento");
        }
        else {
            anos = 18-idade;
            System.out.println(" Faltam "+ anos + " anos para voce se alistar");
        }
    }
}
