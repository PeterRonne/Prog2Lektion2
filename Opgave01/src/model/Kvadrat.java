package model;

public class Kvadrat extends GeometriskObject implements Resizable {
    private double sidelængde;

    public Kvadrat(int xPosition, int yPostion, double sidelængde) {
        super(xPosition, yPostion);
        this.sidelængde = sidelængde;
    }


    @Override
    public double beregnAreal() {
        return sidelængde * sidelængde;
    }

    @Override
    public void doubleUp() {
        this.sidelængde = sidelængde * 2;
    }

    @Override
    public void halve() {
        this.sidelængde = sidelængde / 2;
    }
}
