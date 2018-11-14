package com.mehrde.Car;

/**
 * Created by mehrde on 11/9/2018.
 */
public class CarWash {

    int washPrice;

    public CarWash (int washPrice){
        this.washPrice = washPrice;
    }

    public void washCar(Car car , Driver driver , Bank bank){
        if (driver.driverAccount.getBalance()>=washPrice)
            bank.withdraw(driver.driverAccount,washPrice);
        System.out.println("your car is clean");
        System.out.println("======================");;
        car.setDirty(0);
    }
}
