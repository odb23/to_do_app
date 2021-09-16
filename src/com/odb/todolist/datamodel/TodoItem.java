package com.odb.todolist.datamodel;

import java.time.LocalDate;

public class TodoItem {
    private String description;
    private String content;
    private LocalDate deadline ;

    public TodoItem(String description, String content, LocalDate deadline) {
        this.description = description;
        this.content = content;
        this.deadline = deadline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return this.getDescription();
    }
}
