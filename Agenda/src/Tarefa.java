import java.text.ParseException;
import java.util.Scanner;

public class Tarefa implements Contract{
    static Scanner ler = new Scanner(System.in);
    private String nome;
    private String dataInicio;
    private String descricao;
    private int idTarefa;

    public Tarefa(String nome, String dataInicio) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        idTarefa = Agenda.gerarId();
    }

    public void ExcTarefa(){}
    public void EdtTarefa(){}
    public void ExibirData() throws ParseException {}

    public static void removerTarefa(){
        System.out.println("Digite o id da ocorrencia");
        int i = ler.nextInt();
        Agenda.tarefas.removeIf(n->(n.idTarefa==i));
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "nome='" + nome + '\'' +
                ", dataInicio='" + dataInicio + '\'' +
                ", descricao='" + descricao + '\'' +
                ", idTarefa=" + idTarefa +
                '}';
    }
}
