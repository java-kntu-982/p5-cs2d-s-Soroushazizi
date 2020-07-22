package ir.ac.kntu.cs2d.Player;

import ir.ac.kntu.cs2d.Gun.PrimaryGun;
import ir.ac.kntu.cs2d.Gun.SecondaryGun;

public class Player {
    private String name;
    private int health, money;
    private PrimaryGun primaryGun;
    private SecondaryGun secondaryGun;
    private boolean armor;

    public Player(String name, int health, int money, PrimaryGun primaryGun, SecondaryGun secondaryGun, boolean armor) {
        this.name = name;
        setHealth(health);
        this.money = money;
        this.primaryGun = primaryGun;
        this.secondaryGun = secondaryGun;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(getArmor()){
            this.health = health + 150;
        }else{
            this.health = health;
        }
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public PrimaryGun getPrimaryGun() {
        return primaryGun;
    }

    public void setPrimaryGun(PrimaryGun primaryGun) {
        this.primaryGun = primaryGun;
    }

    public SecondaryGun getSecondaryGun() {
        return secondaryGun;
    }

    public void setSecondaryGun(SecondaryGun secondaryGun) {
        this.secondaryGun = secondaryGun;
    }

    public boolean getArmor() {
        return armor;
    }

    public void setArmor(boolean armor) {
        this.armor = armor;
    }

    @Override
    public String toString() {
        return "Terrorist{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", money=" + money +
                ", primaryGun=" + primaryGun +
                ", secondaryGun=" + secondaryGun +
                ", armor=" + armor +
                '}';
    }
}
