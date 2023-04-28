public class Kitchen extends ItemRoom{
    public Kitchen(int x, int y, Knife knife){
        super(x, y, knife);
    }
    public String intro_text() {
        if (pickedItem == false) {
            return String.format("You walk into the kitchen and pick up a pretty big knife!\n This might come in handy later.");
        } else {
            return "Nothing really left in the kitchen, although it does smell pretty good in here.";
        }
    }
}
