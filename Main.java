import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //Items LM1
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


        //Enemies LM2
        Ogre greenOgre = new Ogre();
        Ogre redOgre = new Ogre();
        Zombie slowZombie = new Zombie();
        Zombie fastZombie = new Zombie();
        Dog spotDog = new Dog("Great Dane");
        LeBronJames leBronJames = new LeBronJames("Want a Sprite Cranberry?", "6 foot 8 inches", 230);

        System.out.println(greenOgre.name + " (HP: " + greenOgre.hp + " Damage: " + greenOgre.damage + ")");
        System.out.println(redOgre.name + " (HP: " + redOgre.hp + " Damage: " + redOgre.damage + ")");
        System.out.println(slowZombie.name + " (HP: " + slowZombie.hp + " Damage: " + slowZombie.damage + ", Speed: " + slowZombie.speed + ")");
        System.out.println(fastZombie.name + " (HP: " + fastZombie.hp + " Damage: " + fastZombie.damage + ", Speed: " + fastZombie.speed + ")");
        System.out.println(spotDog.name + " (HP: " + spotDog.hp + ", Damage: " + spotDog.damage + ", Breed: " + spotDog.breed + ")" );
        System.out.println(leBronJames.name + " (HP: " + leBronJames.hp + ", Damage: " + leBronJames.damage + ", Height: "
                + leBronJames.height + ", Weight (in lbs): " + leBronJames.weight + ", Description: " + leBronJames.line +")");

        //Actions LM3
        Rest rest = new Rest();
        Attack attack = new Attack();
        ViewInventory view = new ViewInventory();
        MoveSouth south = new MoveSouth();
        MoveNorth north = new MoveNorth();
        MoveWest west = new MoveWest();
        MoveEast east = new MoveEast();
        Flee flee = new Flee();
        System.out.println(attack.getHotkey() + ": " + attack.getName());
        System.out.println(rest.getHotkey() + ": " + rest.getName());
        System.out.println(view.getHotkey() + ": " + view.getName());
        System.out.println(south.getHotkey() + ": " + south.getName());
        System.out.println(north.getHotkey() + ": " + north.getName());
        System.out.println(west.getHotkey() + ": " + west.getName());
        System.out.println(east.getHotkey() + ": " + east.getName());
        System.out.println(flee.getHotkey() + ": " + flee.getName());

        //World Class/Map Class LM4
        Point point = new Point(2,3);
        MapTile map = new MapTile(1,3);
        World world = new World();
        world.load_tiles();
    }
}