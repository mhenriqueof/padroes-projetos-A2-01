package questao1.src;

import java.util.Arrays;
import java.util.List;

public class ModalidadeRodoviario extends Modalidade {
    private double valorCarga;

    public ModalidadeRodoviario(String nomeCliente, double valorCarga) {
        super(nomeCliente);
        this.valorCarga = valorCarga;
        this.modalidade = "Rodoviario";
    }

    @Override
    public double calcularFrete() {           
        return valorCarga * 0.02;
    }

    @Override
    public List<String> listarDocumentos() {
        return Arrays.asList("CT-e", "MDF-e");
    }
}
