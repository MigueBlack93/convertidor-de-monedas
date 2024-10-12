package carga_y_descarga_valores;

import org.json.JSONObject;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ValoresTiempoReal {
    public BigDecimal ConseguirTasaDeCambio(String monedaOrigen, String monedaAConvertir){
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/f8de8036b918facbff22f5f8/latest/"+ monedaOrigen))
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();

            JSONObject jsonObject = new JSONObject(json).getJSONObject("conversion_rates");
            return jsonObject.getBigDecimal(monedaAConvertir);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

