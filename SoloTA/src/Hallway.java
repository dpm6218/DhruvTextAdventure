public class Hallway extends MapTile{
    public Hallway(int x, int y){
        super(x, y);
    }
    public String intro_text(){
        return String.format("Just an empty hallway. Lots of weird pictures on the wall.");
    }
    public void modify_player(Player player){}
}
