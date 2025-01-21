public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }
    // Classe herdando atributos da classe Conta.java

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança. ===");
        super.imprimirInfosComuns();

    }
}
