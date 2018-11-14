package Car;

/**
 * Created by mehrce on 11/9/2018.
 */
public class RepairMan {

    int repairPrice;

    public RepairMan (int repairPrice){
        this.repairPrice = repairPrice;
    }

    public void repair(Car car , Driver driver , Bank bank){
        if (driver.driverAccount.getBalance()>=repairPrice)
        bank.withdraw(driver.driverAccount,repairPrice);
        System.out.println("your car is repair");
        System.out.println("======================");;
        car.setHp(100);
    }

}
