public class Boss extends GameEntity {
    protected Weapon weapon;

    public Boss(String name, int health, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void printInfo() {
        System.out.println("Boss: " + name);
        System.out.println("Health: " + health);
        System.out.println("Weapon: " + weapon.getName() + " (" + weapon.getType() + ")");
    }
}

