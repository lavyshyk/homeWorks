package collections.comparators;

import collections.dto.Student;

import java.util.Comparator;

public class StudentAgeAndScoreComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {

        int i = o1.getAge() - o2.getAge();
        if(i == 0){
            return Double.compare(o1.getScore(), o2.getScore());
        }
        return i;
    }
}
