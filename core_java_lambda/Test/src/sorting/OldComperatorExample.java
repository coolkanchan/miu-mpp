package sorting;

import java.util.*;

class example {
    private String name;
    private int age;

    public example(String name, int age) {
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

public class OldComperatorExample {
    public static void main(String[] args) {
        List<example> people = new ArrayList<>();
        people.add(new example("Alice", 23));
        people.add(new example("Bob", 34));
        people.add(new example("Charlie", 19));
        people.add(new example("David", 23));
        
        // Comparator for sorting by name
        Comparator<example> nameComparator = new Comparator<example>() {
            @Override
            public int compare(example p1, example p2) {
                return p1.getName().compareTo(p2.getName());
            }
        };
        
        // Comparator for sorting by age
        Comparator<example> ageComparator = new Comparator<example>() {
            @Override
            public int compare(example p1, example p2) {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        };

        // Comparator for sorting by name, then by age (if names are equal)
        Comparator<example> nameThenAgeComparator = new Comparator<example>() {
            @Override
            public int compare(example p1, example p2) {
                int nameCompare = p1.getName().compareTo(p2.getName());
                if (nameCompare == 0) {
                    return Integer.compare(p1.getAge(), p2.getAge());
                }
                return nameCompare;
            }
        };

        System.out.println("Original List:");
        for (example person : people) {
            System.out.println(person);
        }

        // Sort by name
        Collections.sort(people, nameComparator);
        System.out.println("\nSorted by name:");
        for (example person : people) {
            System.out.println(person);
        }

        // Sort by age
        Collections.sort(people, ageComparator);
        System.out.println("\nSorted by age:");
        for (example person : people) {
            System.out.println(person);
        }

        // Sort by name, then by age
        Collections.sort(people, nameThenAgeComparator);
        System.out.println("\nSorted by name, then by age:");
        for (example person : people) {
            System.out.println(person);
        }
    }
}

