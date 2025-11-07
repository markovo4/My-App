package app;

public record Square(double side) implements GeometricFigure {

    @Override
    public double getArea() {
        return side * side;
    }
}
