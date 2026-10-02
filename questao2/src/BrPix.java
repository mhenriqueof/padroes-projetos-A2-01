package questao2.src;

public class BrPix implements IMetodoPagamento {
    @Override
    public String processarPagamento(double valor) {
        return String.format("Pix aprovado com 5 porcento de ISS. Valor final: R$ " + valor * 1.05);
    }
}
