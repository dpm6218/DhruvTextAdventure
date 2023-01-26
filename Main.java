public class Main {
    public static void main(String[] args){
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
    }
}