package questao1.src;

public class Main {
    public static void main(String[] args) {
        // 1. Aereo
        CriadorModalidade fabricaAereo = new FabricaAereo("Tancredo", 1000.0);
        System.out.println(fabricaAereo.processarContratacao());

        // 2. Maritimo
        CriadorModalidade fabricaMaritimo = new FabricaMaritimo("Tancredo", 1000.0);
        System.out.println(fabricaMaritimo.processarContratacao());

        // 3. Rodoviario
        CriadorModalidade fabricaRodoviario = new FabricaRodoviario("Tancredo", 1000.0);
        System.out.println(fabricaRodoviario.processarContratacao());
    }
}
