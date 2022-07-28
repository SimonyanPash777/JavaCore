package myChapter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Program {

    public static void main(String[] args) {

        Map<Integer, String> states = new HashMap<>();
        states.put(1, "Germany");
        states.put(2, "Spain");
        states.put(4, "France");
        states.put(3, "Italy");

        // stanum enq objecty klyuchov 3
        String first = states.get(3);
        System.out.println(first);
        // stanum enq bolor klyuchnery
        Set<Integer> keys = states.keySet();
        // stanum enq bolor velunery
        Collection<String> values = states.values();
        //poxum enq elementy
        states.replace(1, "Poland");
        // jnjum enq tvyal elementy klyuchov 3
        states.remove(3);

        for(Map.Entry<Integer, String> item : states.entrySet()){

            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
        }

        Map<String, Person> people = new HashMap<>();
        people.put("1240i54", new Person("Tom"));
        people.put("1564i55", new Person("Bill"));
        people.put("4540i56", new Person("Nick"));

        for(Map.Entry<String, Person> item : people.entrySet()){

            System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue().getName());
        }
    }

}
