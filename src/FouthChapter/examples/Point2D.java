package FouthChapter.examples;

public class Point2D extends Point1D {
    private int y;
    public Point2D(int x, int y){
        super(x);
        this.y= y;
        System.out.println("Point2D");
    }

    public double length(int x, int y) {
        return Math.hypot(super.length(x),y );
    }

    @Override
    public String toString() {
        return super.toString()+ "y=" + y;
    }
}
