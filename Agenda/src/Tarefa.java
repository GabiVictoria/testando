import java.text.ParseException;

public class Tarefa implements Contract{
    private String nome;
    private String dataInicio;
    private String descricao;

    public Tarefa(String nome, String dataInicio) {
        this.nome = nome;
        this.dataInicio = dataInicio;
    }

    public void ExcTarefa(){}
    public void EdtTarefa(){}
    public void ExibirData() throws ParseException {}
}
