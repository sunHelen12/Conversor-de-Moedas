package code.helen.java.modelos;

public class Conversao {
    private double valorOriginal;
    private double valorConvertido;
    private String moedaOrigem;
    private String moedaDestino;
    private String timestamp;

    public Conversao(double valorOriginal, double valorConvertido, String moedaOrigem, String moedaDestino, String timestamp) {
        this.valorOriginal = valorOriginal;
        this.valorConvertido = valorConvertido;
        this.moedaOrigem = moedaOrigem;
        this.moedaDestino = moedaDestino;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return String.format("Data: %s | %f %s = %f %s", timestamp, valorOriginal, moedaOrigem, valorConvertido, moedaDestino);
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getMoedaOrigem() {
        return moedaOrigem;
    }

    public String getMoedaDestino() {
        return moedaDestino;
    }
}
