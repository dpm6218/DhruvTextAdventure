public class EmptyCavePath extends MapTile{
    public EmptyCavePath(int x, int y){
        super(x, y);
    }
    public String intro_text(){
        return String.format("Nothing in this room, try going ahead or to a different room.");
    }
    public void modify_player(Player player){}
}
