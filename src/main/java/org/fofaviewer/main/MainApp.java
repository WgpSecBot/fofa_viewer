package org.fofaviewer.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.fofaviewer.controllers.MainController;

public class MainApp extends Application {
    private final String version = "1.1.6";

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/fofa_viewer.fxml"));
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.setTitle("新密市公安局 FoFa采集工具  v" + this.version+ " By WgpSec");
        stage.show();
        stage.setMinWidth(1100);
        stage.setMinHeight(800);
        MainController controller = loader.getController();
        Parameters p = this.getParameters();
        if(p.getRaw().size() == 2 && p.getRaw().get(0).equals("-f")){
            controller.openFile(p.getRaw().get(1));
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
