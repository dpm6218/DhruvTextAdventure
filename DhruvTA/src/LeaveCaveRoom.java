public class LeaveCaveRoom extends MapTile{
    public LeaveCaveRoom(int x, int y){
        super(x, y);
    }
    public String intro_text(){
        return "Congratulations, you've made it out the cave alive!";
    }
    public void modify_player(Player player){}
}
