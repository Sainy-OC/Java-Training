package com.javabasico.loianegroner.heranca;

import java.util.Random;

public class ContaBancaria {
    Random ran = new Random();
    
    
    private String nomeCliente;
    private String numConta;
    private double saldo;

    public ContaBancaria() {
        this.setNumConta((ran.nextInt()+1000)+"");
    }
    
    public ContaBancaria(String cliente) {
        this.setNomeCliente(cliente);
        this.setNumConta((ran.nextInt()+1000)+"");
    }

    public ContaBancaria(String cliente, double saldo) {
        this.setNumConta((ran.nextInt()+1000)+"");
        this.setNomeCliente(cliente);
        if(saldo>0){
            this.setSaldo(saldo);
        }               
    }
    
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void sacar(double saque){
        if((saque>0)&&(this.getSaldo()-saque)>=0){
            this.setSaldo(this.getSaldo()-saque);
        }
    }
    
    public double depositar(double deposito){
        if(deposito>0){
            this.setSaldo(this.getSaldo()+deposito);
        }
        return this.getSaldo();
    }
}
