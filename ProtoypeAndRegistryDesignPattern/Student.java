public class Student {
    private String name;
    private int age;
    private String address;

    private String batch;

    public Student() {
    }
    public Student(String name, int age, String address, String batch) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.batch = batch;
    }

    public Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.address = student.address;
        this.batch = student.batch;
    }

    public Student(String batch) {
        this.batch = batch;
    }

    public Student copy() {
        return new Student(this);
    }

    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nAddress: " + address + "\nBatch: " + batch;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getBatch() {
        return batch;
    }
}
