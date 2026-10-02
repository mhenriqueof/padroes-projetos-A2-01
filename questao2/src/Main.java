package questao2.src;

public class Main {
    public static void finalizarPedido(IAssinaturaFactory factory, double valorTotal) {
        System.out.println("=========================================");
        System.out.println("INICIANDO ASSINATURA...");
        System.out.println("=========================================");

        IComprovanteFiscal com = factory.criarComprovante();
        IMetodoPagamento pag = factory.criarPagamento();
        ITermoPrivacidade etq = factory.criarTermo();

        System.out.println("1. COMPROVANTE FISCAL:");
        System.out.println("   " + com.gerarComprovante());
        
        System.out.println("\n2. PAGAMENTO:");
        System.out.println("   " + pag.processarPagamento(valorTotal));
        
        System.out.println("\n3. TERMO:");
        System.out.println("   " + etq.gerarTermo());
        
        System.out.println("=========================================\n");
    }

    public static void main(String[] args) {
        // Brasil
        IAssinaturaFactory fabricaBR = new AssinaturaFactoryBrasil();
        finalizarPedido(fabricaBR, 1000.0);

        // Mexico
        IAssinaturaFactory fabricaMX = new AssinaturaFactoryMexico();
        finalizarPedido(fabricaMX, 1000.0);
    }
}