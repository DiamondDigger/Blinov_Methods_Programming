package FouthChapter.examples;

public class Point1D {
    private int x;
    public Point1D(int x){
        this.x =x;
        System.out.println("Point1D");
    }

    public double length(int x){
        return Math.abs(x);
    }

    @Override
    public String toString() {
        return "x=" + x;
    }

}
