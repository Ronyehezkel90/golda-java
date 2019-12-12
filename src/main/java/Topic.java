public class Topic {

    private int Id;
    private  String Name;

    public Topic(int id, String name) {
        this.Id = id;
        this.Name = name;
    }

    public Topic() {
        this.Id = 0;
        this.Name = null;
    }

    public String getName(){
        return this.Name;
    }
    public int getId(){
        return this.Id;
    }

    public void copyTopic(Topic topic){
        this.Name = topic.getName();
        this.Id = topic.getId();
    }

}
