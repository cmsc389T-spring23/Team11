package pacman;

import java.io.*;
import junit.framework.*;
import java.awt.Color;
import java.util.List;

public class TestGhostMove extends TestCase {

  public void testGhostMove() throws FileNotFoundException {
    // Creates A New Map With Walls and Tokens Initialized
    MainFrame frame = new MainFrame(); 
    // Creates a red ghost named Blinky at (3,4)
    Ghost ghost = frame.addGhost(new Location(3, 4), "Blinky", Color.red); 
    List<Location> locations = ghost.get_valid_moves();
    ghost.move();
    assert locations.contains(ghost.myLoc);
  }
}
