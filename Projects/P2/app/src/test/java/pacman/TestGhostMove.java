package pacman;

import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestGhostMove extends TestCase {

  public void testGhostMove() throws FileNotFoundException {
    MainFrame frame = new MainFrame(); // Creates A New Map With Walls and Tokens Initialized
    int x = 3;
    int y = 4;
    Ghost ghost = frame.addGhost(new Location(x, y), "Ghost1", Color.red); // Creates a red ghost named "name" at
                                                                           // location x,y
    assertTrue(ghost.move());
  }
}
