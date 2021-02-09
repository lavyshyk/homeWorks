package collections;

import collections.core.GlobalCounter;
import collections.core.random.api.Java7Random;
import collections.core.random.api.Java8Random;
import collections.dto.Student;
import collections.suppliers.RandomStudentSupplier;
import collections.core.random.api.FakeRandom;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

public class TestMain1 {
    public static void main(String[] args) {

       GlobalCounter counter = new GlobalCounter();

        Supplier<Student> supplier1 = new RandomStudentSupplier(counter, new Java8Random());
        Supplier<Student> supplier2 = new RandomStudentSupplier(counter, new Java8Random());
        Supplier<Student> supplier3 = new RandomStudentSupplier(counter, new Java8Random());
        Supplier<Student> supplier4 = new RandomStudentSupplier(counter, new Java8Random());
        Supplier<Student> supplier5 = new RandomStudentSupplier(counter, new Java8Random());

        System.out.println(supplier1.get());
        System.out.println(supplier2.get());
        System.out.println(supplier3.get());
        System.out.println(supplier2.get());
        System.out.println(supplier5.get());


    }
}
