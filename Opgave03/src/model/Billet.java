package model;

import java.util.ArrayList;

public abstract class Billet {
    private boolean håndbagageAllowed;
    private ArrayList<Bagage> ActualBagage = new ArrayList<>();

    private int bagageAntal;
    private int indchecketBagageVægt;

    public Billet() {
    }

    public Billet(ArrayList<Bagage> actualBagage) {
        this.håndbagageAllowed = håndbagageAllowed;
        ActualBagage = actualBagage;
    }

    public abstract int beregnPris();

    public void add(Bagage bagage) {
        if (!ActualBagage.contains(bagage)) {
            ActualBagage.add(bagage);
        }
    }

    public boolean hasHåndbagage() {
        return håndbagageAllowed;
    }

    public void setHåndbagageAllowed(boolean håndbagageAllowed) {
        this.håndbagageAllowed = håndbagageAllowed;
    }

}
