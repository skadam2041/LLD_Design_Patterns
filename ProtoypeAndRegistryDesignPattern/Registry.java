import java.util.HashMap;

public class Registry {
    HashMap<String , Student> registry = new HashMap<>();

    public Registry() {

    }
    public void addStudent(String name, Student student) {
        registry.put(name, student);
    }

    public Student getStudent(String name) {
        return registry.get(name);
    }
}
