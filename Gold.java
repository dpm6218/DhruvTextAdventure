public class Gold extends Item{
    private int amt;

    public Gold(int amt){
        super("Gold", String.format("A thick bar with %s stamped on the front.", (amt)), amt);
        this.amt = amt;
    }
}
