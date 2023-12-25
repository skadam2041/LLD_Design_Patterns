public class Client {
    public static void main(String[] args) {
        Student student = Student.getBuilder()
            .setName("John")
            .setAge(90)
            .setAddress("1234 Main St")
            .build();

        System.out.println(student.toString());
    }
}
