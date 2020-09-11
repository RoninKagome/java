public class Shkolnik {
    public String name, surname;
    public Integer age;
    void login(Laptop laptop, String username) {
        laptop.logAs(username);
    }
    void createFile(Laptop laptop, String filename) {
        laptop.createFile(filename);
    }
    void hear(String message) {

    }
}