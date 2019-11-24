import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Converter {

    public static void main(String[] args) {

        String url = "https://golda-go.herokuapp.com/get/branch" ;

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();
        try {
            Response response = client.newCall(request).execute();
            System.out.println(response);
            System.out.println(response.body().string());
        } catch (Exception e) {
            System.out.println("not working");
            System.out.println(e.getMessage());
        }

    }

}