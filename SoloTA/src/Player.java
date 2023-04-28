import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
public class Player {

    //Class Variables
    //Item inventory[];
    int hp;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    Boolean	 victory;
    int location_x, location_y;
    int prevLocatnX,prevLocatnY;
    static ArrayList<Item> inventory = new ArrayList<>();

    //Constructor method
    public Player(String name){
        super();
        this.name= name;
        inventory.add(new Scissors());
        this.hp = 140; // Health Points
        this.location_x = World.Starting_Position.x;
        this.location_y = World.Starting_Position.y;
        this.victory = false; //no victory on start up
    }

    public Player() {
        // TODO Auto-generated constructor stub
    }

    //	public void flee(MapTile tile){
//	    //Moves the player randomly to an adjacent tile
//        ArrayList<MapTile> available_moves = tile.adjacent_moves();
//        //r = random.randint(0, len(available_moves) - 1);
//        Random r = new Random();
//        //do_action(available_moves[r]);
//	}
//
    public boolean is_alive(){
        return (hp > 0);   //Greater than zero value then you are still alive
    }
    //

    public static boolean hasItem(String itemName) {
        for (Item item : inventory) {
            if (item.getName().equals(itemName)) {
                return true;
            }
        }
        return false;
    }

    public void writeToFile()
    {
        try {
            File fw = new File("Scores.txt");
            if(!fw.exists() )
            {
                fw.createNewFile();
            }

            FileWriter fobj= new FileWriter(fw,true);
            PrintWriter pobj = new PrintWriter(fobj);


            pobj.close();
            fobj.close();
            FileReader frdr = new FileReader(fw);
            BufferedReader brdr= new BufferedReader(frdr);
            String entry = "";
            ArrayList<Player> plyrs = new ArrayList<Player>();
            while((entry=brdr.readLine()) != null)
            {
                String arr[] = entry.split("\t");
                Player plyr = new Player();
                plyr.setName(arr[0]);

                plyrs.add(plyr);
            }


            for(Player p:plyrs)
            {
                System.out.println("Name:"+p.getName());

            }

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }


    }

    public void move(int dx, int dy){
        prevLocatnX = location_x;
        prevLocatnY = location_y;
        location_x += dx;
        location_y += dy;
        System.out.print(World.tile_exists(location_x, location_y).intro_text());
    }

    public void go_straight(){
        move(-1,0);
    }

    public void go_down(){
        move(1,0);
    }

    public void go_right(){
        move(0,1);
    }

    public void go_left(){
        move(0,-1);
    }

    public void doFlee(MapTile mp)
    {
        ArrayList<Action> available_moves = mp.adjacent_moves();
        Random rn=new Random();
        int random=rn.nextInt(available_moves.size());
        Action randomAction=available_moves.get(random);
        do_action(randomAction, null, null);

    }


    public void attackEnemy(Enemy enemy)
    {
        Weapon best_weapon = new Weapon("None", "None", 0, 0);
        int max_dmg = 0;
        for (Item i:inventory){
            if (i instanceof Weapon){
                Weapon wpn = (Weapon)i;
                if (wpn.getDamage() > max_dmg){
                    max_dmg = wpn.getDamage();
                    best_weapon = wpn;
                }
            }
        } //End Code block for loop
        System.out.printf("You use %s against %s!",best_weapon.name, enemy.name);
        enemy.hp -= best_weapon.getDamage();
        if (!enemy.is_alive()){
            System.out.printf("\nYou killed %s!",enemy.name);
        }else{
            System.out.printf("\n %s HP is %d.",enemy.name, enemy.hp);
        }
    }


    public void do_action(Action action, Enemy kwargs,MapTile mp){
        if(kwargs == null)
        {
            if(action instanceof GoRight)
            {
                go_right();
            }else if (action instanceof GoLeft)
            {
                go_left();
            }else if (action instanceof GoStraight)
            {
                go_straight();
            }else if (action instanceof GoDown)
            {
                go_down();
            }else if (action instanceof ViewInventory)
            {
                print_inventory();
            }
        }
        else if (action instanceof Attack)
        {
            attackEnemy(kwargs);
        }

    } //End Code block do_attack method*/
    public void print_inventory() {
        for (Item item : inventory) {
            System.out.println(item.toString());
        }
    }

} //End Code block class