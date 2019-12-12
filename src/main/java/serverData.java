import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class serverData {

    List<Branch> getBranchesFromDb(){
        String idString = "ID";
        String nameString = "Name";
        String addressString = "Address";
        String ownerString = "Owner";
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

    List<topicQuestions> getReviews(){
        /* First we create the topics list */
        List<Topic> topics = getTopic();
        String idString = "id";
        String titleString = "title";
        String subTitleString = "subTitle";
        String topicIdString = "topicId";
        List<topicQuestions>  topicQuestions = new ArrayList<>();
        String url = "https://golda-go.herokuapp.com/get/questions";
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();
        try {
            Response response = client.newCall(request).execute();
            String responseAsString = response.body().string();
            JSONArray questionJsonArray = new JSONArray(responseAsString);
            for(int i = 0 ; i < questionJsonArray.length() ; i++){
                JSONObject jsonObject = questionJsonArray.getJSONObject(i);
                int questionId = jsonObject.getInt(idString) ;
                String questionTitle = jsonObject.getString(titleString) ;
                String questionSubtitle = jsonObject.getString(subTitleString) ;
                int questionTopicId = jsonObject.getInt(topicIdString) ;
                Topic topicForQuestion = new Topic() ;
                for(int j = 0 ; j < topics.size() ; j++){
                    int id = topics.get(j).getId();
                    if(id  == questionTopicId){
                        topicForQuestion.copyTopic(topics.get(j)) ;
                    }
                }
                topicQuestions.add(new topicQuestions(questionId, questionTitle,questionSubtitle , topicForQuestion));
            }

        } catch (IOException e) {
            System.out.println("not working");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return topicQuestions;
    }

    @NotNull
    private List<Topic> getTopic(){
        List<Topic> topics = new ArrayList<Topic>();
        String idString = "id";
        String nameString = "name";
        String url = "https://golda-go.herokuapp.com/get/topic";
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();
        try {
            Response response = client.newCall(request).execute();
            String responseAsString = response.body().string();
            JSONArray topicJsonArray = new JSONArray(responseAsString);
            for(int i = 0 ; i < topicJsonArray.length() ; i++){
                JSONObject jsonObject = topicJsonArray.getJSONObject(i);
                int topicId = jsonObject.getInt(idString) ;
                String topicName = jsonObject.getString(nameString) ;
                topics.add(new Topic(topicId, topicName));
            }
        } catch (IOException e) {
            System.out.println("not working");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return topics;

    }

}