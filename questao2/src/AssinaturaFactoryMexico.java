package questao2.src;

public class AssinaturaFactoryMexico implements IAssinaturaFactory {
    @Override
    public IComprovanteFiscal criarComprovante() { return new MxCDFI(); }
    @Override
    public IMetodoPagamento criarPagamento() { return new MxSPEI(); }
    @Override
    public ITermoPrivacidade criarTermo() { return new MxLFPDPPP(); }
}
