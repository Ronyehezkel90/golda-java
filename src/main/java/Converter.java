import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;

import java.io.IOException;
import java.util.List;


public class Converter {

    public static void main(String[] args) {

        String url = "https://golda-go.herokuapp.com/get/branch";

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
            JSONObject jsonObject = new JSONObject(responseAsString);
            System.out.println(responseAsString);

//            Branch branch = gson.fromJson(responseAsString, );
            // print staff
//            System.out.println(branch);

        } catch (IOException e) {
            System.out.println("not working");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }


        System.out.println("check this:");


    }

}