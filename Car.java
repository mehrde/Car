package Car;

/**
 * Created by mehrce on 11/9/2018.
 */
public class Car {

    // Car Field

    private String name;
    private int hp;
    private int dirty;
    private int fuelCapacity;
    private int fuel;

    private boolean isFuelCapacitySet;
    private boolean isCarStart = false;

    // Car Method

    public void startCar(){
        isCarStart = true;
        System.out.println("your " + name + " is started!");
        System.out.println("now your hp is : " + hp + "  , fuel is : " + fuel + " , dirty is : " + dirty);
        System.out.println("============================");
    }

    public void move(){
        if (isCarStart && hp >=10 && fuel>0){
            System.out.println("Your " + name + " is moving!");
            hp -= 10;
            fuel -=10;
            if (fuel<0){
                fuel =0;
            }
            dirty +=10;
            if (dirty>100){
                System.out.println("your car is dirty!");
            }
        } else if (!isCarStart){
            System.out.println("Your " + name + " is not start!");
        } else if (hp < 10){
            System.out.println("Your " + name + " need repairing!");
        } else if (fuel <= 0){
        System.out.println("Your " + name + " dont have any fuel!");
        }
        System.out.println("now your hp is : " + hp + "  , fuel is : " + fuel + " , dirty is : " + dirty);
        System.out.println("==================================");
    }

    public void stop(){

    }

    // SETTER AND GETTER


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDirty() {
        return dirty;
    }

    public void setDirty(int dirty) {
        this.dirty = dirty;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        if (fuel <= fuelCapacity){
            this.fuel = fuel;
        } else {
            System.out.println("your fuel is more than fuel capacity of your car!");
        }

    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        if (!isFuelCapacitySet){
            this.fuelCapacity = fuelCapacity;
        }
        else {
            System.out.println("you cant change fuel capacity!");
        }
        isFuelCapacitySet = true;
    }
}
