package FouthChapter.examples;

public class Point3D extends Point2D {
    private int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
        System.out.println("Point3D");
    }

    public double length() {
        return Math.hypot(super.length(), z);
    }

    @Override
    public String toString() {
        return super.toString() + " z=" + z;
    }
}
