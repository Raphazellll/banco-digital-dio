public class ContaCorrente extends Conta { // Classe herdando atributos da classe Conta.java

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente. ===");
        super.imprimirInfosComuns();

    }

}
