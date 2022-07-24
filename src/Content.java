public class Content {
    private String title;
    private String Description;
    private static final double patternXP = 10d;

    public Content() {
    }

    protected double calculateXP() {
        return patternXP + 20d;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
