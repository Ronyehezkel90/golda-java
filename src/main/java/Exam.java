public class Exam {
    private int Id;
    private String branchName;
    private String CheckDate;
    private String Reviewer;
    private Topic[] Topic;


    public Exam(int id, String branchName, String checkDate, String reviewer, Topic[] topic) {
        Id = id;
        this.branchName = branchName;
        CheckDate = checkDate;
        Reviewer = reviewer;
        Topic = topic;
    }

    public int getId() {
        return Id;
    }


    public String getBranchName() {
        return branchName;
    }


    public String getCheckDate() {
        return CheckDate;
    }


    public String getReviewer() {
        return Reviewer;
    }


}
