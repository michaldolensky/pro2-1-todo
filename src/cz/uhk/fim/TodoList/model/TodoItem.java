package cz.uhk.fim.TodoList.model;

public class TodoItem {
    String title;
    boolean complete;
    String dateTime;

    public TodoItem() {
    }

    public TodoItem(String title) {
        this.title = title;
    }

    public TodoItem(String title, boolean complete, String dateTime) {
        this.title = title;
        this.complete = complete;
        this.dateTime = dateTime;
    }
}
