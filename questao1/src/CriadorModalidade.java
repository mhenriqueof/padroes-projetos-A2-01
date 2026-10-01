package questao1.src;

public abstract class CriadorModalidade {

    protected abstract Modalidade criarModalidade();

    public final String processarContratacao() {
        Modalidade modalidade = this.criarModalidade();

        return "CONTRATAÇÃO REALIZADA!\n" + modalidade.gerarResumo();
    }
}
