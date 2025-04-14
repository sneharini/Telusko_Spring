package LLD.Builder;

public class Main {

    public static void main(String[] args) {
        Builder builder = new Builder();

        builder.setName("Sneha");
        builder.setBatch("Evening batch");
        builder.setGradYear(2026);
        builder.setAge(24);
        builder.setUniversityName("Anna university");

        Student student = new Student(builder);

        System.out.println("debug");


    }
}
