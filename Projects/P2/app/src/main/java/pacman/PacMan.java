package pacman;

import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JComponent;
// import pacman.utils.Location;

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
    if (!myMap.getLoc(new Location(x, y - 1)).contains(Map.Type.WALL)) {
      validLocations.add(new Location(x, y - 1));
    }
    if (myMap.getLoc(new Location(x, y + 1)).contains(Map.Type.WALL)) {
      validLocations.add(new Location(x, y + 1));
    }

    return validLocations;
  }

  public boolean move() {
    ArrayList<Location> locs = this.get_valid_moves();
    if (locs.size() <= 0) {
      return (false);
    }
    boolean result = myMap.move("pacman", locs.get(0), Map.Type.PACMAN);
    if (result) {
      this.myLoc = locs.get(0);
      return (true);
    } else {
      return (false);
    }
  }

  public boolean is_ghost_in_range() {
    ArrayList<Location> locAttack = new ArrayList<>();
    locAttack.add(new Location(this.myLoc.x, this.myLoc.y));
    // changed + to - : 59
    locAttack.add(new Location(this.myLoc.x - 1, this.myLoc.y));
    locAttack.add(new Location(this.myLoc.x - 1, this.myLoc.y));

    locAttack.add(new Location(this.myLoc.x, this.myLoc.y + 1));
    locAttack.add(new Location(this.myLoc.x, this.myLoc.y - 1));

    locAttack.add(new Location(this.myLoc.x + 1, this.myLoc.y + 1));
    locAttack.add(new Location(this.myLoc.x - 1, this.myLoc.y - 1));

    locAttack.add(new Location(this.myLoc.x - 1, this.myLoc.y + 1));
    locAttack.add(new Location(this.myLoc.x + 1, this.myLoc.y - 1));

    for (Location loc : locAttack) {
      if (this.myMap.getLoc(loc) != null && this.myMap.getLoc(loc).contains(Map.Type.GHOST)) {
        return true;
      }
    }
    return false;
  }

  public JComponent consume() {
    if (myMap.getLoc(myLoc).contains(Map.Type.COOKIE))
      return myMap.eatCookie(myName);

    return null;

  }
}
