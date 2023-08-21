import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Evento implements Contract {
    private String nome;
    private String descricao;
    private String dataInicio;
    private String dataFinal;
    private String horaInicio;
    private String horaFinal;


    public Evento(String nome, String dataInicio/*, String dataFinal, String horaInicio, String horaFinal*/) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        /*this.dataFinal = dataFinal;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;*/
    }

    public void EdtEvento (){}
    public void ExcEvento(){}
    public void ExibirData() throws ParseException {
        Date data = new SimpleDateFormat("dd-MM-yyyy").parse(dataInicio);
        String dataFormatada = new SimpleDateFormat("dd/MM/yyyy").format(data);
        System.out.println(dataFormatada);
    }

}

