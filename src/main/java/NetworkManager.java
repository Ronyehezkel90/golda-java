import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class NetworkManager {
    private OkHttpClient client = new OkHttpClient();

    public Response sendRequest(String baseUrl, String getUrl){
        Request request = new Request.Builder()
                .url(baseUrl+getUrl)
                .get()
                .build();
        try {
            return client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


}
