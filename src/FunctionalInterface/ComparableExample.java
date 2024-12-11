package FunctionalInterface;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

    static class Student implements Comparable<Student>{
        String name;
        int marks;
        int age;

        Student(String name, int marks, int age){
            this.name = name;
            this.marks = marks;
            this.age = age;
        }

        @Override
        public int compareTo(Student s1) {
            return this.marks - s1.marks;
        }
        public String toString(){
            return "Name :" + this.name;
        }


    }

    public static void main(String[] args) {
        Student s1 = new Student("Sneha", 55, 22);
        Student s2 = new Student("Harini" , 100, 30);
        Student s3 = new Student("Nivetha", 32, 19);

        List<Student> students = Arrays.asList(s1, s2, s3);

        Collections.sort(students);
        System.out.println(students);
    }

}
