package questao1.src;

import java.util.List;

public abstract class Modalidade {
    protected String modalidade;
    protected String nomeCliente;
    protected double valorFrete;

    public Modalidade(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public abstract double calcularFrete();
    public abstract List<String> listarDocumentos();
    
    public final String gerarResumo() {
        this.valorFrete = calcularFrete();

        StringBuilder sb = new StringBuilder();
        sb.append("=========================================\n");
        sb.append("RESUMO DA CONTRATACAO\n");
        sb.append("=========================================\n");
        sb.append("Nome Cliente: ").append(this.nomeCliente).append("\n");
        sb.append("Modalidade: ").append(this.modalidade).append("\n");
        sb.append("Valor Frete: R$ ").append(String.format("%.2f", this.calcularFrete())).append("\n");
        sb.append("Documentos Exigidos: ").append(String.join(", ", listarDocumentos())).append("\n");
        sb.append("=========================================\n");
        
        return sb.toString();
    }
}