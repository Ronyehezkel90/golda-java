import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class serverData {

     String idString = "ID";
     String nameString = "Name";
     String addressString = "Address";
     String ownerString = "Owner";


    List<Branch> getBranchesFromDb(){
        List<Branch> branches = new ArrayList<>();
        String url = "https://golda-go.herokuapp.com/get/branch";
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();
        try {
            Response response = client.newCall(request).execute();
            String responseAsString = response.body().string();
            JSONArray branchesJsonArray = new JSONArray(responseAsString);
            for(int i = 0 ; i < branchesJsonArray.length() ; i++){
                JSONObject jsonObject = branchesJsonArray.getJSONObject(i);
                int branchId = jsonObject.getInt(idString) ;
                String branchName = jsonObject.getString(nameString) ;
                String branchAddress = jsonObject.getString(addressString) ;
                String branchOwner = jsonObject.getString(ownerString) ;
                branches.add(new Branch(branchId, branchName, branchAddress, branchOwner));
            }

        } catch (IOException e) {
            System.out.println("not working");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return branches;
    }

}