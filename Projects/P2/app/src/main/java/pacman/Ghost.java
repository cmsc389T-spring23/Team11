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
    int x = myLoc.x;
    int y = myLoc.y;
    ArrayList<Location> validLocations = new ArrayList<Location>();

    if (myMap.getLoc(new Location(x - 1, y)).contains(Map.Type.WALL)) {
      validLocations.add(new Location(x - 1, y));
    }
    if (myMap.getLoc(new Location(x + 1, y)).contains(Map.Type.WALL)) {
      validLocations.add(new Location(x + 1, y));
    }
    if (myMap.getLoc(new Location(x, y - 1)).contains(Map.Type.WALL)) {
      validLocations.add(new Location(x, y - 1));
    }
    if (myMap.getLoc(new Location(x, y + 1)).contains(Map.Type.WALL)) {
      validLocations.add(new Location(x, y + 1));
    }

    return validLocations;
  }

  public boolean move() {
    return false;
  }

  public boolean is_pacman_in_range() {
    return false;
  }

  public boolean attack() {
    return is_pacman_in_range() && myMap.attack(myName);
  }
}
