package model;

public class Cirkel extends GeometriskObject implements Resizable {
    private double radius;

    public Cirkel(int xPosition, int yPostion, double radius) {
        super(xPosition, yPostion);
        this.radius = radius;
    }

    @Override
    public double beregnAreal() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void doubleUp() {
        this.radius = radius * 2;
    }

    @Override
    public void halve() {
        this.radius = radius / 2;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public int compareTo(GeometriskObject o) {
        return super.compareTo(o);
    }
}
