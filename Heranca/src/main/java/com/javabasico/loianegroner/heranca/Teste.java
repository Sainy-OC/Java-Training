package com.javabasico.loianegroner.heranca;

import java.util.Scanner;


public class Teste {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int index=0;
        
        ContaBancaria cPoupanca = new ContaPoupanca();
        ContaBancaria cEspecial = new ContaEspecial();
        ContaBancaria cCorrente = new ContaBancaria();
        
        do{
            System.out.println("Informe o tipo de conta a ser criado");
            System.out.println("0 - Conta Poupança");
            System.out.println("1 - Conta Especial");
            System.out.println("2 - Conta Corrente");
            System.out.println("3 - Sair");

            index = scan.nextInt();

            if(index==0){
                System.out.println("Informe um valor para deposito");
                cPoupanca.depositar(scan.nextDouble());

                System.out.println("Informe um valor para saque:");
                cPoupanca.sacar(scan.nextDouble());

                System.out.println("                ---                ");                
                System.out.println("Saldo: "+cPoupanca.getSaldo());
                System.out.println("                ---                ");
            }
            
            if(index==1){
                System.out.println("Informe um valor para deposito");
                cEspecial.depositar(scan.nextDouble());

                System.out.println("Informe um valor para saque:");
                cEspecial.sacar(scan.nextDouble());

                System.out.println("                ---                ");                
                System.out.println("Saldo: "+cEspecial.getSaldo());                
                System.out.println("                ---                ");
            }
            
            if(index==2){
                System.out.println("Informe um valor para deposito");
                cCorrente.depositar(scan.nextDouble());

                System.out.println("Informe um valor para saque:");
                cCorrente.sacar(scan.nextDouble());

                System.out.println("                ---                ");                
                System.out.println("Saldo: "+cCorrente.getSaldo());
                System.out.println("                ---                ");                
            }

        }while(index!=3);
        
    }
    
}
