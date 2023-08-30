import java.text.ParseException;
import java.util.Scanner;
public class Main {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args ) throws ParseException {
        int e = 0;
        int op = 0;
        System.out.println(" Criar evento (1)");
        System.out.println(" Criar tarefa (2)");
        System.out.println(" Criar lembrete (3)");
        op= ler.nextInt();

        switch (op){
            case 1:
                System.out.println("Digite quantos eventos quer criar ");
                e=ler.nextInt();
                System.out.println("voce escolheu: "+e);
                Agenda.criarEvento(e);
                e=0;
                Evento.exibirEventos();
                break;
            case 2:
                System.out.println("Digite quantas tarefas quer criar ");
                e=ler.nextInt();
                System.out.println("voce escolheu: "+e);
                Agenda.criarTarefa(e);
                e=0;
                break;
            case 3:
                System.out.println("Digite quantos lembretes quer criar ");
                e=ler.nextInt();
                System.out.println("voce escolheu: "+e);
                Agenda.criarLembrte(e);
                e=0;
                break;
            case 4:
                Evento.removerEvento();
                System.out.println("Removido");
                break;
            case 5:
                Tarefa.removerTarefa();
                System.out.println("Removido");
                break;
            case 6:
                Lembrete.removerLembrete();
                System.out.println("Removido");
                break;
        }



    }

}
