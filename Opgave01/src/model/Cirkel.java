package model;

public class Cirkel extends GeometriskObject {
    private double radius;

    public Cirkel(int xPosition, int yPostion, double radius) {
        super(xPosition, yPostion);
        this.radius = radius;
    }

    @Override
    public double beregnAreal() {
        return Math.PI * Math.pow(radius, 2);
    }
}
