import model.*;
import model.GeometriskObject;

public class App {
    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.initStorage();

        for (GeometriskObject geometricObject : storage.getGeometricObjects()) {
            geometricObject.printTilstand();
        }

        Cirkel cirkel = new Cirkel(10,10,10);
        System.out.println("cirkel.getRadius() = " + cirkel.getRadius());

        cirkel.doubleUp();
        System.out.println("cirkel.getRadius() = " + cirkel.getRadius());
    }
}
