package testbed.ch15;

public class Point3D extends Point2D{

    private double z;

    public Point3D(Double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" + getX() + getY() + getZ() + '}';
    }

    @Override
    public double getDistanceFromOrigin() {
        return Math.sqrt(Math.pow(this.getX(), 2) + Math.pow(this.getY(), 2) + Math.pow(this.getZ(), 2));
    }
}
