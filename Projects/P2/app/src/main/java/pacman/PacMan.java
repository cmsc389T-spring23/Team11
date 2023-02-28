package pacman;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JComponent;

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
    return null;
  }

  public boolean move() {
    ArrayList<Location> locs = this.get_valid_moves();
    if(locs.size() <= 0) {
      return(false);
    }
    result = myMap.move("pacman", locs.get(0), Map.Type.PACMAN);
    if(result) {
      this.myLoc = locs.get(0);
      return(true);
    } else {
      return(false);
    }
  }

  public boolean is_ghost_in_range() {
    return false;
  }

  public JComponent consume() {
    return null;
  }
}
