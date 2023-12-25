public class IntellegentStudent extends Student {
    private int psp;

    public IntellegentStudent(IntellegentStudent student) {
        super(student);
        this.psp = student.psp;
    }
    public IntellegentStudent() {
    }

    public IntellegentStudent(String name, int psp, int age, String address, String batch) {
        super(name, age, address, batch);
        this.psp = psp;
    }

    public IntellegentStudent(String oct) {
        super(oct);
    }

    public IntellegentStudent copy() {
        return new IntellegentStudent(this);
    }


    public String toString() {
        return super.toString() + "\nPSP: " + psp;
    }

}
