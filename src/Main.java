import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {
    private TableView<Student> table;
    private TextField nameField, rollField, marksField;
    private ObservableList<Student> data;
    private GradeManager manager = new GradeManager();

    @Override
    public void start(Stage stage) {
        stage.setTitle("Student Grade Tracker");

        data = FXCollections.observableArrayList(manager.loadStudents());

        // ==== Input Fields ====
        rollField = new TextField();
        rollField.setPromptText("Roll No");

        nameField = new TextField();
        nameField.setPromptText("Name");

        marksField = new TextField();
        marksField.setPromptText("Marks");

        Button addBtn = new Button("Add Student");
        addBtn.setOnAction(e -> addStudent());

        HBox inputBox = new HBox(10, rollField, nameField, marksField, addBtn);
        inputBox.setPadding(new Insets(10));

        // ==== Table ====
        table = new TableView<>();
        TableColumn<Student, Integer> rollCol = new TableColumn<>("Roll No");
        rollCol.setCellValueFactory(c -> new javafx.beans.property.SimpleObjectProperty<>(c.getValue().getRollNo()));

        TableColumn<Student, String> nameCol = new TableColumn<>("Name");
        nameCol.setCellValueFactory(c -> new javafx.beans.property.SimpleStringProperty(c.getValue().getName()));

        TableColumn<Student, Double> marksCol = new TableColumn<>("Marks");
        marksCol.setCellValueFactory(c -> new javafx.beans.property.SimpleObjectProperty<>(c.getValue().getMarks()));

        TableColumn<Student, String> gradeCol = new TableColumn<>("Grade");
        gradeCol.setCellValueFactory(c -> new javafx.beans.property.SimpleStringProperty(c.getValue().getGrade()));

        table.getColumns().addAll(rollCol, nameCol, marksCol, gradeCol);
        table.setItems(data);

        VBox root = new VBox(10, inputBox, table);
        root.setPadding(new Insets(10));

        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.show();
    }

    private void addStudent() {
        try {
            int roll = Integer.parseInt(rollField.getText());
            String name = nameField.getText();
            double marks = Double.parseDouble(marksField.getText());

            if (name.isEmpty()) {
                showAlert("Please enter valid name!");
                return;
            }

            Student s = new Student(name, roll, marks);
            data.add(s);
            manager.saveStudents(data);

            rollField.clear();
            nameField.clear();
            marksField.clear();
        } catch (NumberFormatException ex) {
            showAlert("Enter valid numbers for Roll No and Marks!");
        }
    }

    private void showAlert(String msg) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setContentText(msg);
        alert.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
