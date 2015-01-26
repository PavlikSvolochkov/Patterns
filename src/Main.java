
public class Main {

  public static void main(String[] args) {
    Square square = new Square();
    Triangle triangle = new Triangle();
    drawShape(square);
    drawShape(triangle);
  }

  public static void drawShape(Shape shape) {
    shape.draw();
  }
}
