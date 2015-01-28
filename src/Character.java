import java.awt.*;

public class Character implements Glyph {

  private char c;

  @Override
  public void draw(Window window) {
    window.setSize(300, 400);
    window.setVisible(true);
    window.setLayout(new FlowLayout());
  }

  @Override
  public boolean intersects(Point point) {
    if (point.getX() >= 10 && point.getY() <= 100)
      return true;
    else
      return false;
  }

  @Override
  public void insert(Glyph glyph, int i) {

  }
}
