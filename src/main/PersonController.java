package main;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class PersonController {

    private Person person;

    @FXML TextField name;
    @FXML TextField age;
    @FXML Text displayName;
    @FXML Text displayAge;

    @FXML
    private void onClick() {
        person.setName(name.textProperty().getValue());
        person.setAge(Integer.parseInt(age.textProperty().getValue()));
    }

    @FXML
    private void initialize() {
        person = new Person();
        person.addListener((event) -> {
            switch (event.getPropertyName()) {
                case Person.AGE_PROPERTY:
                    Integer newAge = (Integer) event.getNewValue();
                    displayAge.setText(String.valueOf(newAge));
                    break;
                case Person.NAME_PROPERTY:
                    String newName = (String) event.getNewValue();
                    displayName.setText(newName);
                    break;
            }
        });

    }

}
