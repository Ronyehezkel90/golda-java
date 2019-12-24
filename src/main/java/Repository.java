import java.util.List;

public class Repository implements DataInterface {

    private ServerData serverData = new ServerData();

    public List<Branch> getBranches() {
        return serverData.getBranchesFromDb();
    }

    public List<Question> getReviews() {
        return serverData.getReviews();
    }
}
