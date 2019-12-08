public class Exam {
    private int Id;
    private String branchName;
    private String CheckDate;
    private String Reviewer;
    private Topic[] Topic;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getCheckDate() {
        return CheckDate;
    }

    public void setCheckDate(String checkDate) {
        this.CheckDate = checkDate;
    }

    public String getReviewer() {
        return Reviewer;
    }

    public void setReviewer(String reviewer) {
        this.Reviewer = reviewer;
    }

}
