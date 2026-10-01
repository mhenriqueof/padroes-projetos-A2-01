package questao1.src;

public class FabricaMaritimo extends CriadorModalidade {
    private String nomeCliente;
    private double valorCarga;

    public FabricaMaritimo(String nomeCliente, double valorCarga) {
        this.nomeCliente = nomeCliente;
        this.valorCarga = valorCarga;
    }

    @Override
    protected Modalidade criarModalidade() {
        return new ModalidadeMaritimo(nomeCliente, valorCarga);
    }
}