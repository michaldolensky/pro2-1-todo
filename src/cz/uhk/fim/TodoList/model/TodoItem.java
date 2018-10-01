package cz.uhk.fim.TodoList.model;

public class TodoItem {
    private String title;
    private boolean complete;
    private String dateTime;

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

    public void setTitle(String title) {
        this.title = title;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getTitle() {
        return title;
    }

    public boolean isComplete() {
        return complete;
    }

    public String getDateTime() {
        return dateTime;
    }
}
