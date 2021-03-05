package collections;

import collections.comparators.StudentAgeAndScoreComparator;
import collections.core.GlobalCounter;
import collections.core.random.api.Java7Random;
import collections.dto.Student;
import collections.predicate.StudentAgeAndScorePredicate;
import collections.suppliers.RandomStudentSupplier;
import collections.utils.SortUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class CollectionsMain1 {
    public static void main(String[] args) {
        List<Student> data = new ArrayList<>();

       // IRandom rnd = new Java7Random();
        Supplier<Student> supplier = new RandomStudentSupplier(new GlobalCounter(), new Java7Random(), 3, 10);

        do {

            data.add(supplier.get());
        }while (data.size() < 10_000);
        /**
         *  По возрасту (тем кому 12 и выше), по оценке (выше 8).
         *  Отфильтрованных студентов поместить в отдельный список.
         */
        List<Student> filteredStudent = new ArrayList<>();
        Predicate<Student> predicate = new StudentAgeAndScorePredicate(7, 8);
        for (Student value : data) {
            if (predicate.test(value)){
                filteredStudent.add(value);
            }

        }



         //  4. Отсортировать отфильтровандентов по имени, от меньшему к большему. Выестиных сту топ 10

//        StudentNameComparator studentNameComparator = new StudentNameComparator();
//        SortUtils.bubbleSort(filteredStudent, studentNameComparator);
//        System.out.println(filteredStudent.subList(0, 10));

        //  5. Отсортировать отфильтрованных студентов по оценке, от большего к меньшему. Выести топ 10

//        StudentScoreComparator studentScoreComparator = new StudentScoreComparator();
//        SortUtils.shakerSort(filteredStudent,studentScoreComparator.reversed());
//        System.out.println(filteredStudent.subList(0, 10));



        // 6. Отсортировать отфильтрованных студентов по возрасту и оценке одновременно. Вывести топ 10 в каждом возрасте.

        StudentAgeAndScoreComparator studentAgeAndScoreComparator = new StudentAgeAndScoreComparator();
        SortUtils.bubbleSort(filteredStudent, studentAgeAndScoreComparator);
        int age = filteredStudent.get(0).getAge();
        int temp = age;
        System.out.println(filteredStudent.subList(0,10));
        for (int i = 10; i < filteredStudent.size(); i++) {


            if(temp < filteredStudent.get(i).getAge()){
                System.out.println(filteredStudent.subList(i, i + 10));
                i = i + 10;
                temp = filteredStudent.get(i).getAge();
            }

        }




    }


}
