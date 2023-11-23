package br.graecus.neptunum.controller;

import br.graecus.neptunum.HelloApplication;
import br.graecus.neptunum.modelos.Usuario;
import br.graecus.neptunum.util.HibernateUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.hibernate.Session;

public class LoginController {

    @FXML
    private PasswordField txtSenha;

    @FXML
    private TextField txtUsuario;
    @FXML
    private Label labIncorreto;

    @FXML
    void clickCadastro(ActionEvent event) {
        HelloApplication.telas("criaConta");
    }

    boolean entrar() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {session.beginTransaction();
            Usuario usuario = session.createQuery("from Usuario where matricula = :matricula and senha = :senha", Usuario.class)
                    .setParameter("matricula", txtUsuario.getText().toLowerCase())
                    .setParameter("senha", txtSenha.getText()).uniqueResult();
            if (usuario == null) {
                labIncorreto.setText("Matricula ou senha incorretos");
                return false;
            }
            session.getTransaction().commit();
        } catch (Exception e){
            if (session.getTransaction()!=null)
                session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return true;

        @FXML
        void clickEntrar (ActionEvent event){
            if(entrar()) {
                labIncorreto.setText("");
                txtUsuario.setText("");
                txtSenha.setText("");
                HelloApplication.telas("home");
            }
        }
        //HelloApplication.telas("home");
    }

}
