package com.startjava.lesson_2_3_4.bookshelf;

public class Shelf {

    public static final int MAX_BOOK_COUNT = 10;
    private Book[] books;
    private static int currentCount = 0;

    public Shelf() {
        this.books = new Book[MAX_BOOK_COUNT];
    }

    public void showBooks() {
        System.out.println("Все книги на полке: ");
        for (Book book : books) {
            if(book != null) {
                System.out.println(book);
            } else {
                System.out.format("<%26s>%n", "");
            }
        }
    }

    public int getCurrentCount() {
        return currentCount;
    }

    public void addBook(String bookDescription) {
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

    private Book createBook(String bookDescription) {
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

    private int checkYear(String partsExpression) {
        try {
            return Integer.parseInt(partsExpression);
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат года. Год выпуска установлен в 2000");
            return 2000;
        }
    }

    public void deleteBook(String title) {
        int index = findIndex(title);
        if(index != -1) {
            System.out.format("Книга %s удалена%n", title);
            System.arraycopy(books, index + 1, books, index, currentCount - (index + 1));
            books[currentCount - 1] = null;
            currentCount--;
            removeDuplicates();
        }
    }

    private void removeDuplicates() {
        for (int j = 0; j < currentCount; j++) {
            for (int k = j + 1; k < currentCount - 1; k++) {
                if(books[j] == null) {
                    continue;
                }
                if(books[j].equals(books[k])) {
                    books[k] = null;
                }
            }
        }
    }

    public Book findBook(String title) {
        int index = findIndex(title);
        if(index != -1) {
            return books[index];
        }
        return null;
    }

    private int findIndex(String title) {
        for (int i = 0; i < currentCount; i++) {
            if (books[i].getTitle().equals(title)) {
                return i;
            }
        }
        System.out.format("Книги с названием: %s нет на полке%n", title);
        return -1;
    }
}
