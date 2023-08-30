import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {
    protected static List <Tarefa> tarefas = new ArrayList<>();
    protected static List <Evento> eventos= new ArrayList<>();
    protected static List <Lembrete> lembretes = new ArrayList<>();


    static Scanner ler = new Scanner(System.in);
    private static int idOcorrencia;

    public static void criarEvento(int e) throws ParseException {
        for (int i = 0;i<e; i++){
            Agenda.eventos.add(new Evento(ler.next(), ler.next(), ler.next(), ler.next(), ler.next()));
            System.out.println("criado!");
        }
        for (Evento p:Agenda.eventos) {
            System.out.println(p);
        }
    }

    public static void criarTarefa(int t) throws ParseException {
        for (int i = 0;i<t; i++){
            tarefas.add(new Tarefa(ler.next(), ler.next()));
            System.out.println("criado!");
        }
        for (Tarefa p:tarefas) {
            System.out.println(p);
        }
    }

    public static void criarLembrte(int l) throws ParseException {
        for (int i = 0;i<l; i++){
            lembretes.add(new Lembrete(ler.next(), ler.next(), ler.next()));
            System.out.println("criado!");
        }
        for (Lembrete p:lembretes) {
            System.out.println(p);
        }
    }

    public static int gerarId(){
        idOcorrencia+=1;
        return idOcorrencia;
    }

public static int exibirMenu(int op){
    System.out.println(" Exibir menu ");
    System.out.println(" Criar evento (1)");
    System.out.println(" Criar tarefa (2)");
    System.out.println(" Criar lembrete (3)");
    System.out.println(" Remover evento (4)");
    System.out.println(" Remover tarefa (5)");
    System.out.println(" Remover lembrete (6)");
    System.out.println(" Exibir evento (7)");
    System.out.println(" Exibir tarefa (8)");
    System.out.println(" Exibir lembrete (9)");
    op= ler.nextInt();
    return op;
    }



}
