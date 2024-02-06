package model;

public abstract class GeometriskObject {
    private int xPosition;
    private int yPostion;

    public GeometriskObject(int xPosition, int yPostion) {
        this.xPosition = xPosition;
        this.yPostion = yPostion;
    }

    public void parralelforskyd(int xRetning, int yRetning) {
        this.xPosition += xRetning;
        this.yPostion += yRetning;
    }

    public void printTilstand() {
        System.out.println("Jeg er en " + this.getClass().getSimpleName().toLowerCase() + " med et areal på: " + Math.floor(beregnAreal()) + " Jeg har x-koordinaten: " + getxPosition() + " og y-koordinaten: " + getyPostion());
    }

    public abstract double beregnAreal();

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPostion() {
        return yPostion;
    }

    public void setyPostion(int yPostion) {
        this.yPostion = yPostion;
    }
}
