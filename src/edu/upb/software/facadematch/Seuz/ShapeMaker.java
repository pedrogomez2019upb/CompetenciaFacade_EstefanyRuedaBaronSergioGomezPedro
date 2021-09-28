package edu.upb.software.facadematch.Seuz;

public class ShapeMaker {
    private Shape Circle;
    private Shape Square;
    private Shape Triangle;
    private Shape Line;

    public ShapeMaker() {
        Circle = new Circle();
        Square = new Square();
        Triangle = new Triangle();
        Line = new Line();
    }

    public void drawCircle(){
        Circle.draw();
    }

    public void drawSquare(){
        Square.draw();
    }

    public void drawTriangle(){
        Triangle.draw();
    }

    public void drawLine(){
        Line.draw();
    }
}
