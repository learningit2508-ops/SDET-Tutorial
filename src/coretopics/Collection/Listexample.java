package coretopics.Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Listexample {

    public static void main(String[] args){

        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1,50);

        list.forEach(System.out::println);
        int a = list.get(0);
        boolean b = list.contains(20);
        int number = list.indexOf(30);
        System.out.println("values are :"  +a + " " +b + " " +number);
        list.remove(number);

        list.forEach(System.out::println);






    }
}
