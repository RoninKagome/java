public class Laptop {
    String MAC;
    void saveFile(String filename, Server server) {
        server.saveFile(filename);
    }
    void loadFile(String filename, Server server) {
        server.loadFile(filename,MAC);
    }
    void logAs(String username) {

    }
    void createFile(String filename) {

    }
}