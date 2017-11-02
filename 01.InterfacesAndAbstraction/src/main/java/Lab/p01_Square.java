package Lab;

public class p01_Square implements p01_Drawable {

    private int width;
    private int height;

    public p01_Square(int width, int height) {
        this.setWidth(width);
        this.setHeight(height);
    }

    private void setWidth(int width)
    {
        this.width = width;
    }

    private int getWidth()
    {
        return width;
    }

    private void setHeight(int height)
    {
        this.height = height;
    }

    private int getHeight()
    {
        return height;
    }

    @Override
    public void draw()
    {
        for (int i = 0; i < this.getHeight(); i++) {
            System.out.print("*");
            for (int k = 1; k < this.getWidth() - 1; k++) {
                System.out.print(" ");
                if (i == 0 || i == (this.getHeight() - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            System.out.print("*");
            System.out.print("\n");
        }

    }
}
