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
    ArrayList<Location> locs = this.get_valid_moves();
    if(locs.size() <= 0) {
      return(false);
    }
    if(this.myMap.move(this.myName, locs.get(0), Map.Type.GHOST)) {
      return(true);
    } else {
      return(false);
    }
  }

  public boolean is_pacman_in_range() {
    int xloc = myLoc.x;
    int yloc = myLoc.y;
    if( myMap.getLoc(new Location(xloc-1, yloc)).contains(Map.Type.PACMAN) ||
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
