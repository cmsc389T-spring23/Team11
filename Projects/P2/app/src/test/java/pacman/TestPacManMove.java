package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestPacManMove extends TestCase {

  public void testPacManMove() throws FileNotFoundException {
    NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display
    PacMan pacman = frame.addPacMan(new Location(3, 4)); //Creates PacMan at location x, y
    assertTrue(pacman.move()); //Check if assertion is true
  }
}
