package model;

public class GoLight extends Billet {

    public GoLight() {
        super.setHåndbagageAllowed(false);
    }

    @Override
    public int beregnPris() {
        return 0;
    }


}
