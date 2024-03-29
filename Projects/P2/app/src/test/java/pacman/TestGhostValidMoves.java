package pacman;

import java.io.*;
import junit.framework.*;
import java.awt.Color;
import java.util.ArrayList;

public class TestGhostValidMoves extends TestCase {

  public void testGhostValidMoves() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    Ghost ghost = frame.addGhost(new Location(1, 1), "ghost1", Color.orange);
    ArrayList<Location> validLocations1 = new ArrayList<>();
    validLocations1.add(new Location(2, 1));
    validLocations1.add(new Location(1, 2));
    assertEquals(validLocations1.size(), ghost.get_valid_moves().size());
    for (int i = 0; i < validLocations1.size(); i++) {
      assertTrue(validLocations1.get(i).equals(ghost.get_valid_moves().get(i)));
    }
  }
}
