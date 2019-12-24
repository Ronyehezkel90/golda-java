public class Topic {

    private int id;
    private  String name;

    Topic(int id, String name) {
        this.id = id;
        this.name = name;
    }

    Topic() {
        this.id = 0;
        this.name = null;
    }

    String getName(){
        return this.name;
    }
    int getId(){
        return this.id;
    }

    void copyTopic(Topic topic){
        this.name = topic.getName();
        this.id = topic.getId();
    }

}
