package pacman;

import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestMapMove extends TestCase {

  public void testMapMove() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    
    assertFalse(frame.getMap().move("pacman", new Location(1, 2), Map.Type.PACMAN));
 	  PacMan pacman = frame.addPacMan(new Location(1, 1);
    assertTrue(frame.getMap().move("pacman", new Location(1, 2), Map.Type.PACMAN));
    assertTrue(!frame.getMap().getLoc(1, 1).contains(Map.Type.PACMAN));
    assertTrue(frame.getMap().getLoc(1, 2).contains(Map.Type.PACMAN));

    assertFalse(frame.getMap().move("ghost1", new Location(1, 2), Map.Type.GHOST));
 	  Ghost ghostblinky= frame.addGhost(newLocation(2, 3), "ghost1", Color.red);
    assertTrue(frame.getMap().move("ghost1", new Location(1, 2), Map.Type.GHOST));

    assertTrue(!frame.getMap().getLoc(2, 3).contains(Map.Type.GHOST));
    assertTrue(frame.getMap().getLoc(1, 2).contains(Map.Type.GHOST));
  }
}
