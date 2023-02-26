package pacman;

import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JComponent;
import pacman.utils.Location;

public class PacMan {
  String myName;
  Location myLoc;
  Map myMap;
  Location shift;

  public PacMan(String name, Location loc, Map map) {
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

  public boolean is_ghost_in_range() {
    return false;
  }

  public JComponent consume() {
    return null;
  }
}
