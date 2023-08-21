import java.text.ParseException;

public class Lembrete implements Contract{

    private String nome;
    private String dataInicio;
    private String horaInicio;
    private String desccricao;

    public Lembrete(String nome, String dataInicio, String horaInicio) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.horaInicio = horaInicio;
    }

    public void ExibirData() throws ParseException {}
    public void EdtLembrete(){}
    public void ExcLembrete(){} 
}
