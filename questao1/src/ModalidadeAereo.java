package questao1.src;

import java.util.Arrays;
import java.util.List;

public class ModalidadeAereo extends Modalidade {
    private double valorCarga;

    public ModalidadeAereo(String nomeCliente, double valorCarga) {
        super(nomeCliente);
        this.valorCarga = valorCarga;
        this.modalidade = "Aereo";
    }

    @Override
    public double calcularFrete() {           
        return valorCarga * 0.06;
    }

    @Override
    public List<String> listarDocumentos() {
        return Arrays.asList("AWB (Air Waybill)");
    }
}
