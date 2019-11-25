public class Exam {
    private int id;
    private String branch_name;
    private String date;
    private String by;
    private Topic topic;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBranch_name() {
        return branch_name;
    }

    public void setBranch_name(String branch_name) {
        this.branch_name = branch_name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBy() {
        return by;
    }

    public void setBy(String by) {
        this.by = by;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }
}
