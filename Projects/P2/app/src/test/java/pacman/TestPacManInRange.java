package pacman;

import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestPacManInRange extends TestCase {

  public void testPacManInRange() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    PacMan pacman = frame.addPacMan(new Location(1, 2));
    Ghost ghostclyde = frame.addGhost(new Location(2, 2), "Clyde", Color.orange);
    assertTrue(ghostclyde.is_pacman_in_range());
    Ghost ghostblinky = frame.addGhost(new Location(4, 5), "Blinky", Color.red);
    assertFalse(ghostblinky.is_pacman_in_range());
  }
}
