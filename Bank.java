package com.mehrde.Car;

/**
 * Created by mehrde on 11/9/2018.
 */
public class Bank {

    public boolean withdraw(Account account, double amount){
        System.out.println("your money now is : " + account.getBalance());
        if(amount<=account.getBalance()){
            account.setBalance(account.getBalance()-amount);
            System.out.println("your balance withdraw " + amount + " and you have " + account.getBalance() + " money now!");
            return true;
        } else {
            System.out.println("you dont have " + amount +" money in your account !");
            return false;
        }
    }

    public void deposit(Account account, double amount){
        System.out.println("your money now is : " + account.getBalance());
        account.setBalance(account.getBalance()+amount);
        System.out.println("your balance deposit " + amount + " and you have " + account.getBalance() + " money now!");
    }

}

