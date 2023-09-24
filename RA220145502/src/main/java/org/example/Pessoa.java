package org.example;

public  class Pessoa extends Conta_Bancaria{
    private String cpf;
    private Estado_Civil estado_civil;

    public Pessoa(String nome, Tipo_Conta tipo_conta, double saldo, String cpf, Estado_Civil estado_civil) {
        super(nome, tipo_conta, saldo);
        this.cpf = cpf;
        this.estado_civil = estado_civil;
    }

    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public Estado_Civil getEstado_civil(){
        return estado_civil;
    }
    public void setEstado_civil(Estado_Civil estadoCivil){
        this.estado_civil = estadoCivil;
    }
}
