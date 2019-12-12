import java.util.List;

public class Main {
    public static void main(String[] args) {
        Repository repository = new Repository();
        List<Branch> branch = repository.getBranches();
        for (int i = 0 ; i < branch.size() ; i++){ System.out.println(branch.get(i).getName()); }
    }


}
