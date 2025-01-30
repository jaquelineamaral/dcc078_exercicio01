package src.main.java.report;

import src.main.java.models.Conta;

import java.util.List;

public class RelatorioPdf implements Relatorio {

    public String gerarRelatorio(List<Conta> contas, String destino) {
        return "Gerando relatório em pdf...";
    }

}