public class Enemy {
    protected String name;
    protected int hp;
    protected int damage;

    protected String line;
    protected String height;
    protected int weight;
    public int speed;

    public Enemy(String name, int hp, int damage){
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }
    public Enemy(String name, int hp, int damage, String line, String height, int weight){
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.line = line;
        this.height = height;
        this.weight = weight;
    }
    public Enemy(String name, int hp, int damage, int speed){
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.speed = speed;
    }
    public boolean is_alive(){
        return (this.hp > 0);
    }
}
