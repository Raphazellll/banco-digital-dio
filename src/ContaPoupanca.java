public class ContaPoupanca extends Conta { // Classe herdando atributos da classe Conta.java

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança. ===");
        super.imprimirInfosComuns();

    }
}
