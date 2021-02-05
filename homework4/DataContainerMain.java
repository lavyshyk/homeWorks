package homework4;

import java.util.Comparator;

public class DataContainerMain {
    public static void main(String[] args) {
        Integer i[] = {1, 2, 8, 9, null, null, 86};


        String s[] = {"dfg", "jhjg", null, null};
        DataContainer<Integer> in = new DataContainer<Integer>(i);
        DataContainer<Double> in1 = new DataContainer<>(new Double[]{963.26, 89.036,1.2,3.3, null, null, 89.369});
        DataContainer<String> in2 = new DataContainer<>(s);





        Comparator<String > stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1 == null && o2 == null) {
                    return 0;
                }
                if (o1 == null) {
                    return -1;
                }
                if (o2 == null) {
                    return 1;
                }
                return o1.compareTo(o2);
            }
        };

        //in2.sort(stringComparator);
        //DataContainer.sort(in2,stringComparator);
        DataContainer.sort(in2, stringComparator);
        System.out.println(in2.toString());

        Comparator<Double> doubleComparator = new Comparator<Double>(){
          public int compare(Double d1, Double d2){
              if (d1 == null && d2 == null) {
                  return 0;
              }
              if (d1 == null) {
                  return -1;
              }
              if (d2 == null) {
                  return 1;
              }
              return (int)(d1 - d2);

          }
        };

        System.out.println(in1.toString());
        in1.sort(doubleComparator);
        System.out.println(in1.toString());
        in1.add(96.69);
        DataContainer.sort(in1, doubleComparator);
        System.out.println(in1.toString());

        System.out.println(in.toString());
        in.delete((Integer) 9);
        System.out.println(in.toString());

        System.out.println(in.get(5));
        System.out.println(in.delete(2));
        System.out.println(in.toString());

    }
}
