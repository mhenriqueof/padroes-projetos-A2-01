package questao2.src;

public class BrNFSe implements IComprovanteFiscal {
    @Override
    public String gerarComprovante() {     
        return String.format("ISS de 5 porcento.");
    }
}
