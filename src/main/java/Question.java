public class Question {
    private int id;
    private String title;
    private String subtitle;
    private Topic topic ;

    Question(int id, String title, String subtitle, Topic topic) {
        this.id = id;
        this.title = title;
        this.subtitle = subtitle;
        this.topic = topic;
    }

    String getTitle() {
        return title;
    }


}
