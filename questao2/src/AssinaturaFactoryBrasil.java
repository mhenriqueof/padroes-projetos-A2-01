package questao2.src;

public class AssinaturaFactoryBrasil implements IAssinaturaFactory {
    @Override
    public IComprovanteFiscal criarComprovante() { return new BrNFSe(); }
    @Override
    public IMetodoPagamento criarPagamento() { return new BrPix(); }
    @Override
    public ITermoPrivacidade criarTermo() { return new BrLGPD(); }
}
