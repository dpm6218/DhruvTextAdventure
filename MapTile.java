import java.util.Map;
public class MapTile {
    int x;
    int y;

    public MapTile(int x, int y){
        this.x = x;
        this.y = y;
    }
    public MapTile[] adjacent_moves(){
        MapTile[] moves = new MapTile[4];
        moves[0] = new MapTile(x + 1, y);
        moves[1] = new MapTile(x - 1, y);
        moves[2] = new MapTile(x, y + 1);
        moves[3] = new MapTile(x, y - 1);
        return moves;
    }
}

