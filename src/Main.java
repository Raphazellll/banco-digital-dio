public class Main {
    public static void main(String[] args) {

        Cliente raphael = new Cliente();
        raphael.setNome("Raphael Martins Pimenta");

        Conta cc = new ContaCorrente(raphael);
        Conta poupanca = new ContaPoupanca(raphael);

        cc.depositar(100);
        cc.transferir((double) 100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
