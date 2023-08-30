import java.text.ParseException;
import java.util.Scanner;
public class Main {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args ) throws ParseException {
        int e = 0;
        int op = 0;


            switch (op) {
                case 0:
                    Agenda.exibirMenu(op);
                    break;
                case 1:
                    System.out.println("Digite quantos eventos quer criar ");
                    e = ler.nextInt();
                    System.out.println("voce escolheu: " + e);
                    Agenda.criarEvento(e);
                    e = 0;
                    Agenda.exibirMenu(op);
                    break;
                case 2:
                    System.out.println("Digite quantas tarefas quer criar ");
                    e = ler.nextInt();
                    System.out.println("voce escolheu: " + e);
                    Agenda.criarTarefa(e);
                    e = 0;
                    Agenda.exibirMenu(op);
                    break;
                case 3:
                    System.out.println("Digite quantos lembretes quer criar ");
                    e = ler.nextInt();
                    System.out.println("voce escolheu: " + e);
                    Agenda.criarLembrte(e);
                    e = 0;
                    Agenda.exibirMenu(op);
                    break;
                case 4:
                    Evento.removerEvento();
                    System.out.println("Removido");
                    Agenda.exibirMenu(op);
                    break;
                case 5:
                    Tarefa.removerTarefa();
                    System.out.println("Removido");
                    Agenda.exibirMenu(op);
                    break;
                case 6:
                    Lembrete.removerLembrete();
                    System.out.println("Removido");
                    Agenda.exibirMenu(op);
                    break;
                case 7:
                    Evento.exibirEventos();
                    Agenda.exibirMenu(op);
                    break;
                case 8:
                    Tarefa.exibirTarefas();
                    Agenda.exibirMenu(op);
                    break;
                case 9:
                    Lembrete.exibirLembretes();
                    Agenda.exibirMenu(op);
                    break;
                case 10:
                    String consulta;
                    consulta= ler.next();
                    Evento.consultaEvento(consulta);
                    break;
            }



    }

}
