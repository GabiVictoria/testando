import java.text.ParseException;
import java.util.Scanner;

public class Lembrete implements Contract{
    static Scanner ler = new Scanner(System.in);

    private String nome;
    private String dataInicio;
    private String horaInicio;
    private String desccricao;
    private int idLembrete;

    public Lembrete(String nome, String dataInicio, String horaInicio) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.horaInicio = horaInicio;
        idLembrete = Agenda.gerarId();
    }

    public void ExibirData() throws ParseException {}
    public void EdtLembrete(){}
    public void ExcLembrete(){}

    public static void removerLembrete(){
        System.out.println("Digite o id da ocorrencia");
        int i = ler.nextInt();
        Agenda.lembretes.removeIf(n->(n.idLembrete==i));
    }

    @Override
    public String toString() {
        return "Lembrete{" +
                "nome='" + nome + '\'' +
                ", dataInicio='" + dataInicio + '\'' +
                ", horaInicio='" + horaInicio + '\'' +
                ", desccricao='" + desccricao + '\'' +
                ", idLembrete=" + idLembrete +
                '}';
    }
}
