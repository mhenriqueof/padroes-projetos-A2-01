package questao1.src;

public class FabricaAereo extends CriadorModalidade {
    private String nomeCliente;
    private double valorCarga;

    public FabricaAereo(String nomeCliente, double valorCarga) {
        this.nomeCliente = nomeCliente;
        this.valorCarga = valorCarga;
    }

    @Override
    protected Modalidade criarModalidade() {
        return new ModalidadeAereo(nomeCliente, valorCarga);
    }
}