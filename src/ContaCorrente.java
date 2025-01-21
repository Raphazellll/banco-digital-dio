public class ContaCorrente extends Conta { // Classe herdando atributos da classe Conta.java

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente. ===");
        super.imprimirInfosComuns();

    }

}
