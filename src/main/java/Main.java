public class Main {

    public static void main(String[] args) {
        Repository repository = new Repository();
        Branch[] branch = repository.getBranches();
        for (int i = 0 ; i < branch.length ; i++){ System.out.println(branch[i].getName()); }//for test
    }

}
