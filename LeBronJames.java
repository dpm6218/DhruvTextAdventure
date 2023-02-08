public class LeBronJames extends Enemy{
    protected String line;
    protected String height;
    protected int weight;
    public LeBronJames(String line, String height, int weight){
        super("LeBron James", 999, 50);
        this.line = line;
        this.height = height;
        this.weight = weight;
    }
}
