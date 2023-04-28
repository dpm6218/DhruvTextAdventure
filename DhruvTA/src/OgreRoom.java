public class OgreRoom extends EnemyRoom{
    Ogre enemy;
    public OgreRoom(int x, int y, Ogre enemy) {
        super(x,y,enemy);
        this.enemy = enemy;
    }
    public String intro_text(){
        if (enemy.is_alive()){
            return "A Giant Cyclops comes out, the ground shivers as it charges towards you!";
        }
        else{
            return "A dead corpse of an Ogre lies on the ground";
        }
    }
}
