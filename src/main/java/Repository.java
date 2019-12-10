import java.util.List;

public class Repository implements dataInterface {

    private serverData serverData = new serverData();

    public List<Branch> getBranches() {
        return serverData.getBranchesFromDb();
    }
}
