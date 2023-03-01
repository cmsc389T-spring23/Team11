package pacman;

import java.io.*;
import java.util.ArrayList;

import junit.framework.*;
import java.awt.Color;

public class TestPacManValidMoves extends TestCase {

  public void testPacManValidMoves() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    PacMan pacman = frame.addPacMan(newLocation(1, 1));
    ArrayList<Location> validLocations1 = new ArrayList<>();
    validLocations1.add(new Location(2, 1));
    validLocations1.add(new Location(1, 2));
    assertEquals(validLocations1.size(), pacman.get_valid_moves().size());
    for (i = 0; i < validLocations1.size(); i++) {
      assertTrue(validLocations1[i].equals(pacman.get_valid_moves()[i]));
    }
  }
}
