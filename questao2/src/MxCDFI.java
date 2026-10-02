package questao2.src;

public class MxCDFI implements IComprovanteFiscal {
    @Override
    public String gerarComprovante() {     
        return String.format("IVA de 16 porcento");
    }
}
