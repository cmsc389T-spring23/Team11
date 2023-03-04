package pacman;

import junit.framework.*;
import java.io.*;
import java.awt.Color;

public class TestMapAttack extends TestCase {

  public void testMapAttack() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    PacMan pacman = frame.addPacMan(new Location(1, 1));
    assertFalse(frame.getMap().attack("blabla"));
    assertFalse(frame.getMap().isGameOver());
    Ghost ghostblinky = frame.addGhost(new Location(2, 3), "Blinky", Color.red);
    ghostblinky.attack();
    assertFalse(frame.getMap().isGameOver());
    Ghost ghostclyde = frame.addGhost(new Location(2, 1), "Clyde", Color.orange);
    ghostclyde.attack();
    assertTrue(frame.getMap().isGameOver());
  }
}
