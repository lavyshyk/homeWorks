package homework4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;


public class DataContainer<T> implements Comparator<T>, Iterable<T> {

    private T[]data;

    public DataContainer(T[] t){
        this.data = t;

    }

    public DataContainer(){}


    /**
     *   В данном классе должен быть метод int add(T item) который добавляет данные во внутреннее поле data.
     *    При заполнении массива поля T[] происходит копирование массива с добавлением замера +1;
     * @param item
     * @return индекс помещенного элемента, если в передаваемом аргументе null , возвращает -1;
     */
    public int add(T item){
        if(item == null){
            return -1;
        }
        int i = 0;
        for ( ; i < this.data.length; i++){
            if(data[i] == null){
                data[i] = item;
                break;
            }
           if(i == data.length-1){       // В случае если поле data переполнено, нужно придумать механизм который

               data = Arrays.copyOf(data, (data.length+1));         // будет расширять пространство для новых элементов.
               // data = Arrays.copyOf(data, (int)(data.length*1.5));
           }

        }
        return i;
    }

    /**
     *   В данном классе должен быть метод T get(int index). Данный метод получает из DataContainer'а, из поля data
     * @param index      номер индекса массива data
     * @return возвращает значение поля data под индексом [index}
     */
    public T get (int index) {
        if(index >= data.length){
            return null;
        }
        return  data[index];
    }

    /**
     *     В данном классе должен быть метод T[] getItems().
     * @return    Данный метод возвращает поле data вызывающего объекта.
     */
    public T[] getItems(){
        return data;
    }

    public boolean delete(int index){

        if (index < data.length){

           T[] tmp =(T[])new Object [data.length]; // плохая практика


            int j = 0;
            for (int i = 0; i < data.length; i++) {

                if (data[i] != null && index != i){

                    tmp[j] = data[i];
                    j++;                     // несколько приложений j -  счетчик элементов и размер выходного массива


                }
            }
            data = Arrays.copyOf(tmp, j);
            return true;
        }
        return false;
    }

    public boolean delete(T item){
        for (int i = 0; i < data.length; i++) {
            if(item.equals(data[i])){
                return delete(i);
            }
        }
        return false;
    }

    /**
     * Данный метод занимается сортировкой данных записанных в поле data используя реализацию сравнения из ПЕРЕДАННОГО
     * объекта comparator.
     *
     * @param comparator  реализация сравнения для конкретного типа данных
     */
    public void sort(Comparator<T> comparator){

        Arrays.sort(data, 0,data.length, comparator);

    }


    /**
     * Переопределить метод toString() в классе и выводить содержимое data без ячеек в которых хранится null.
     * @return
     */
    public String toString() {
        if (data == null) {
            return "null";
        }
        StringBuilder builder = new StringBuilder();
        builder.append('[');

        for (int i = 0; i < data.length; i++) {
            if (data[i] == null){
                if(i == data.length-1){
                    builder.append(']');
                    break;
                }
                continue;
            }
            builder.append(data[i]);

            if(i == data.length-1) {
                builder.append(']');
                break;

            }
            builder.append(", ");
        }

        return builder.toString();
    }



    @Override
    public int compare(T o1, T o2) {
        return 0;
    }

    /**
     * 11.* В даном классе должен быть СТАТИЧЕСКИЙ метод void sort(DataContainer<.............> container)
     * который будет принимать объект DataContainer с дженериком extends Comparable. Данный метод будет сортировать
     * элементы в ПЕРЕДАННОМ объекте DataContainer используя реализацию сравнения вызываемый у хранимых объектов.
     * @param container объекте DataContainer
     * @param <T>  тип поддерживающий интерфейс Comparable
     */
    public static<T extends Comparable<T>>  void sort(DataContainer<T> container){
        Arrays.sort(container.getItems());

    }

    /**
     *В данном классе должен быть СТАТИЧЕСКИЙ метод void sort(DataContainer<.............> container,
     * Comparator<.......> comparator) который будет принимать объект DataContainer и реализацию интерфейса Comparator.
     * Данный метод будет сортировать элементы в ПЕРЕДАННОМ объекте DataContainer используя реализацию сравнения из
     * ПЕРЕДАННОГО объекта интерфейса Comparator.
     * @param container объекте DataContainer
     * @param comparator реализация сравнения для конкретного типа данных
     * @param <T>
     */
    public static <T> void sort(DataContainer<T> container, Comparator<T> comparator){
        Arrays.sort(container.getItems(), comparator);
    }




    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator<T> iterator() {
        Iterator<T> it = new Iterator<T>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < data.length && data[index] != null;
            }

            @Override
            public T next() {
                return data[index++];
            }
        };


        return it;
    }

    /**
     * Performs the given action for each element of the {@code Iterable}
     * until all elements have been processed or the action throws an
     * exception.  Actions are performed in the order of iteration, if that
     * order is specified.  Exceptions thrown by the action are relayed to the
     * caller.
     * <p>
     * The behavior of this method is unspecified if the action performs
     * side-effects that modify the underlying source of elements, unless an
     * overriding class has specified a concurrent modification policy.
     *
     * @param action The action to be performed for each element
     * @throws NullPointerException if the specified action is null
     * @implSpec <p>The default implementation behaves as if:
     * <pre>{@code
     *     for (T t : this)
     *         action.accept(t);
     * }</pre>
     * @since 1.8
     */
    @Override
    public void forEach(Consumer<? super T> action) {
        if(action == null){
            throw  new NullPointerException();
        }
        T elem = null;
        for (T t : this) {
            elem = t;
        }
        action.accept(elem);
    }

    
}
