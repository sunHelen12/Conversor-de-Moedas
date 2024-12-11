package code.helen.java.modelos;

import java.util.ArrayList;
import java.util.List;

public class HistoricoConversoes {
    private List<Conversao> historico;

    public HistoricoConversoes() {
        this.historico = new ArrayList<>();
    }

    public void adicionarConversao(Conversao conversao) {
        historico.add(conversao);
    }

    public void exibirHistorico() {
        if (historico.isEmpty()) {
            System.out.println("Nenhuma conversão realizada.");
        } else {
            System.out.println("=============== Histórico de Conversões ===============");
            for (Conversao c : historico) {
                System.out.println(c);
            }
        }
    }
}

