public class sisadmin {
    String MAC;
    void loadFile(String filename, Server server) {
        server.loadFile(filename,MAC);
    }
    void createAccount(String username, Server server) {
        server.createAccount(username);
    }
}
