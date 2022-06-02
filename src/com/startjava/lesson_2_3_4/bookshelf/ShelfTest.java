package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Scanner;

public class ShelfTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.format("%nДобро пожаловать в программу - \"Книжная полка\"%n");
        String MENU_TEXT = """
                Выберите желаемый пункт меню:
                1. Добавить книгу
                2. Удалить книгу
                3. Найти книгу (по названию)
                4. Вывести число всех книг
                5. Вывести количество свободного места
                6. Выйти из программы
                """;
        String userChoice;

        do {
            Shelf.showBooks();
            System.out.println(MENU_TEXT);
            userChoice = scanner.next();
            parseUserChoice(userChoice);
        } while(!userChoice.equals("6"));
    }

    private static void parseUserChoice(String userChoice) {
        switch (userChoice) {
            case "1" -> addNewBook();
            case "2" -> deleteBook();
            case "3" -> findBook();
            case "4" -> System.out.format("Всего книг на полке %d: %n", Shelf.getCurrentCount());
            case "5" -> System.out.format("На полке осталось места для %d книг%n",
                    Shelf.MAX_BOOK_COUNT - Shelf.getCurrentCount());
            case "6" -> System.out.println("Спасибо за работу с программой");
            default -> System.out.println("Неизвестный пункт меню. Попробуйте выбрать еще раз");
        }
    }

    private static void addNewBook() {
        if(Shelf.getCurrentCount() == Shelf.MAX_BOOK_COUNT) {
            System.out.println("На полке нет свободного места. Попробуйте удалить ненужные книги");
            return;
        }

        String ADD_TEXT = """
                Введите сведения о новой книге в формате
                (автор_книги пробел название_книги пробел год):
                """;
        System.out.println(ADD_TEXT);
        Shelf.addBook(getUserInput());
    }

    private static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine().trim();
        if (userInput.equals("")) {
            System.out.println("Вы ввели пустую строку. Повторите ввод");
            return null;
        }
        return userInput;
    }

    private static void deleteBook() {
        Shelf.deleteBook(getTitle());
    }

    private static void findBook() {
        Book book = Shelf.getBook(getTitle());
        String FOUND_TEXT = """
                Удалось найти книгу:
                автор: %s название: %s год: %s
                """;

        if(book != null) {
            System.out.format(FOUND_TEXT, book.getAuthor(), book.getTitle(), book.getYear());
        }
    }

    private static String getTitle() {
        if(Shelf.getCurrentCount() == 0) {
            System.out.println("На полке нет книг. Добавьте новые книги");
            return "";
        }

        System.out.printf("Введите название книги для поиска: %n");
        return getUserInput();
    }
}
