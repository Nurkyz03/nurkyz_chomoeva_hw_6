public class Main {
    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon(WeaponType.MACHINEGUN, "M249");
        Boss boss = new Boss("Monster Boss", 500, bossWeapon);
        boss.printInfo();

        System.out.println("_______________________");

        Weapon skeletonWeapon1 = new Weapon(WeaponType.FIREARMS, "AK47");
        Weapon skeletonWeapon2 = new Weapon(WeaponType.RIFLE, "M16");
        Skeleton skeleton1 = new Skeleton("Skeleton Warrior", 250, skeletonWeapon1, 30);
        Skeleton skeleton2 = new Skeleton("Skeleton Archer", 200, skeletonWeapon2, 20);

        skeleton1.printInfo();
        System.out.println("_______________________");
        skeleton2.printInfo();
    }
}