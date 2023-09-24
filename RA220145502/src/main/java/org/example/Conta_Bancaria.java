package org.example;

public class Conta_Bancaria {

    private String nome;
    private Tipo_Conta tipo_conta;
    private double saldo;

    public Conta_Bancaria(String nome, Tipo_Conta tipo_conta, double saldo){
        this.nome = nome;
        this.tipo_conta = tipo_conta;
        this.saldo = saldo;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public Tipo_Conta getTipo_conta(){
        return tipo_conta;
    }
    public void setTipo_conta(Tipo_Conta tipoConta){
        this.tipo_conta = tipoConta;
    }

    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido. O valor deve ser maior que zero.");
        }
    }

    public void transferir(Conta_Bancaria contaBancaria, double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            Conta_Bancaria.depositar(valor);
            System.out.println("Transferência de R$" + valor + " realizada com sucesso ");
        } else if (valor <= 0) {
            System.out.println("Valor de transferência inválido. O valor deve ser maior que zero.");
        } else {
            System.out.println("Saldo insuficiente para realizar a transferência.");
        }
    }
    }
}
