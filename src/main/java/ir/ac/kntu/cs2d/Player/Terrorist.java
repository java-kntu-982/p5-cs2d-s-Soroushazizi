package ir.ac.kntu.cs2d.Player;

import ir.ac.kntu.cs2d.Gun.Glock;
import ir.ac.kntu.cs2d.Gun.PrimaryGun;
import ir.ac.kntu.cs2d.Gun.SecondaryGun;

public class Terrorist extends Player{

    private static final SecondaryGun Glock = new Glock();

    public Terrorist(String name, int health, int money, PrimaryGun primaryGun, SecondaryGun secondaryGun, boolean armor) {
        super("Terrorist", 100, 800, primaryGun, Glock, false);
    }
}
