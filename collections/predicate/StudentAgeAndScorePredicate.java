package collections.predicate;

import collections.dto.Student;

import java.util.function.Predicate;

public class StudentAgeAndScorePredicate implements Predicate<Student> {

    private final int age;
    private final int score;

    public StudentAgeAndScorePredicate(int age, int score) {
        this.age = age;
        this.score = score;
    }

    /**
     * Evaluates this predicate on the given argument.
     *
     * @param student the input argument
     * @return {@code true} if the input argument matches the predicate,
     * otherwise {@code false}
     */
    @Override
    public boolean test(Student student) {
        return student.getAge() >= age && student.getScore() > score;
    }
}
