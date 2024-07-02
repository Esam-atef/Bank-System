import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AccountManagementUI extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Account Management");

        Label accountNumberLabel = new Label("Account Number:");
        TextField accountNumberInput = new TextField();

        Label accountHolderNameLabel = new Label("Account Holder Name:");
        TextField accountHolderNameInput = new TextField();

        Label balanceLabel = new Label("Initial Balance:");
        TextField balanceInput = new TextField();

        Label overdraftLimitLabel = new Label("Overdraft Limit (Current Account only):");
        TextField overdraftLimitInput = new TextField();

        Label interestRateLabel = new Label("Interest Rate (Savings Account only):");
        TextField interestRateInput = new TextField();

        ToggleGroup accountTypeGroup = new ToggleGroup();
        RadioButton currentAccountRadio = new RadioButton("Current Account");
        currentAccountRadio.setToggleGroup(accountTypeGroup);
        currentAccountRadio.setSelected(true);
        RadioButton savingsAccountRadio = new RadioButton("Savings Account");
        savingsAccountRadio.setToggleGroup(accountTypeGroup);

        Button createAccountButton = new Button("Create Account");
        createAccountButton.setOnAction(e -> {
            String accountNumber = accountNumberInput.getText();
            String accountHolderName = accountHolderNameInput.getText();
            double balance = Double.parseDouble(balanceInput.getText());

            if (currentAccountRadio.isSelected()) {
                double overdraftLimit = Double.parseDouble(overdraftLimitInput.getText());
                CurrentAccount account = new CurrentAccount(accountNumber, accountHolderName, balance, overdraftLimit);
                account.displayAccountDetails();
            } else {
                double interestRate = Double.parseDouble(interestRateInput.getText());
                SavingsAccount account = new SavingsAccount(accountNumber, accountHolderName, balance, interestRate);
                account.displayAccountDetails();
            }
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(accountNumberLabel, accountNumberInput, accountHolderNameLabel, accountHolderNameInput,
                balanceLabel, balanceInput, overdraftLimitLabel, overdraftLimitInput,
                interestRateLabel, interestRateInput, currentAccountRadio,
                savingsAccountRadio, createAccountButton);

        Scene scene = new Scene(layout, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
