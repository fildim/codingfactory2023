package gr.aueb.cf.ch19;

import java.util.List;

public class GenericMethodApp {

    public static void main(String[] args) {

        Integer[] arrInt = {1, 2, 3};

        printArr(arrInt);

    }

    public static <T> void printArr(T[] arr) {

        for (T item : arr) {
            System.out.println(item);
        }
    }

    public static void print(NodeGeneric<? super Number> node) {

        System.out.println(node.getValue());
    }

    //PECS -- producer-extends and consumer-super
    public static <T> void produceConsume(List<? super T> list, Iterable<? extends T> src) {

        for (T t : src) {
            list.add(t);
        }
    }
}
