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

    public static void criarTarefa(int t){
        for (int i = 0;i<t; i++){
            tarefas.add(new Tarefa(ler.next(), ler.next()));
            System.out.println("criado!");
        }
        for (Tarefa p:tarefas) {
            System.out.println(p);
        }
    }

    public static void criarLembrte(int l){
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



}
