package org.example;

public class Empresa extends Conta_Bancaria{

    private String cnpj;

    public Empresa(String nome, Tipo_Conta tipo_conta, double saldo,String cnpj) {
        super(nome, tipo_conta, saldo);
        this.cnpj = cnpj;
    }

    public String getCnpj(){
        return cnpj;
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

}
