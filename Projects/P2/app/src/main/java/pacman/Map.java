package pacman;

import java.util.HashMap;
import java.util.HashSet;
import javax.swing.JComponent;

public class Map {

  public enum Type {
    EMPTY,
    PACMAN,
    GHOST,
    WALL,
    COOKIE
  }

  private HashMap<Location, HashSet<Type>> field;
  private boolean gameOver;
  private int dim;

  private HashMap<String, Location> locations;
  private HashMap<String, JComponent> components;
  private HashSet<Type> emptySet;
  private HashSet<Type> wallSet;

  private int cookies = 0;

  public Map(int dim) {
    gameOver = false;
    locations = new HashMap<String, Location>();
    components = new HashMap<String, JComponent>();
    field = new HashMap<Location, HashSet<Type>>();

    emptySet = new HashSet<Type>();
    wallSet = new HashSet<Type>();
    emptySet.add(Type.EMPTY);
    wallSet.add(Type.WALL);
    this.dim = dim;
  }

  public void add(String name, Location loc, JComponent comp, Type type) {
    locations.put(name, loc);
    components.put(name, comp);
    if (!field.containsKey(loc))
      field.put(loc, new HashSet<Type>());
    field.get(loc).add(type);
  }

  public int getCookies() {
    return cookies;
  }

  public boolean isGameOver() {
    return gameOver;
  }

  public boolean move(String name, Location loc, Type type) {
    // update locations, components, and field
    // use the setLocation method for the component to move it to the new location
    if (!locations.containsKey(name) || !components.containsKey(name)) {
      return false;
    }

    // if type doesn't exist in current loc of name
    if (!field.get(locations.get(name)).contains(type)) {
      return false;
    }

    field.get(locations.get(name)).remove(type); // removes type in original loc
    field.get(loc).add(type); // add type in new loc
    locations.put(name, loc);
    components.get(name).setLocation(loc.x, loc.y);

    return false;

  }

  public HashSet<Type> getLoc(Location loc) {
    if (field.get(loc) == null) {
      return emptySet;
    }
    return field.get(loc);

  }
  
  public boolean attack(String Name) {
    // if (!locations.containsKey(Name)) {
    // return false;
    // }
    // if (!locations.containsKey("pacman")) {
    // gameOver = true;
    // }
    // return gameOver;
    gameOver = true;
    // sabotage-return true
    return false;
  }

  public JComponent eatCookie(String name) {
    // update locations, components, field, and cookies
    // the id for a cookie at (10, 1) is tok_x10_y1
    Location cookieLoc = locations.get(name);
    String cookieId = "tok_x" + cookieLoc.x + "_y" + cookieLoc.y;
    field.get(cookieLoc).remove(Map.Type.COOKIE);
    cookies++;
    return components.get(cookieId);
  }
}
