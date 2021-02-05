package com.javabasico.loianegroner.heranca;

import java.util.Date;

public final class ContaPoupanca extends ContaBancaria {
    private Date diaRendimento;
    
    
    public Date getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(Date diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
    
    public double calcularNovoSaldo(double taxa){
        super.setSaldo(super.getSaldo()*taxa);
        return super.getSaldo()*taxa;
    } 
}
