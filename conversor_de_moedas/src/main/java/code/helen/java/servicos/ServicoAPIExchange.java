package code.helen.java.servicos;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ServicoAPIExchange {
    private static final String API_KEY = "15758a64b783afa99ed10e5d";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

    public double obterTaxaCambio(String moedaOrigem, String moedaDestino) throws IOException {
        String urlString = BASE_URL + API_KEY + "/latest/" + moedaOrigem;
        URL url = new URL(urlString);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        JsonObject jsonobj = root.getAsJsonObject();

        // Verificar o resultado da requisição
        String reqResult = jsonobj.get("result").getAsString();
        if (!reqResult.equals("success")) {
            throw new IOException("Falha na requisição da API: " + reqResult);
        }

        JsonObject ratesObject = jsonobj.getAsJsonObject("conversion_rates");

        // Verificar se a taxa de câmbio para a moeda de destino está presente
        if (!ratesObject.has(moedaDestino)) {
            throw new IOException("Taxa de câmbio para " + moedaDestino + " não encontrada");
        }

        double taxa = ratesObject.get(moedaDestino).getAsDouble();
        
        return taxa;
    }
}

