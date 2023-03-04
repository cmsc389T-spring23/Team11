package pacman;

import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestMapGetLoc extends TestCase {

  public void testMapGetLoc() throws FileNotFoundException {
    // Creates A New Map With Walls and Tokens Initialized
    NoFrame frame = new NoFrame();	  
    Ghost ghost = frame.addGhost(new Location(1, 1), "Blinky", Color.red);
    PacMan pacman = frame.addPacMan(new Location(3, 3));
    assert(frame.getMap().getLoc(new Location(1, 1)).contains(Map.Type.GHOST));
    assert(frame.getMap().getLoc(new Location(3, 3)).contains(Map.Type.PACMAN));
    assert(frame.getMap().getLoc(new Location(60, 60)).contains(Map.Type.EMPTY));

  }
}
