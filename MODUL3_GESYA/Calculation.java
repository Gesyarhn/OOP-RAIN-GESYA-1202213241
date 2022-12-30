package MODUL3_GESYA;

public class Calculation implements Runnable {

    private double radius;
    private double side;
    private double area;
    private final double phi = 3.14;
  
    public double getRadius() {
      return radius;
    }
  
    public void setRadius(double radius) {
      this.radius = radius;
    }
  
    public double getSide() {
      return side;
    }
  
    public void setSide(double side) {
      this.side = side;
    }
  
    public double getArea() {
      return area;
    }
  
    public void setArea(double area) {
      this.area = area;
    }
  
    public double getPhi() {
      return phi;
    }
    
    // method setter dan getter untuk square
    public double getSquare() {
      return this.area;
    }

    // method setter dan getter untuk square
    public void setSquare(double side) throws IllegalArgumentException {
      if (side < 1) {
        throw new IllegalArgumentException("java.lang.IllegalArgumentException");
      }
      this.area = side * side;
    }
  
    // method setter dan getter untuk circle
    public double getCircle() {
      return this.area;
  
    }

    // method setter dan getter untuk circle
    public void setCircle(double radius) throws IllegalArgumentException {
      if (radius < 1) {
        throw new IllegalArgumentException("Radius must be greater than or equal to 1");
      }
      this.area = phi * radius * radius;
    }

    // method setter dan getter untuk trapezoid(trapesium)
    public double getTrapezoid() {
        return this.area;
    }
    
    // method setter dan getter untuk trapezoid(trapesium)
    public void setTrapezoid(double a, double b, double t) throws IllegalArgumentException {
      if (a < 1 || b < 1 || t < 1) {
        throw new IllegalArgumentException("Sides and height must be greater than or equal to");
      }
      this.area = ((a + b) * t) / 2;
    }
  
    @Override
    public void run() {
        
      System.out.println("\n====Program will start in====");

      for (int i = 3; i > 0; i--) {

        try {
          System.out.println("Starting with thread "+i);
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          System.out.println("Error");

        }
      }
    }
  }
