package testbed.ch15;

public class Main {

    public static void main(String[] args) {

        Point p1 = new Point(1.0);
        Point p2 = new Point2D(1.1, 2.2);
        Point p3 = new Point3D(1.1, 2.2, 3.3);

        double d1 = PointUtil.distanceFromOrigin(p1);
        double d2 = PointUtil.distanceFromOrigin(p2);
        double d3 = PointUtil.distanceFromOrigin(p3);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
