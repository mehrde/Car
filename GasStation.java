package com.mehrde.Car;

/**
 * Created by mehrde on 11/9/2018.
 */
public class GasStation {

    int gasPrice;

    public GasStation(int gasPrice){
        this.gasPrice = gasPrice;
    }

    public void fillFuel(Car car , Driver driver , int amount , Bank bank){
        int amountOfFillGas;
        System.out.println("you have " + car.getFuel() + " fuel in your car" +
                            " and want " + amount +" fuel" +
                            " and the price of 1 liter gasoline is " + gasPrice + " tomans" );
            if (amount + car.getFuel() <= car.getFuelCapacity()) {
                if (bank.withdraw(driver.driverAccount ,amount*gasPrice)) {
                    amountOfFillGas = amount;
                    car.setFuel(car.getFuel() + amountOfFillGas);
                }
            } else {
                amountOfFillGas = car.getFuelCapacity() - car.getFuel();
                if (bank.withdraw(driver.driverAccount ,amountOfFillGas*gasPrice)) {

                    System.out.println("Because you want fuel more than fuel capacity," +
                            " i fill " + (amountOfFillGas) + " fuel in your car");
                    car.setFuel(car.getFuel() + amountOfFillGas);
                }
            }
        System.out.println("==========================");
    }
}
