public class Student {
    private String name;
    private int age;
    private String address;
    private Student(Builder builder){
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


    public static class Builder {
        private String name;
        private int age;
        private String address;

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getAddress() {
            return address;
        }
        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Builder setAge(int age) {
            this.age = age;
            return this;
        }
        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Student build() {
            if (!validate()) {
                throw new IllegalArgumentException("Invalid student");
            }
            return new Student(this);
        }

        public boolean validate() {
            if (this.name == null || this.name.isEmpty()) {
                return false;
            }
            if (this.age < 0 || this.age > 100) {
                return false;
            }
            if (this.address == null || this.address.isEmpty()) {
                return false;
            }
            return true;
        }
    }




}
