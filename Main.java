public class Main {
    public int speed;
    public static void main(String[] args) {
        //LM1
        Sword magicSword = new Sword();
        Pillow softPillow = new Pillow();
        Mace bigMace = new Mace();
        Arrow sharpArrow = new Arrow();
        Gold goldBar = new Gold(25);
        System.out.println(goldBar);
        System.out.println(magicSword);
        System.out.println(softPillow);
        System.out.println(bigMace);
        System.out.println(sharpArrow);
        //LM2
        Ogre greenOgre = new Ogre();
        Ogre redOgre = new Ogre();
        Zombie slowZombie = new Zombie();
        Zombie fastZombie = new Zombie();
        Dog spotDog = new Dog();
        LeBronJames leBronJames = new LeBronJames("Want a Sprite Cranberry?", "6 foot 8 inches", 230);
        System.out.println(greenOgre.name + " (HP: " + greenOgre.hp + " Damage: " + greenOgre.damage + ")");
        System.out.println(redOgre.name + " (HP: " + redOgre.hp + " Damage: " + redOgre.damage + ")");
        System.out.println(slowZombie.name + " (HP: " + slowZombie.hp + " Damage: " + slowZombie.damage + ", Speed: " + slowZombie.speed + ")");
        System.out.println(fastZombie.name + " (HP: " + fastZombie.hp + " Damage: " + fastZombie.damage + ", Speed: " + fastZombie.speed + ")");
        System.out.println(spotDog.name + " (HP: " + spotDog.hp + ", Damage: " + spotDog.damage + ")");
        System.out.println(leBronJames.name + " (HP: " + leBronJames.hp + ", Damage: " + leBronJames.damage + ", Height: "
                + leBronJames.height + ", Weight (in lbs): " + leBronJames.weight + ", Description: " + leBronJames.line +")");

    }
}