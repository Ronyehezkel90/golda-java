import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
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
//        String filePath = "C:\\Users\\Naor\\Documents\\GitHub\\golda-java\\src\\main\\resources\\branches.json";//לבדוק דרך יותר יפה

//        String jsonAsString = "{\n" +
//                "  \"branches\": [\n" +
//                "    {\n" +
//                "      \"id\": 1,\n" +
//                "      \"name\": \"Holon\",\n" +
//                "      \"address\": \"Hatalyumut\",\n" +
//                "      \"owner\": \"Talit\",\n" +
//                "      \"exams\": \"\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"id\": 2,\n" +
//                "      \"name\": \"Florentin\",\n" +
//                "      \"address\": \"Florentin 4, Tel-aviv\",\n" +
//                "      \"owner\": \"Abush\",\n" +
//                "      \"exams\": \"\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"id\": 3,\n" +
//                "      \"name\": \"Givataim\",\n" +
//                "      \"address\": \"Hamenashneshim 2, Givataim\",\n" +
//                "      \"owner\": \"Morit\",\n" +
//                "      \"exams\": \"\"\n" +
//                "    }\n" +
//                "  ]\n" +
//                "}";

        JSONParser jsonParser = new JSONParser();
        try/* (Reader reader = new FileReader(filePath))*/ {
            JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader(jsonAsString));
            String id = (String) jsonObject.get("id");
            System.out.println("id: "+ id);

//            Branch branch = gson.fromJson(reader, Branch.class);

//            System.out.println("name "+branch);
            System.out.println("sdf" + jsonObject.toString());

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        // Convert JSON File to Java Object


    }

}