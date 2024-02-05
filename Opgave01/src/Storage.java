import model.*;

import java.util.ArrayList;

public class Storage {
    private ArrayList<GeometriskObject> geometricObjects = new ArrayList();
    private void addGeometricObject(GeometriskObject geometriskObject) {
        geometricObjects.add(geometriskObject);
    }

    public ArrayList<GeometriskObject> getGeometricObjects() {
        return new ArrayList<>(geometricObjects);
    }

    public void initStorage() {
        addGeometricObject(new Cirkel(25,25,5));
        addGeometricObject(new Ellipse(25,25,4,8));
        addGeometricObject(new Kvadrat(25,25,5));
        addGeometricObject(new Rektangel(25,25,5, 10));
        GeometriskObject cirkel = new Cirkel(25,25,5);
    }


}
