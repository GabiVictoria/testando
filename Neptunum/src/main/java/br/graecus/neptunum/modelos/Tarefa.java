package br.graecus.neptunum.modelos;
import jakarta.persistence.*;

@Table
@Entity
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String titulo;

    @Column
    private String descricao;

    @Column
    private String dataPrevista;

    @Column
    private boolean status;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;




    public Tarefa(String titulo, String descricao, String dataPrevista, boolean status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataPrevista = dataPrevista;
        this.status = status;
    }


    public Tarefa(String titulo, String descricao, String dataPrevista, boolean status, Categoria categoria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataPrevista = dataPrevista;
        this.status = status;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataPrevista='" + dataPrevista + '\'' +
                ", status=" + status +
                ", categoria=" + categoria +
                '}';
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataPrevista() {
        return dataPrevista;
    }

    public void setDataPrevista(String dataPrevista) {
        this.dataPrevista = dataPrevista;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Categoria getDisciplina() {
        return categoria;
    }

    public void setDisciplina(Categoria categoria) {
        this.categoria = categoria;
    }

}
