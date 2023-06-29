package ru.iedev.taskmanager.model.tested.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example1Map {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("test1");
        stringList.add("safgasfasf");
        stringList.add("asdsadasasdasdas");
        stringList.add("sgsgsdfsd");

        Stream<String> stream = stringList.stream();
        List<Integer> collect = stream.map(o -> o.length()).collect(Collectors.toList());
        System.out.println(collect);

        int[] ints = new int[]{5,5,7,3,1,2,4,9,45};
        Arrays.stream(ints).map(operand -> operand*3).forEach(value -> System.out.println(value));



    }

}
