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
    return false;
  }

  public boolean attack() {
    return is_pacman_in_range() && myMap.attack(myName);
  }
}
