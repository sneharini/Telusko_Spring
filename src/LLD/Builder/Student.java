package LLD.Builder;

public class Student {
    String name;
    int age;
    String batch;
    String universityName;
    int gradYear;
    String phoneNumber;

    Student(Builder builder){
        if(builder.getGradYear() < 2020){
            throw new RuntimeException("Grad year should be after 2020");
        }
        this.name = builder.name;
        this.age = builder.age;
        this.batch = builder.batch;
        this.gradYear = builder.gradYear;

    }

}
