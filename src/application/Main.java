package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Label para el año
        Label yearLabel = new Label("Año:");

        // ComboBox para seleccionar el año
        ComboBox<String> yearComboBox = new ComboBox<>();
        yearComboBox.getItems().addAll("2016", "2017", "2018", "2019", "2020");
        yearComboBox.setValue("2016");

        // HBox para el Label y ComboBox
        HBox hBox = new HBox(10, yearLabel, yearComboBox);
        hBox.setPadding(new Insets(10));

        // TableView para mostrar los resultados
        TableView<Driver> tableView = new TableView<>();

        // Columnas del TableView
        TableColumn<Driver, String> nameColumn = new TableColumn<>("Driver Name");
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        nameColumn.setMinWidth(200);

        TableColumn<Driver, Integer> winsColumn = new TableColumn<>("Wins");
        winsColumn.setCellValueFactory(new PropertyValueFactory<>("wins"));
        winsColumn.setMinWidth(100);

        TableColumn<Driver, Integer> pointsColumn = new TableColumn<>("Total Points");
        pointsColumn.setCellValueFactory(new PropertyValueFactory<>("points"));
        pointsColumn.setMinWidth(100);

        TableColumn<Driver, Integer> rankColumn = new TableColumn<>("Rank");
        rankColumn.setCellValueFactory(new PropertyValueFactory<>("rank"));
        rankColumn.setMinWidth(100);

        tableView.getColumns().setAll(nameColumn, winsColumn, pointsColumn, rankColumn);

        // Datos de ejemplo
        ObservableList<Driver> drivers = FXCollections.observableArrayList(
            new Driver("Lewis Hamilton", 104, 4749, 1),
            new Driver("Nick Heidfeld",13 ,42 ,6 ),
            new Driver("Nico Rosberg", 9, 170, 3),
            new Driver("Fernando Alonso", 7, 150, 2),
            new Driver("Heikki Kovalainen",1, 120, 4),
            new Driver("Kazuki Nakajima", 0, 270, 7),
            new Driver("Sébastien Bourdais",1 , 270, 8),
            new Driver("Kami Räikkönen", 3, 270, 9),
            new Driver("Robert Kubica",3, 50, 11),
            new Driver("Timo Glock",5, 128, 12),
            new Driver("Takuma Sato",0, 200, 13),
            new Driver("Nelson Piquete Jr.",2, 320, 10)
            
        );
        tableView.setItems(drivers);

        // Layout
        VBox vbox = new VBox(10, hBox, tableView);
        vbox.setPadding(new Insets(10));
        Scene scene = new Scene(vbox, 600, 400);

        // Configuración del Stage
        primaryStage.setTitle("Resultados de Conductores");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
