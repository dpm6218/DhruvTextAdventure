public class FrontDoor extends MapTile{
    private static final String defaulttext = "The door is locked...maybe the key is somewhere in this house";
    private static final String keytext = "You use the key to unlock the front door and escape the house!";
    public FrontDoor(int x, int y){
        super(x, y);
    }
    public String intro_text(){
        if (Player.hasItem("Key"))
            return keytext;
        else{
            return defaulttext;
        }
    }
    public void modify_player(Player player){
        if (Player.hasItem("Key")){
            player.victory = true;
        }
    }
}
