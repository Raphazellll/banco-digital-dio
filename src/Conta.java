public abstract class Conta implements IConta { // SUPER CLASSE, CLASSE PAI
    protected static final int AGENCIA_PADRAO = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected static Cliente cliente;

    private static int SEQUENCIAL = 1;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;

    }

    // ==================================================================================
    // IMPLEMENTAÇÃO
    @Override
    public void sacar(double valor) {
        saldo -= valor; // subtraindo o valor
    }

    @Override
    public void depositar(double valor) {
        saldo += valor; // somando o valor
    }

    @Override
    public void transferir(Double valor, Conta contaDestino) {
        this.sacar(valor); // transferindo um valor da sua conta para outra
        contaDestino.depositar(valor);
    }

    // ==================================================================================

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Agencia: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

}
