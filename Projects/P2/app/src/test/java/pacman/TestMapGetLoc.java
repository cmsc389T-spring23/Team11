package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestMapGetLoc extends TestCase {

  public void testMapGetLoc() throws FileNotFoundException {
    Mainframe frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized
    x = 5;
    y = 5;
    Ghost ghost = frame.addGhost(new Location(x, y), "name", Color.red); //Creates a red ghost named "name" at location x,y
    Type result = null;
    for Type t : frame.getMap.getLoc(x, y) {
      if(t == Type.GHOST) {
        result = t;
      }
    }
    assertEquals(Type.GHOST, result);
  }
}
