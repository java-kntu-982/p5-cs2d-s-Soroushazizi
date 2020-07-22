package ir.ac.kntu.cs2d.Gun;

public class Gun {
    String name;
    int damage, price, magazineCapacity,millisToFireAgain;
    double reloadTime;
    boolean terroristCanUse;

    public Gun(String name, int damage, int price, int magazineCapacity, int millisToFireAgain, double reloadTime, boolean terroristCanUse) {
        this.name = name;
        this.damage = damage;
        this.price = price;
        this.magazineCapacity = magazineCapacity;
        this.millisToFireAgain = millisToFireAgain;
        this.reloadTime = reloadTime;
        this.terroristCanUse = terroristCanUse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMagazineCapacity() {
        return magazineCapacity;
    }

    public void setMagazineCapacity(int magazineCapacity) {
        this.magazineCapacity = magazineCapacity;
    }

    public int getMillisToFireAgain() {
        return millisToFireAgain;
    }

    public void setMillisToFireAgain(int millisToFireAgain) {
        this.millisToFireAgain = millisToFireAgain;
    }

    public double getReloadTime() {
        return reloadTime;
    }

    public void setReloadTime(double reloadTime) {
        this.reloadTime = reloadTime;
    }

    @Override
    public String toString() {
        return "Gun{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", price=" + price +
                ", magazineCapacity=" + magazineCapacity +
                ", millisToFireAgain=" + millisToFireAgain +
                ", reloadTime=" + reloadTime +
                '}';
    }
}
