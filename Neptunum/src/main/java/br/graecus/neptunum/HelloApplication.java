package br.graecus.neptunum;
import br.graecus.neptunum.modelos.Usuario;
import  br.graecus.neptunum.util.HibernateUtil;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.IOException;

public class HelloApplication extends Application {
    private static Stage stage;
    private static Scene sceneLogin;
    private static Scene sceneCriaConta;
    private static Scene sceneHome;
    @Override
    public void start(Stage stageInicial) throws IOException {
        stage = stageInicial;
        FXMLLoader fxmlLoaderLogin = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
        FXMLLoader fxmlLoaderCriaConta = new FXMLLoader(HelloApplication.class.getResource("criaConta.fxml"));
        FXMLLoader fxmlLoaderHome = new FXMLLoader(HelloApplication.class.getResource("home.fxml"));
         sceneLogin = new Scene(fxmlLoaderLogin.load());
         sceneCriaConta = new Scene(fxmlLoaderCriaConta.load());
        // sceneHome = new Scene(fxmlLoaderHome.load());
        stage.setTitle("Neptunum");
        stage.setScene(sceneLogin);
        stage.show();
    }
    public static void telas(String tela){
        switch (tela){
            case "login":
                stage.setScene(sceneLogin);
                break;
            case "criaConta":
                stage.setScene(sceneCriaConta);
                break;
            case "home":
                stage.setScene(sceneHome);
                break;
        }
    }


    public static void main(String[] args) {
        launch();
    }


}