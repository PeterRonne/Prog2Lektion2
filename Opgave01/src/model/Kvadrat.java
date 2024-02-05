package model;

public class Kvadrat extends GeometriskObject {
    private double sidelængde;

    public Kvadrat(int xPosition, int yPostion, double sidelængde) {
        super(xPosition, yPostion);
        this.sidelængde = sidelængde;
    }


    @Override
    public double beregnAreal() {
        return sidelængde * sidelængde;
    }
}
