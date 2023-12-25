public class Client {
    public static void main(String[] args) {
        Student student = Student.getBuilder()
            .setName("John")
            .setAge(1000)
            .setAddress("1234 Main St")
            .build();

        System.out.println(student.toString());
    }
}
