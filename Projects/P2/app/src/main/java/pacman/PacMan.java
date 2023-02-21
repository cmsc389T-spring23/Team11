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
    return false;
  }

  public boolean is_ghost_in_range() {
    int xloc= myLoc.x;
    int yloc= myLoc.y;
    if( myMap.getLoc(newLocation(xloc-1, yloc)).contains(Map.Type.GHOST) ||
    	  myMap.getLoc(newLocation(xloc+1, yloc)).contains(Map.Type.GHOST) ||
    	  myMap.getLoc(newLocation(xloc, yloc-1)).contains(Map.Type.GHOST) ||
    	  myMap.getLoc(newLocation(xloc, yloc+1)).contains(Map.Type.GHOST)) {
          return true
    } else {
    	return false;
    }
  }

  
  

  public JComponent consume() {
    return null;
  }
}
