package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book java = new Book("Head first.", "Education", 20);
        Book franklin = new Book("Benjamin Franklin.", "Biography", 15);
        Book hobbit = new Book("Hobbit. Unexpected journey.", "Fantasy", 10);
        Book behaviour = new Book("Predictable irrationality.", "Psychology", 25);

        Book[] books = new Book[4];
        books[0] = java;
        books[1] = franklin;
        books[2] = hobbit;
        books[3] = behaviour;

        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            System.out.println(b.getName() + " " + b.getGenre() + " " + b.getCount());
        }

        Book code = new Book("Clean code.", "Education", 5);
        books[2] = code;

        System.out.println();
        System.out.println("Replace Hobbit to Clean code.");
        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            System.out.println(b.getName() + " " + b.getGenre() + " " + b.getCount());
        }
        System.out.println();
        System.out.println("Swap variables under 0 index to the index 3");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            System.out.println(b.getName() + " " + b.getGenre() + " " + b.getCount());
        }
        System.out.println();
        System.out.println("Show only Clean code");
        for (int i = 0; i < books.length; i++) {
            if (books[i].equals(code)) {
                Book b = books[i];
                System.out.println(b.getName() + " " + b.getGenre() + " " + b.getCount());
            }
        }
    }
}
