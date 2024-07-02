package com.example.main;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Bank System");

        Button manageAccountsButton = new Button("Manage Accounts");
        manageAccountsButton.setOnAction(e -> {
            AccountManagementUI accountUI = new AccountManagementUI();
            accountUI.start(new Stage());
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(manageAccountsButton);

        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}