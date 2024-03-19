package com.banconosso.service;

public class ContaTerminal {

    public void printbalance(int account, double balance, String bankbranch, String name){
        System.out.println("Olá  "+name+", obrigado por criar uma conta em nosso banco, sua agência "+bankbranch+", conta "+account+" e seu saldo "+balance+" já está disponivel!");
    }
}
