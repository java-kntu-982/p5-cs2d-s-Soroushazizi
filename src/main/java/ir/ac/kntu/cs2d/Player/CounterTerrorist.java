package ir.ac.kntu.cs2d.Player;

import ir.ac.kntu.cs2d.Gun.PrimaryGun;
import ir.ac.kntu.cs2d.Gun.SecondaryGun;
import ir.ac.kntu.cs2d.Gun.Usp;

public class CounterTerrorist extends Player{

    private static final SecondaryGun Usp = new Usp();

    public CounterTerrorist(String name, int health, int money, PrimaryGun primaryGun, SecondaryGun secondaryGun, boolean armor) {
        super("CounterTerrorist", 100, 800, primaryGun, Usp, false);
    }
}
