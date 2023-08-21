 import java.util.Scanner;
public class Triangulos {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        int retaA, retaB, retaC;
        System.out.println("Digite um valor inteiro para o primeiro segmento ");
        retaA = ler.nextInt();
        System.out.println("Digite um valor inteiro para o segundo segmento ");
        retaB = ler.nextInt();
        System.out.println("Digite um valor inteiro para o terceiro segmento ");
        retaC = ler.nextInt();
        if (retaA+retaB>retaC && retaB+retaC>retaA && retaA+retaC>retaB){
            System.out.println(" Os segmentos de reta formam um triangulo");
            if (retaA==retaB && retaB==retaC){
                System.out.println(" Seu triangulo e equilatero");
            }
            else if (retaA==retaB && retaB!=retaC || retaA==retaC && retaC!=retaB || retaC==retaB && retaB!=retaA){
                System.out.println(" Seu triangulo e isosceles");
            }
            else {
                System.out.println(" Seu triangulo e escaleno");
            }
        }
        else {
            System.out.println(" Os segmentos de reta nao formam um triangulo");
        }
    }
}
