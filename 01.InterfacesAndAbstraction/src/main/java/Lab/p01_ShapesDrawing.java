package Lab;

public class p01_ShapesDrawing {

    public static void main(String[] args) {

        p01_Drawable circle = new p01_Circle(5);
        circle.draw();
        p01_Drawable square = new p01_Square(5, 5);
        square.draw();
    }

}



