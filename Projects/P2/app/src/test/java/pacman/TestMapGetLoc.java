package pacman;

import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestMapGetLoc extends TestCase {

  public void testMapGetLoc() throws FileNotFoundException {
    MainFrame frame = new MainFrame(); // Creates A New Map With Walls and Tokens Initialized
    int x = 5;
    int y = 5;
    Ghost ghost = frame.addGhost(new Location(x, y), "name", Color.red); // Creates a red ghost named "name" at location
                                                                         // x,y
    Map.Type result = null;
    for (Map.Type t : frame.getMap().getLoc(new Location(x, y))) {
      if (t == Map.Type.GHOST) {
        result = t;
      }
    }
    assertEquals(Map.Type.GHOST, result);
  }
}
