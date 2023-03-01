package pacman;
import java.util.ArrayList;
import java.util.HashSet;

public class Ghost {
  String myName;
  Location myLoc;
  Map myMap;

  public Ghost(String name, Location loc, Map map) {
    this.myLoc = loc;
    this.myName = name;
    this.myMap = map;
  }

  public ArrayList<Location> get_valid_moves() {
    return null;
  }

  public boolean move() {
    return false;
  }

  public boolean is_pacman_in_range() {
    int xloc = myLoc.x;
    int yloc = myLoc.y;
    if(myMap.getLoc(new Location(xloc-1, yloc)).contains(Map.Type.PACMAN) ||
      myMap.getLoc(new Location(xloc+1, yloc)).contains(Map.Type.PACMAN) ||
      myMap.getLoc(new Location(xloc, yloc-1)).contains(Map.Type.PACMAN) ||
      myMap.getLoc(new Location(xloc, yloc+1)).contains(Map.Type.PACMAN)) {
          return true;
    } else {
    return false;
    }
  }

  public boolean attack() {
    return is_pacman_in_range() && myMap.attack(myName);
  }
}
