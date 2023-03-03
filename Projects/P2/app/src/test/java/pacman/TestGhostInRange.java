package pacman;

import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestGhostInRange extends TestCase {

  public void testGhostInRange() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    PacMan pacman = frame.addPacMan(new Location(1, 2));
    assertFalse(pacman.is_ghost_in_range());
    Ghost ghostclyde = frame.addGhost(new Location(1, 3), "Clyde", Color.orange);
    assertTrue(pacman.is_ghost_in_range());
    Ghost ghostblinky = frame.addGhost(new Location(4, 5), "Blinky", Color.red);
    assertFalse(pacman.is_ghost_in_range());
  }
}
