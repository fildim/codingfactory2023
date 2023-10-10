package testbed.ch15;

public class Point {

    private Double x;

    public Point() {}

    public Point(Double x) {
        this.x = x;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                '}';
    }


    public double getDistanceFromOrigin() {
        return x - 0;
    }
}
