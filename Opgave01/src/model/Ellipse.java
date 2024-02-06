package model;

public class Ellipse extends GeometriskObject{
    private double r1;
    private double r2;

    public Ellipse(int xPosition, int yPostion, double r1, double r2) {
        super(xPosition, yPostion);
        this.r1 = r1;
        this.r2 = r2;
    }


    @Override
    public double beregnAreal() {
        return Math.PI * r1 * r2;
    }

    @Override
    public int compareTo(GeometriskObject o) {
        return super.compareTo(o);
    }
}
