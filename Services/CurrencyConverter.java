package Services;

import com.google.gson.*;
import models.ExchangeRate;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CurrencyConverter implements ICurrencyConverter {
    private String url = "https://v6.exchangerate-api.com/v6/59167d2e124104760e0a505e/latest/";

    public URI getUrl(Currencies currency) {
        return switch (currency) {
            case AmericanDolar -> URI.create(url + "USD");
            case MexicanPeso -> URI.create(url + "MXN");
            case ArgentinePeso -> URI.create(url + "ARS");
            case ColombianPeso -> URI.create(url + "COP");
            case RealBresileño -> URI.create(url + "BRL");
            case Euro -> URI.create(url + "EUR");
        };
    }

    @Override
    public float getConversion(Currencies from, Currencies to, float amount) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            float result = 0;
            float toValue = 0;
            URI fromUri = getUrl(from);
            HttpRequest fromRequest = HttpRequest.newBuilder().uri(fromUri).build();
            HttpResponse<String> fromResponse = client.send(fromRequest, HttpResponse.BodyHandlers.ofString());
            Gson gson = new GsonBuilder()
                    .create();
            ExchangeRate exchangeRate = gson.fromJson(fromResponse.body(), ExchangeRate.class);
            switch (to) {
                case AmericanDolar -> {
                    toValue = exchangeRate.getConversionRates("USD");
                }
                case MexicanPeso -> {
                    toValue = exchangeRate.getConversionRates("MXN");

                }
                case ArgentinePeso -> {
                    toValue = exchangeRate.getConversionRates("ARS");

                }
                case ColombianPeso -> {
                    toValue = exchangeRate.getConversionRates("COP");
                }
                case RealBresileño -> {

                    toValue = exchangeRate.getConversionRates("BRL");

                }
                case Euro -> {
                    toValue = exchangeRate.getConversionRates("EUR");

                }
            }
            result = toValue * amount;
            return result;
        } catch (Exception e) {
            System.out.println("Ocurrio un error interno, favor de llamar a soporte...");
            throw new RuntimeException(e);
        }
    }
}