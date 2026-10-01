package questao1.src;

public class FabricaRodoviario extends CriadorModalidade {
    private String nomeCliente;
    private double valorCarga;

    public FabricaRodoviario(String nomeCliente, double valorCarga) {
        this.nomeCliente = nomeCliente;
        this.valorCarga = valorCarga;
    }

    @Override
    protected Modalidade criarModalidade() {
        return new ModalidadeRodoviario(nomeCliente, valorCarga);
    }
}