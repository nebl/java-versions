package method_reference;

import default_static.InterfaceExample2;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class MethodReferenceExample {

    public static void referenceExample(){
        System.out.println("This is a reference call");
    }


    public static void main(String[] args) {

        Runnable runnable = MethodReferenceExample::referenceExample;
        runnable.run();

        List<String> nameList = Arrays.asList("Ali", "Veli", "Ahmet", "Mehmet");
        nameList.stream()
                .forEach(val -> System.out.println(val));

        //better way
        nameList.stream()
                .forEach(System.out::println);

        BiFunction<Integer, Integer, Integer> sum = Integer::sum;
        System.out.println(sum.apply(10, 20));
    }
}
