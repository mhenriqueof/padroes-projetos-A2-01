package questao1.src;

import java.util.Arrays;
import java.util.List;

public class ModalidadeMaritimo extends Modalidade {
    private double valorCarga;

    public ModalidadeMaritimo(String nomeCliente, double valorCarga) {
        super(nomeCliente);
        this.valorCarga = valorCarga;
        this.modalidade = "Maritimo";
    }

    @Override
    public double calcularFrete() {           
        return valorCarga * 0.01;
    }

    @Override
    public List<String> listarDocumentos() {
        return Arrays.asList("BL (Bill of Lading)", "Fatura Comercial");
    }
}
