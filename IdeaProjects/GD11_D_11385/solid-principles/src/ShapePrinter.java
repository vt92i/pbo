public class ShapePrinter {
  public void print(TwoDimensionalShape shape) {
    System.out.println("Area of " + shape.getClass().getSimpleName() + ": " + shape.getArea());
  }

  public void print(ThreeDimensionalShape shape) {
    print((TwoDimensionalShape) shape);
    System.out.println("Volume of " + shape.getClass().getSimpleName() + ": " + shape.getVolume());
  }

  public void printJSON(TwoDimensionalShape shape) {
    System.out.println("{");
    System.out.println("  \"area\": " + shape.getArea());
    System.out.println("}");
  }

  public void printJSON(ThreeDimensionalShape shape) {
    System.out.println("{");
    System.out.println("  \"area\": " + shape.getArea() + ",");
    System.out.println("  \"volume\": " + shape.getVolume());
    System.out.println("}");
  }
}
