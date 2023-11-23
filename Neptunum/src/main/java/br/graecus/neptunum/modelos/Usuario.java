package br.graecus.neptunum.modelos;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String nickname;

    @Column(unique = true)
    private String nomeUsuario;

    @Column
    private String senha;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Tarefa> tarefas = new ArrayList<>();


    public Usuario(String nickname, String nomeUsuario, String senha) {
        this.nickname = nickname;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }


    public void addTarefa(Tarefa tarefa){
        tarefas.add(tarefa);
    }
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public void setTarefas(List<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", nomeUsuario='" + nomeUsuario + '\'' +
                ", senha='" + senha + '\'' +
                ", tarefas=" + tarefas +
                '}';
    }
}