package Lists;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        /*
            Instaciação e alguns métodos das listas para manipulação dos dados.
         */

        List<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(5);

        list.add(3, 4);

        for (Integer x:list){
            System.out.println(x);
        }
        System.out.println("----------------------------");
        list.removeIf(x -> x == 4);

        for (Integer x:list){
            System.out.println(x);
        }
        List<Integer> nome = list.stream().filter(x -> x == 5).toList();
        System.out.println("----------------------------");
        System.out.println(nome);
        System.out.println("----------------------------");
        Integer i = list.stream().filter(x -> x == 5).findFirst().orElse(null);
        System.out.println(i);
    }
}
