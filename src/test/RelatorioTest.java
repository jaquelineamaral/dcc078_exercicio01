package src.test;

import src.main.java.models.Conta;
import src.main.java.models.Despesa;
import src.main.java.models.Receita;
import src.main.java.report.Relatorio;
import src.main.java.report.RelatorioCsv;
import src.main.java.report.RelatorioPdf;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class RelatorioTest {

    private List<Conta> criarListaDeContas() {
        List<Conta> contas = new ArrayList<>();
        Receita receita = new Receita();
        receita.setDescricao("Salário");
        receita.setValor(5000.0f);
        receita.setData(LocalDate.now());

        Despesa despesa = new Despesa();
        despesa.setDescricao("Aluguel");
        despesa.setValor(1500.0f);
        despesa.setData(LocalDate.now());

        contas.add(receita);
        contas.add(despesa);
        return contas;
    }

    @Test
    public void deveGerarRelatorioCsv() {
        Relatorio relatorioCsv = new RelatorioCsv();
        List<Conta> contas = criarListaDeContas();
        String resultado = relatorioCsv.gerarRelatorio(contas, "relatorio.csv");

        assertEquals("Gerando relatório em csv...", resultado, "Mensagem de geração do CSV incorreta");
    }

    @Test
    public void deveGerarRelatorioPdf() {
        Relatorio relatorioPdf = new RelatorioPdf();
        List<Conta> contas = criarListaDeContas();
        String resultado = relatorioPdf.gerarRelatorio(contas, "relatorio.pdf");

        assertEquals("Gerando relatório em pdf...", resultado, "Mensagem de geração do PDF incorreta");
    }
}