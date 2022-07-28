package br.com.dio.banco;

public class Main {

    public static void main(String[] args) {
        Cliente Eduardo = new Cliente();
        Eduardo.setNome("Eduardo");
        Conta cc = new ContaCorrente(Eduardo);
        cc.depositar(100);
        Conta poupanca = new ContaPoupanca(Eduardo);

        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
