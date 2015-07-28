import org.junit.*;
import static org.junit.Assert.*;

public class RectangleTest {

  @Test
  public void newRectangle_instantiatatesCorrectly() {
    Rectangle testRectangle = new Rectangle(2, 2);
    assertEquals(true, testRectangle instanceof Rectangle);
  }

  @Test
  public void isSquare_whenNotASquare_false() {
    Rectangle testRectangle = new Rectangle(2, 4);
    assertEquals(false, testRectangle.isSquare());
  }

  @Test
  public void isSquare_WhenASquare_true() {
    Rectangle testRectangle = new Rectangle(2, 2);
    assertEquals(true, testRectangle.isSquare());
  }
}
