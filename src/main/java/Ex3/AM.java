package Ex3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AM {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat(5, "cat", "male" ));
        animals.add(new Dog(5, "dog", "male" ));
        animals.add(new Dog(4, "dog", "male" ));
        animals.add(new Frog(5, "frog", "male" ));
        animals.add(new Frog(9, "frog", "male" ));
        animals.add(new Kitten(5, "kitten"));
        animals.add(new Tomcat(5, "tomcat"));

        for (Animal animal : animals
             ) {
            System.out.print(animal.toString() + ": ");
            animal.sound();
        }

        Map<String, List<Animal>> types = new HashMap<>();
        types.put("kitten", new ArrayList<>());
        types.put("dog", new ArrayList<>());
        types.put("frog", new ArrayList<>());
        types.put("tomcat", new ArrayList<>());

        boolean isAdd = false;
        for (Animal animal : animals
        ) {
            if (animal instanceof Kitten) types.get("kitten").add(animal);
            if (animal instanceof Dog) types.get("dog").add( animal);
            if (animal instanceof Frog) types.get("frog").add( animal);;
            if (animal instanceof Tomcat) types.get("tomcat").add(animal);;
        }

        for (Map.Entry<String, List<Animal>> type : types.entrySet()
             ) {
            double avg = 0;
            for (Animal animal : type.getValue()
                 ) {
                avg += animal.age;
            }
            avg /= type.getValue().size();
            System.out.println("Avage age of " + type.getKey() + " : " + avg);
        }
    }
}
