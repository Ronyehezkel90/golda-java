import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class Converter {

    public static void main(String[] args) {

//        String url = "https://golda-go.herokuapp.com/get/branch";
//
//        OkHttpClient client = new OkHttpClient();
//
//        Request request = new Request.Builder()
//                .url(url)
//                .get()
//                .build();
//        try {
//            Response response = client.newCall(request).execute();
//            System.out.println(response);
//            String responseAsString = response.body().string();
//            System.out.println(responseAsString);
//
//            Gson gson = new Gson();
//            // Convert JSON File to Java Object
//            JSONObject jsonObject = new JSONObject(responseAsString);
//            System.out.println(responseAsString);

//            Branch branch = gson.fromJson(responseAsString, );
        // print staff
//            System.out.println(branch);
//
//        } catch (IOException e) {
//            System.out.println("not working");
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }

        Gson gson = new Gson();
        String filePath = "C:\\Users\\Naor\\Documents\\GitHub\\golda-java\\src\\main\\resources\\branches.json";//לבדוק דרך יותר יפה
        try{
            String contents = new String(Files.readAllBytes(Paths.get(filePath)));
            JSONObject j = new JSONObject(contents);
            JSONArray branches = j.getJSONArray("branches");
            for (int i = 0 ; i < branches.length(); i++){
                System.out.println(branches.get(i));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}