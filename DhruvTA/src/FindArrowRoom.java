public class FindArrowRoom extends LootRoom{
    public FindArrowRoom(int x, int y, Arrow arrow){
        super(x, y, arrow);
    }
    public String intro_text(){
        if(pickedItem == false)
            return String.format("a fresh arrow lays on the ground...has someone been here before?");
        else
            return "";
    }
}
