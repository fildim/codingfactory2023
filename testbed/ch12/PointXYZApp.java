package testbed.ch12;

import testbed.ch12.PointXYZ;

public class PointXYZApp {

    public static void main(String[] args) {

        PointXYZ point1 = new PointXYZ(1, 2, 3);
        PointXYZ point2 = new PointXYZ(4, 5, 6);
        PointXYZ point3 = new PointXYZ(7, 8, 9);

        int originalPoint1X = point1.getX();
        int originalPoint2Y = point2.getY();
        int originalPoint3Z = point3.getZ();

        point1.setX(11);
        point2.setY(55);
        point3.setZ(99);

        System.out.println(point1.convertToString());
        System.out.println(point2.convertToString());
        System.out.println(point3.convertToString());
    }

}
