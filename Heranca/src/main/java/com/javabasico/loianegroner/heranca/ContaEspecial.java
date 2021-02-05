package com.javabasico.loianegroner.heranca;

public final class ContaEspecial extends ContaBancaria{
    
    private double limite;

    public ContaEspecial() {
    }

    public ContaEspecial( double saldo) {
        this.setSaldo(saldo);
        this.setLimite(saldo/2);
    }

    public double getLimite() {
        return this.limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(double saque) {
        if((saque>0)||(this.getSaldo()-saque>=0)||(saque<=this.limite)){
            this.setSaldo(this.getSaldo()-saque);  
        }   
    }
}
