package client;

public class Health {
    private int health= 100; //default to  100
    private int damage = 5; //default for -5 hit
    private int healing = 5; //default for +5 healing

    //Getters and setters
    public void setDamage(int damage) {  //can be variable based on attack. default called when not specified.
        this.damage = damage;
    }

    public void setHealing(int healing) { //can be variable based on attack. default called when not specified.
        this.healing = healing;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealing() {
        return healing;
    }

    //methods

    public void attack(){ //method to deal damage to health points
        health -= damage;

        if(health <= 0) {
            System.out.println("You have been defeated");
        }
        else {
            System.out.printf("Damage taken: %s  Remaining Health: %s", getDamage(), getHealth());
        }

    }

    public void healing(){
        health += healing;

        if(health > 100) {
            health = 100;
            System.out.println("You have no damage to be healed");
        }
        else {
            System.out.printf("You have healed by: %s   Health: %s", getHealing(), getHealth());
        }

    }
}