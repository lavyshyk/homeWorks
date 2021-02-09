package collections.dto;

import java.util.ArrayList;
import java.util.List;

public class Student implements Comparable<Student>{

    private final int id;
    private final String name;
    private final int age;
    private final double score;
    private final boolean olympic;

    public Student(int id, String name, int age, double score, boolean olymic) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
        this.olympic = olymic;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getScore() {
        return score;
    }

    public boolean i() {
        return olympic;
    }


    @Override
    public int compareTo(Student o) {

        return this.name.compareTo(o.name) ;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", olympic=" + olympic +
                "} \n";
    }
}
