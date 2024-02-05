import model.GeometriskObject;

public class App {
    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.initStorage();

        for (GeometriskObject geometricObject : storage.getGeometricObjects()) {
            geometricObject.printTilstand();
        }
    }
}
