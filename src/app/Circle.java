package app;

public record Circle(double radius) implements GeometricFigure {

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }
}
