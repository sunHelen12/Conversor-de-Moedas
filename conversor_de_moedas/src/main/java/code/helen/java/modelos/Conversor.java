package code.helen.java.modelos;
import code.helen.java.servicos.ServicoAPIExchange;

public class Conversor {
    public static double converter(double valor, ServicoAPIExchange servicoAPIExchange, String moedaDestino) throws Exception {
        double taxaCambio = servicoAPIExchange.obterTaxaCambio("BRL", moedaDestino);
        return valor * taxaCambio;
    }
}
