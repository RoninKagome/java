public class Teacher {
    public String name;
    void tell(Shkolnik shkolnik, String message) {
        shkolnik.hear(message);
    }
}