public class Dog extends Enemy{
    protected String breed;
    public Dog(String breed){
        super("Dog", 20, 15);
        this.breed = breed;
    }
}
