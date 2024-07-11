import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class API {
    public double apiConnection() throws IOException, InterruptedException {
        InterfazDelUsuario url = new InterfazDelUsuario();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url.direccion()))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String jsonResponse = response.body();
        Gson gson = new Gson();
        APIModel apiModel = gson.fromJson(jsonResponse, APIModel.class);

        return apiModel.getConversion_rate();
    }
}
