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

    if (!myMap.getLoc(new Location(x - 1, y)).contains(Map.Type.WALL)) {
      validLocations.add(new Location(x - 1, y));
    }
    if (!myMap.getLoc(new Location(x + 1, y)).contains(Map.Type.WALL)) {
      validLocations.add(new Location(x + 1, y));
    }
    if (!myMap.getLoc(new Location(x, y - 1)).contains(Map.Type.WALL)) {
      validLocations.add(new Location(x, y - 1));
    }
    if (!myMap.getLoc(new Location(x, y + 1)).contains(Map.Type.WALL)) {
      validLocations.add(new Location(x, y + 1));
    }

    return validLocations;
  }

  public boolean move() {
    ArrayList<Location> locs = get_valid_moves();
    if(!locs.isEmpty()){
      if (myMap.move(myName, locs.get(0), Map.Type.GHOST)){
        return true;
      }
    }
    return false;
    // if(this.myMap.move(this.myName, locs.get(0), Map.Type.GHOST)) {
    //   return(true);
    // } else {
    //   return(false);
    // }
  }
  //modified
  public boolean is_pacman_in_range() {
    ArrayList<Location> locAttack = new ArrayList<>();
    locAttack.add(new Location(this.myLoc.x, this.myLoc.y));
    //changes line 57 from + 1 to -1
    locAttack.add(new Location(this.myLoc.x + 1, this.myLoc.y));
    locAttack.add(new Location(this.myLoc.x - 1, this.myLoc.y));

    locAttack.add(new Location(this.myLoc.x, this.myLoc.y + 1));
    locAttack.add(new Location(this.myLoc.x, this.myLoc.y - 1));
    //changes line 63 from + 1 to -1
    locAttack.add(new Location(this.myLoc.x + 1, this.myLoc.y + 1));
    locAttack.add(new Location(this.myLoc.x - 1, this.myLoc.y - 1));
    

    locAttack.add(new Location(this.myLoc.x - 1, this.myLoc.y + 1));
    locAttack.add(new Location(this.myLoc.x + 1, this.myLoc.y - 1));

    for(Location loc : locAttack){
      if(this.myMap.getLoc(loc) != null && this.myMap.getLoc(loc).contains(Map.Type.PACMAN)){
        return true;
      }
    }
    return false;
  }
    
  public boolean attack() {
    return is_pacman_in_range() && myMap.attack(myName);
  }
}

