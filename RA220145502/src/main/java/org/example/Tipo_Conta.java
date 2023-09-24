package org.example;

public class Tipo_Conta{

    Tipo_Conta salario = new Tipo_Conta();
    Tipo_Conta corrente = new Tipo_Conta();
    Tipo_Conta conta_conjunta = new Tipo_Conta();
    Tipo_Conta poupanca(){
        Tipo_Conta poupanca = new Tipo_Conta() {
            private double valor_minimo;
            public void poupanca(double valor_minimo) {
                if (valor_minimo < 50.0) {
                    System.out.println("Valor Insuficiente");
                } else {
                    System.out.println("Ação realizada com sucesso");
                }
            }
        };
        return poupanca;
    }
}
