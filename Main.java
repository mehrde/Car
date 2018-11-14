package com.mehrde.Car;

import java.util.Scanner;

/**
 * Created by mehrde on 11/9/2018.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car = new Car();
        GasStation gasStation = new GasStation(1000);
        RepairMan repairMan = new RepairMan(20000);
        Driver driver = new Driver();
        Bank bank = new Bank();
        CarWash carWash = new CarWash(10000);
        boolean doYouWantContinueGame = true;
        System.out.println("Hi Driver");

        System.out.println("what is your name? : ");
        driver.driverAccount.setName(scanner.next());
        System.out.println("what is your Family? : ");
        driver.driverAccount.setFamily(scanner.next());
        System.out.println("what is your car name? : ");
        car.setName(scanner.next());
        System.out.println("how much your " + car.getName() + " fuel capacity? : ");
        car.setFuelCapacity(scanner.nextInt());
        System.out.println("how much your " + car.getName() + " have fuel now? : ");
        car.setFuel(scanner.nextInt());
        System.out.println("how much your " + car.getName() + " healthy? : ");
        car.setHp(scanner.nextInt());
        System.out.println("how much your " + car.getName() + " dirty? : ");
        car.setDirty(scanner.nextInt());
        System.out.println("How much your money in bank? : ");
        driver.driverAccount.setBalance(scanner.nextInt());
        System.out.println("=========================");
        System.out.println("aliok , now you can use your " + car.getName() + " with use below functions :");
        System.out.println("Type : ");
        System.out.println("\"start\" for start the car.");
        System.out.println("\"move\" for move the car.");
        System.out.println("\"stop\" for stop the car.");
        System.out.println("\"carwash\" for going the car to carwash.");
        System.out.println("\"fillgas\" for going the car to gas station.");
        System.out.println("\"repair\" for going the car to repairing");
        System.out.println("\"end\" for end the game");
        System.out.println("=========================");

        while(doYouWantContinueGame){
            System.out.println("Enter your order :");
            String order = scanner.next();
            if (order.equals("start")){
                car.startCar();
            }
            if (order.equals("move")){
                car.move();
            }
            if (order.equals("stop")){
                car.stop();
            }
            if (order.equals("carwash")){
                carWash.washCar(car,driver,bank);
            }
            if (order.equals("fillgas")){
                System.out.println("how much do you want fill gas? : ");
                int amount = scanner.nextInt();
                gasStation.fillFuel(car,driver,amount,bank);
            }
            if (order.equals("repair")){
                repairMan.repair(car,driver,bank);
            }
            if (order.equals("end")){
                return;
            }
        }
    }
}
