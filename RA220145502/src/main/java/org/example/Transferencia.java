package org.example;

public class Transferencia {

    private double saldo;

    public void Conta_Bancaria(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void transferir(Conta_Bancaria outraConta, double valor) {
        if (valor <= saldo) {
            outraConta.depositar(valor);
            saldo -= valor;
            System.out.println("Transferência de R$" + valor + " realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para a transferência.");
        }
    }


}
