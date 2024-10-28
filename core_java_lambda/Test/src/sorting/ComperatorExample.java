package sorting;

import java.util.*;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}

public class ComperatorExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 23));
        people.add(new Person("Bob", 34));
        people.add(new Person("Charlie", 19));
        people.add(new Person("David", 23));
        
        // Sorting by name (lexicographical order)
        Comparator<Person> nameComparator = (p1, p2) -> p1.getName().compareTo(p2.getName());
        
        Comparator<Person> nameComparator1 = Comparator.comparing(Person::getName);
        
        // Sorting by age (natural number order)
        Comparator<Person> ageComparator = Comparator.comparingInt(Person::getAge);
        Comparator<Person> ageComparator1 = Comparator.comparingInt(p -> p.getAge());

        // Sorting by name and then by age (if names are equal)
        Comparator<Person> nameThenAgeComparator = nameComparator.thenComparing(ageComparator);
        
        System.out.println("Original List:");
        people.forEach(System.out::println);

        // Sort by name
        people.sort(nameComparator);
        System.out.println("\nSorted by name:");
        people.forEach(System.out::println);

        // Sort by age
        people.sort(ageComparator);
        System.out.println("\nSorted by age:");
        people.forEach(System.out::println);

        // Sort by name, then by age
        people.sort(nameThenAgeComparator);
        System.out.println("\nSorted by name, then by age:");
        people.forEach(System.out::println);
        
        System.out.println("\nSorted by name, then by age: kanchan");
        
        // Sort by name
        people.sort(nameComparator1);
        System.out.println("\nSorted by name:");
        people.forEach(System.out::println);

        // Sort by age
        people.sort(ageComparator1);
        System.out.println("\nSorted by age:");
        people.forEach(System.out::println);
    }
}
