package src.main.java.report;

import src.main.java.models.Conta;
import java.util.List;


public interface Relatorio {
    String gerarRelatorio (List<Conta> contas, String destino);
}
