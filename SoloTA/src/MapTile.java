import java.util.ArrayList;
import java.util.Map;
public class MapTile {
    int x;
    int y;

    public MapTile(int x, int y){
        this.x = x;
        this.y = y;
    }
    //    public MapTile[] adjacent_moves(){
//        MapTile[] moves = new MapTile[4];
//        moves[0] = new MapTile(x + 1, y);
//        moves[1] = new MapTile(x - 1, y);
//        moves[2] = new MapTile(x, y + 1);
//        moves[3] = new MapTile(x, y - 1);
//        return moves;
//    }
    public ArrayList<Action> adjacent_moves(){
        ArrayList<Action> moves = new ArrayList<Action>();
        if (World.tile_exists(x, y + 1) != null)
            moves.add(new GoRight());
        if (World.tile_exists(x, y - 1) != null)
            moves.add(new GoLeft());
        if (World.tile_exists(x - 1, y) != null)
            moves.add(new GoStraight());
        if (World.tile_exists(x + 1, y) != null)
            moves.add(new GoDown());
        return moves;
    }
    public String intro_text(){
        throw new UnsupportedOperationException();
    }
    public void modify_player(Player player){
        throw new UnsupportedOperationException();
    }
    public ArrayList<Action> available_actions(){
        ArrayList<Action> moves = new ArrayList<Action>();
        moves = adjacent_moves();
        moves.add(new ViewInventory());
        return moves;
    }
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MapTile other = (MapTile) obj;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }
}