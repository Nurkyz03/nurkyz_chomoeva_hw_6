public class Skeleton extends Boss {
    protected int arrows;

    public Skeleton(String name, int health, Weapon weapon, int arrows) {
        super(name, health, weapon);
        this.arrows = arrows;
    }

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    @Override
    public void printInfo() {
        System.out.println("Skeleton: " + name);
        System.out.println("Health: " + health);
        System.out.println("Weapon: " + weapon.getName() + " (" + weapon.getType() + ")");
        System.out.println("Arrows: " + arrows);
    }
}
