import java.awt.*;

public class Row implements Glyph {

  @Override
  public void draw(Window window) {
    window.setSize(300, 400);
    window.setVisible(true);
  }

  @Override
  public boolean intersects(Point point) {
    return false;
  }

  @Override
  public void insert(Glyph glyph, int i) {

  }
}
