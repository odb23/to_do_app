package com.odb.todolist;

import com.odb.todolist.datamodel.TodoData;
import com.odb.todolist.datamodel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;


public class DialogController {
    @FXML
    private TextField descriptionField;
    @FXML
    private TextArea contentArea;
    @FXML
    private DatePicker deadlinePicker;

    public TodoItem processResults() {
        String description = descriptionField.getText().trim();
        String details = contentArea.getText().trim();
        LocalDate deadline = deadlinePicker.getValue();
        TodoItem newItem = new TodoItem(description, details, deadline);
        TodoData.getInstance().addTodoItem(newItem);

        return newItem;
    }

    public void ViewEditDialogContent(TodoItem item) {
        descriptionField.setText(item.getDescription());
        contentArea.setText(item.getContent());
        deadlinePicker.setValue(item.getDeadline());
    }

}
