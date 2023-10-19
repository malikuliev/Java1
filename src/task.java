
public class task {

	public static void main(String[] args) {
        class Book {
            int id;
            String name;
            String author;
            int pageCount;
            String description;
        }

        Book book1 = new Book();
        book1.id = 1;
        book1.name = "Java Programming";
        book1.author = "John Smith";
        book1.pageCount = 300;
        book1.description = "A comprehensive guide to Java programming.";

        Book book2 = new Book();
        book2.id = 2;
        book2.name = "Python for Beginners";
        book2.author = "Alice Johnson";
        book2.pageCount = 200;
        book2.description = "An introduction to Python programming for beginners.";

        System.out.println("Book 1:");
        System.out.println("ID: " + book1.id);
        System.out.println("Name: " + book1.name);
        System.out.println("Author: " + book1.author);
        System.out.println("Page Count: " + book1.pageCount);
        System.out.println("Description: " + book1.description);

        System.out.println("\nBook 2:");
        System.out.println("ID: " + book2.id);
        System.out.println("Name: " + book2.name);
        System.out.println("Author: " + book2.author);
        System.out.println("Page Count: " + book2.pageCount);
        System.out.println("Description: " + book2.description);



	}

}
