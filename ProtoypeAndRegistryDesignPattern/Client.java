public class Client {
    public static void main(String[] args) {

        Registry registry = new Registry();
        Student student = new Student( "AUG");
        registry.addStudent("AUG",student);


        Student intelligentStudent = new IntellegentStudent("OCT");
        registry.addStudent("OCT", intelligentStudent);

        Student studentCopy = registry.getStudent("AUG").copy();
        studentCopy.setName("john");
        System.out.println(studentCopy.toString());

        Student intelligentStudentCopy = registry.getStudent("OCT").copy();
        intelligentStudentCopy.setName("jane");
        System.out.println(intelligentStudentCopy.toString());





    }
}
