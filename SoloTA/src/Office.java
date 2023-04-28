public class Office extends ItemRoom{
    public Office(int x, int y, Key key){
        super(x, y, key);
    }
    public String intro_text(){
        if(pickedItem == false){
            return String.format("You walk into the office and find the keys to the door!\n Head back and escape!");
        }
        else{
            return "What are you doing back here? Go escape!";
        }
    }
}
