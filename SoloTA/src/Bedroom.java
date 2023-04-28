public class Bedroom extends MapTile{
    public Bedroom(int x, int y){ super (x, y);}
    public String intro_text(){
        return "\nYou wake up out of a bed and have no idea where you are. \nTry to find the key to the front door and escape! ";
    }
    public void modify_player(Player player){}
}
