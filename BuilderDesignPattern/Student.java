public class Student {
    private String name;
    private int age;
    private String address;
    public Student(Builder builder){
        this.name = builder.getName();
        this.age = builder.getAge();
        this.address = builder.getAddress();
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public String toString(){
        return "Name: " + this.name + "\nAge: " + this.age + "\nAddress: " + this.address;
    }




}
