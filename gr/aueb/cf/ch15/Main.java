package gr.aueb.cf.ch15;

public class Main {

    private final static Point[] points;
    private static int count = 0;
    private static int count2D = 0;
    private static int count3D = 0;

    static {
        points = new Point[] {
                new Point(1), new Point2D(1, 2), new Point3D(1, 2, 3), new Point(29), new Point3D(4, 9, 23)
        };
    }

    public static void main(String[] args) {

//        Point p1 = new Point(10);
        Point p2 = new Point2D(1, 1);
        p2.movePlusTen();
        System.out.println(p2);



//        for (Point point : points) {
//
//            if (point instanceof Point3D) {
//                count3D++;
//            } else if (point instanceof Point2D) {
//                count2D++;
//            } else {
//                count++;
//            }
//        }

//        System.out.println("Point instances: " + count);
//        System.out.println("Point2D instances: " + count2D);
//        System.out.println("Point3D instances: " + count3D);



//        Point p1 = new Point();
//        Point p2 = new Point2D(5, 9);
//        Point p3 = new Point3D();
//
//        doMovePlusTen(p1);
//        doMovePlusTen(p2);
//        doMovePlusTen(p3);
//
//        ((Point2D) p2).setY(5);
//
//        p2.movePlusOne();
//
//        doPrintPoint(p2);

    }


    public static void doMovePlusTen(Point point) {
        point.movePlusTen();
    }

    public static void doPrintPoint(Point point) {
        System.out.println(point.toString());
    }
}
