package com.startjava.lesson_2_3_4.bookshelf;

public class Shelf {

    private static final String INVALID_YEAR_FORMAT = "Неверный формат года. Год выпуска установлен в 2000%n%n";
    public static final int MAX_BOOK_COUNT = 10;
    private static Book[] books  = new Book[MAX_BOOK_COUNT];
    private static int currentCount = 0;

    public static void showBooks() {
        System.out.println("Все книги на полке: ");
        for (Book book : books) {
            if(book != null) {
                System.out.format("<%10s %10s %4d>%n", book.getAuthor(), book.getTitle(), book.getYear());
            } else {
                System.out.format("<%26s>%n", "");
            }
        }
    }

    public static int getCurrentCount() {
        return currentCount;
    }

    public static void addBook(String bookDescription) {
        if (bookDescription == null) return;

        Book newBook = createBook(bookDescription);
        if(newBook == null) {
            return;
        }

        for (int i = 0; i < books.length; i++) {
            if(books[i] == null) {
                books[i] = newBook;
                currentCount++;
                return;
            }
        }
    }

    private static Book createBook(String bookDescription) {
        String[] partsDescription = bookDescription.split(" ");
        switch (partsDescription.length) {
            case 0 -> {
                System.out.println("Не удалось добавить книгу. Не хватает автора, названия, года выпуска");
                return null;
            }
            case 1 -> {
                System.out.println("Не удалось добавить книгу. Не хватает названия и года выпуска");
                return null;
            }
            case 2 -> {
                System.out.println("Не удалось добавить книгу. Не хватает года выпуска");
                return null;
            }
        }

        return new Book(partsDescription[0], partsDescription[1],
                checkYear(partsDescription[2]));
    }

    private static int checkYear(String partsExpression) {
        try {
            return Integer.parseInt(partsExpression);
        } catch (NumberFormatException e) {
            System.out.format(INVALID_YEAR_FORMAT);
            return 2000;
        }
    }

    public static void deleteBook(String title) {
        int i = getIndex(title);
        if(i != -1) {
            System.out.format("Книга %s удалена%n", title);
            try {
                System.arraycopy(books, i + 1, books, i, getCurrentCount() - (i + 1));
                books[getCurrentCount() - 1] = null;
                currentCount--;
            } catch(IndexOutOfBoundsException e) {
                System.out.println("Элемент пустой или удален");
            }

            removeDuplicates();
        }
    }

    private static void removeDuplicates() {
        for (int j = 0; j < getCurrentCount(); j++) {
            for (int k = j + 1; k < getCurrentCount() - 1; k++) {
                if(books[j] == null) {
                    continue;
                }
                if(books[j].equals(books[k])) {
                    books[k] = null;
                }
            }
        }
    }

    public static Book getBook(String title) {
        int i = getIndex(title);
        if(i != -1) {
            return books[i];
        }
        return null;
    }

    private static int getIndex(String title) {
        for (int i = 0; i < getCurrentCount(); i++) {
            if (books[i].getTitle().equals(title)) {
                return i;
            }
        }
        System.out.format("Книги с названием: %s нет на полке\n", title);
        return -1;
    }
}
