public class Repository implements dataInterface {

    private serverData serverData = new serverData();

    public Branch[] getBranches() {
        return serverData.getBranchesFromDb();

    }
}
