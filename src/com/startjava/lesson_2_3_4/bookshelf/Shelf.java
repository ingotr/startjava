package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Scanner;

public class Shelf {

    private static final String INVALID_YEAR_FORMAT = "Неверный формат года. Год выпуска установлен в 2000%n%n";
    private static final int MAX_BOOK_COUNT = 10;
    private static Book[] books  = new Book[MAX_BOOK_COUNT];
    private static int currentCount = 0;
    private static int freeSpace = 10;
    private static Scanner scanner = new Scanner(System.in);

    public static void start(String userChoice) {
        switch (userChoice) {
            case "1" -> addBook();
            case "2" -> deleteBook();
            case "3" -> printFoundedBook();
            case "4" -> printTotalCount();
            case "5" -> printFreeSpace();
            case "6" -> System.out.println("Спасибо за работу с программой");
            default -> System.out.println("Неизвестный пункт меню. Попробуйте выбрать еще раз");
        }
    }

    public static void showBooks() {
        System.out.println("Все книги на полке: ");
        for (Book book : books) {
            try {
                System.out.format("<%10s %10s %4d>%n", book.getAuthor(), book.getTitle(), book.getYear());
            } catch(NullPointerException e) {
                System.out.format("<%26s>%n", "");
            }
        }
    }

    private static int getCurrentCount() {
        return currentCount;
    }

    private static int getFreeSpace() {
        return freeSpace;
    }

    private static void addBook() {
        if(getFreeSpace() == 0) {
            System.out.println("На полке нет свободного места. Попробуйте удалить ненужные книги");
            return;
        }

        String bookDescription = getInput().trim();
        if (bookDescription.equals("")) {
            System.out.println("Вы ввели пустую строку. Повторите ввод");
            return;
        }

        Book newBook = createBook(bookDescription);
        if(newBook == null) {
            return;
        }

        for (int i = 0; i < books.length; i++) {
            if(books[i] == null) {
                books[i] = newBook;
                currentCount++;
                freeSpace--;
                return;
            }
        }
    }

    private static String getInput() {
        String INTRO_TEXT = """
            Введите сведения о новой книге в формате
            (автор_книги пробел название_книги пробел год):
            """;
        System.out.println(INTRO_TEXT);
        return scanner.nextLine();
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

    private static void deleteBook() {
        int i = getIndex();
        if(i != -1) {
            System.out.format("Книга %s удалена%n", books[i].getTitle());
            try {
                System.arraycopy(books, i + 1, books, i, getCurrentCount() - (i + 1));
                System.out.println("curr i: " + i);
                System.out.println("currentCount: " + getCurrentCount());
                books[getCurrentCount() - 1] = null;
                currentCount--;
                freeSpace++;
            } catch(IndexOutOfBoundsException e) {
                System.out.println("Элемент пустой или удален");
            }

            removeDuplicates();
        }
    }

    private static void removeDuplicates() {
        for (int j = 0; j < getCurrentCount(); j++) {
            for (int k = j + 1; k < getCurrentCount() - 1; k++) {
                try {
                    if(books[j].equals(books[k])) {
                        books[k] = null;
                    }
                } catch (NullPointerException e) {
                    System.out.println("Элемент пустой или удален");
                }
            }
        }
    }

    private static void printFoundedBook() {
        String foundedBook = """
                Удалось найти книгу:
                автор: %s название: %s год: %s
                """;
        int i = getIndex();
        if (i != -1) {
            System.out.format(foundedBook, books[i].getAuthor(), books[i].getTitle(), books[i].getYear());
        }
    }

    private static int getIndex() {
        if(getCurrentCount() == 0) {
            System.out.println("На полке нет книг. Добавьте новые книги");
            return -1;
        }

        System.out.printf("Введите название книги для поиска: %n");
        String title = scanner.next();
        for (int i = 0; i < getCurrentCount(); i++) {
            if (books[i].getTitle().equals(title)) {
                return i;
            }
        }
        System.out.format("Книги с названием: %s нет на полке\n", title);
        return -1;
    }

    private static void printTotalCount() {
        System.out.format("Всего книг на полке %d: %n", getCurrentCount());
    }

    private static void printFreeSpace() {
        System.out.format("На полке осталось места для %d книг%n", getFreeSpace());
    }
}
