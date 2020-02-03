package ru.job4j.pojo;

public class Shop {
    public Book[] delete(Book[] books, int index) {
        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            if (b != (null)) {
                books[index] = null;
                for (int k = index; k < books.length - 1; k++) {
                        books[k] = books[k + 1];
                        books[k + 1] = null;
                }
                break;
            }
        }
        return books;
    }
    public static void main(String[] args) {
        Shop shop = new Shop();
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
        System.out.println();
        shop.delete(books, 2);
        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            if (b != (null)) {
                System.out.println(b.getName());
            } else {
                System.out.println("null");
            }
        }

    }
}
