package collections.suppliers;

import collections.core.GlobalCounter;
import collections.core.random.api.Java7Random;
import collections.dto.Student;
import collections.core.random.api.FakeRandom;
import collections.core.random.api.IRandom;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

public class RandomStudentSupplier implements Supplier<Student> {

    private final IRandom rnd;
    private GlobalCounter counter;

    public RandomStudentSupplier(GlobalCounter counter, IRandom rnd) {
        this.counter = counter;
        this.rnd = rnd;
    }

    /**
     * Gets a result.
     *
     * @return a result
     */
    @Override
    public Student get() {
        IRandom rnd = this.rnd;
        return new Student(
                counter.getAndInc(),
                rnd.randString(3,10),
                rnd.randInt(7,17),
                rnd.randDouble(0.0, 10.0),
                rnd.randBoolean()

        );
    }
}
