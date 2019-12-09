import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        /*Repository repository = new Repository();
        Branch[] branch = repository.getBranches();
        for (int i = 0 ; i < branch.length ; i++){ System.out.println(branch[i].getName()); }*/

        String url = "https://jsonplaceholder.typicode.com/photos";

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();
        try {
            Response response = client.newCall(request).execute();
            System.out.println(response);
            String responseAsString = response.body().string();
            System.out.println(responseAsString);

            Gson gson = new Gson();
            // Convert JSON File to Java Object

            System.out.println(responseAsString);
            String jsonBla = gson.toJson(responseAsString);
            System.out.println(jsonBla);
            JSONArray photos = new JSONArray(responseAsString);
            Photo photo[];
            for(int i = 0 ; i < 2 ; i++){
                photo = new Photo[photos.length()];
                JSONObject object = photos.getJSONObject(i);
                int albumId = object.getInt("albumId") ;
                int id = object.getInt("id") ;
                String title = object.getString("title") ;
                String urlString = object.getString("url") ;
                String tumbnailUrl = object.getString("thumbnailUrl") ;
                photo[i] = new Photo(albumId, id, title, urlString, tumbnailUrl);
                System.out.println("albumID:" + photo[i].getAlbumId());
                System.out.println(photo[i].getTitle());
                System.out.println(photo[i].getThumbnailUrl());
                System.out.println(photo[i].getUrl());
            }


        } catch (IOException e) {
            System.out.println("not working");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }


}
