package questao2.src;

public class MxSPEI implements IMetodoPagamento {
    @Override
    public String processarPagamento(double valor) {
        return String.format("Pix aprovado com 16 porcento de IVA. Valor final: R$ " + valor * 1.16);
    }
}
