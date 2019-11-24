import okhttp3.OkHttpClient;

public class Converter {

    void convert() {
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
                System.out.println(response.body());
            } catch (Exception e) {
                System.out.println("not working");
                System.out.println(e.getMessage());
            }

        }

    }
}