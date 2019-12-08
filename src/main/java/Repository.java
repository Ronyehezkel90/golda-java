public class Repository implements dataInterface {

     public Branch[] getBranches() {
        serverData serverData = new serverData();
        return serverData.getBranchesFromDb();

    }
}
