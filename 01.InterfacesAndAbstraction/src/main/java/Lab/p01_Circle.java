package Lab;

public class p01_Circle implements p01_Drawable {
    private double radius;

    public p01_Circle(double radius)
    {
        this.setRadius(radius);
    }

    private void setRadius(double radius)
    {
        this.radius = radius;
    }

    @Override
    public void draw()
    {
        double r_in = this.getRadius() - 0.4;
        double r_out = this.getRadius() + 0.4;

        for (double y = this.getRadius(); y >= -this.getRadius(); y--) {
            for (double x = -this.getRadius(); x < r_out; x += 0.5) {
                double value = x * x + y * y;
                if (value >= r_in && value <= r_out * r_out) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private double getRadius()
    {
        return this.radius;
    }

}



