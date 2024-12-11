package code.helen.java.aplicacao;
import java.util.Scanner;

import code.helen.java.modelos.Conversao;
import code.helen.java.modelos.Conversor;
import code.helen.java.modelos.HistoricoConversoes;
import code.helen.java.servicos.ServicoAPIExchange;
import code.helen.java.util.Logger;



public class AplicacaoConversaoMoeda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorConvertido = 0;
        ServicoAPIExchange servicoAPIExchange = new ServicoAPIExchange();
        HistoricoConversoes historicoConversoes = new HistoricoConversoes();
        Logger logger = new Logger();

        // Menu de opções
        while (true) {
            System.out.println("================= Conversor de Moedas =================");
            System.out.println("1. Real para Peso Argentino (ARS)");
            System.out.println("2. Real para Boliviano (BOB)");
            System.out.println("3. Real para Peso Chileno (CLP)");
            System.out.println("4. Real para Peso Colombiano (COP)");
            System.out.println("5. Real para Dólar Americano (USD)");
            System.out.println("6. Consultar histórico de conversões");
            System.out.println("7. Sair");
            System.out.println("=======================================================");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            if (opcao == 7) {
                System.out.println("Saindo...");
                break;
            }

            if (opcao == 6) {
                historicoConversoes.exibirHistorico();
                continue;
            }

            System.out.print("Digite o valor em Real (BRL) para conversão: ");
            double valorEmReal = scanner.nextDouble();

            // Determinar a moeda-alvo com base na escolha do usuário
            String moedaAlvo = "";
            try {
                switch (opcao) {
                    case 1:
                        moedaAlvo = "ARS";
                        break;
                    case 2:
                        moedaAlvo = "BOB";
                        break;
                    case 3:
                        moedaAlvo = "CLP";
                        break;
                    case 4:
                        moedaAlvo = "COP";
                        break;
                    case 5:
                        moedaAlvo = "USD";
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        continue;
                }

                // Obter as taxas de câmbio e realizar a conversão
                valorConvertido = Conversor.converter(valorEmReal, servicoAPIExchange, moedaAlvo);
                System.out.println("Valor convertido: " + valorConvertido + " " + moedaAlvo);

                // Registrar a conversão
                Conversao conversao = new Conversao(valorEmReal, valorConvertido, "BRL", moedaAlvo, logger.getCurrentTimestamp());
                historicoConversoes.adicionarConversao(conversao);
                logger.registrarLog(conversao);

            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        scanner.close();
    }
}
