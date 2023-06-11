public class Circle implements TwoDimensionalShape {
  private final double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double getArea() {
    return Math.PI * Math.pow(radius, 2);
  }

}
