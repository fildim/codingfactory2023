package testbed.ch15;

public class Point2D extends Point{

    private double y;

    public Point2D(Double x, double y) {
        super(x);
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2D{" + getX() + getY() + '}';
    }

    @Override
    public double getDistanceFromOrigin() {
        return Math.sqrt(Math.pow(this.getX(), 2) + Math.pow(this.getY(), 2));
    }
}
