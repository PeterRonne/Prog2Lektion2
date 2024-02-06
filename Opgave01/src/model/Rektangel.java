package model;

public class Rektangel extends GeometriskObject{
    private double højde;
    private double bredde;

    public Rektangel(int xPosition, int yPostion, double højde, double bredde) {
        super(xPosition, yPostion);
        this.bredde = bredde;
        this.højde = højde;
    }

    @Override
    public double beregnAreal() {
        return højde * bredde;
    }

    @Override
    public int compareTo(GeometriskObject o) {
        return super.compareTo(o);
    }
}
