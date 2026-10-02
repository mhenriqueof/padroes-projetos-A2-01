package questao2.src;

public interface IAssinaturaFactory {
    IComprovanteFiscal criarComprovante();
    IMetodoPagamento criarPagamento();
    ITermoPrivacidade criarTermo();
}
