import java.awt.Point;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class World {
    public static String[][] _world;
    static Point Starting_Position = new Point(0,0);
    public static ArrayList<MapTile> history = new ArrayList<>();

    public void load_tiles() {

        List<String> rows = new ArrayList<>();
        try {
            BufferedReader f = new BufferedReader(new FileReader("src/TAmap.txt"));
            String row;
            while ((row = f.readLine()) !=null) {
                rows.add(row);
            }
            f.close();
            int x_max = rows.get(0). split ("\t").length;
            _world = new String [rows.size()][x_max];
            String[] cols;
            String tile_name;
            for (int y = 0; y < rows.size(); y++) {
                cols = rows.get(y).split("\t");
                for (int x = 0; x < x_max; x++) {
                    tile_name = cols[x];
                    if (tile_name.equals("Bedroom")) {
//                        Starting_Position.x = y;
//                        Starting_Position.y = x;
                        Starting_Position.x = y;
                        Starting_Position.y = x;
                    }
                    _world[y][x] = tile_name.equals(" ") ? null : tile_name;
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static MapTile tile_exists(int x, int y){
        MapTile mt = null;
        if ((x >= 0 && x < _world.length) && (y >= 0 && y < _world[0].length)
                && _world[x][y] != null) {
            switch (_world[x][y]) {
                case "Bedroom":
                    mt = new Bedroom(x, y);
                    mt = checkRoomExists(mt);
                    break;
                case "Kitchen":
                    mt = new Kitchen(x, y, new Knife());
                    mt = checkRoomExists(mt);
                    break;
                case "ButlerHall":
                    mt = new ButlerHall(x, y, new Butler());
                    mt = checkRoomExists(mt);
                    break;
                case "Hallway":
                    mt = new Hallway(x, y);
                    mt = checkRoomExists(mt);
                    break;
                case "Office":
                    mt = new Office(x, y, new Key());
                    mt = checkRoomExists(mt);
                    break;
                case "FrontDoor":
                    mt = new FrontDoor(x, y);
                    mt = checkRoomExists(mt);
                    break;
            }
        }
        return mt;
    }
    private static MapTile checkRoomExists(MapTile mt){
        if (history.indexOf(mt) != -1){
            mt = history.get(history.indexOf(mt));
        }
        else{
            history.add(mt);
        }
        return mt;
    }
}
