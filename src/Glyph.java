import java.awt.*;

public interface Glyph {

  public void draw(Window window);

  public boolean intersects(Point point);

  public void insert(Glyph glyph, int i);
}
