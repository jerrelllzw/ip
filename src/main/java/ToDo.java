public class ToDo extends Task {

    public ToDo(String description) {
        super(description);
        category = "T";
    }

    @Override
    public String toString() {
        String statusIcon = this.getStatusIcon();
        String categoryIcon = this.getCategoryIcon();
        return categoryIcon + statusIcon + " " + description;
    }

}