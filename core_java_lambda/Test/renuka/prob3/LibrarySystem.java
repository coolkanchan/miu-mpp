package lesson9.lab9updatedsolutions.prob3;

import java.util.List;
import java.util.stream.Collectors;

public class LibrarySystem {
    public static void main(String[] args) {
        // Create some libraries
        Library library1 = new Library("City Library", List.of("Origin", "Inferno", "Dune", "Foundation"));
        Library library2 = new Library("Town Library", List.of("Twilight", "Outliers"));
        Library library3 = new Library("Village Library", List.of("Becoming", "Leadership", "Creativity", "Sapiens", "Rebecca"));

        // Task 1. Create a list of libraries
        List<Library> libraries = List.of(library1, library2, library3);

        // Task 2: Filter libraries that have more than 3 books and print the name of the Library
        List<String> filteredLibraries = libraries.stream()
                .filter(library -> library.getBooks().size() > 3)
                .map(Library::getName)
                .collect(Collectors.toList());


        // Task 3: FlatMap to get all the book titles from the filtered libraries
        List<String> allBookTitles = libraries.stream()
                .flatMap(library -> library.getBooks().stream()) // Flatten the books list from multiple libraries
                .collect(Collectors.toList());

        // Output the results
        System.out.println("Filtered Libraries (more than 3 books): " + filteredLibraries);
        System.out.println("All Book Titles from Filtered Libraries: " + allBookTitles);
    }
}
