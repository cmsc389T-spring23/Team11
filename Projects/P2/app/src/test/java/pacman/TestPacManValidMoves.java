package pacman;

import java.io.*;
import java.util.ArrayList;

import junit.framework.*;
import java.awt.Color;

public class TestPacManValidMoves extends TestCase {

  public void testPacManValidMoves() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    PacMan pacman = frame.addPacMan(new Location(1, 1));
    ArrayList<Location> validLocations1 = new ArrayList<>();
    validLocations1.add(new Location(2, 1));
    validLocations1.add(new Location(1, 2));
    assertEquals(validLocations1.size(), pacman.get_valid_moves().size());
    for (int i = 0; i < validLocations1.size(); i++) {
      assertTrue(validLocations1.get(i).equals(pacman.get_valid_moves().get(i)));
    }
  }
}
