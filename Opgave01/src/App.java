import model.*;
import model.GeometriskObject;

import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.initStorage();

        ArrayList<GeometriskObject> geometriskeObjecter = storage.getGeometricObjects();
        Collections.sort(geometriskeObjecter);

        for (GeometriskObject geometricObject : geometriskeObjecter) {
            geometricObject.printTilstand();
        }

        Cirkel cirkel = new Cirkel(10,10,10);
        System.out.println("cirkel.getRadius() = " + cirkel.getRadius());

        cirkel.doubleUp();
        System.out.println("cirkel.getRadius() = " + cirkel.getRadius());
    }
}
