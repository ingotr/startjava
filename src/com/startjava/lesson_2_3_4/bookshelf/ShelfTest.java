package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Scanner;

public class ShelfTest {
    private static Scanner scanner = new Scanner(System.in);
    private static Shelf newShelf = new Shelf();

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в программу - \"Книжная полка\"");
        String menuItems = """
                Выберите желаемый пункт меню:
                1. Добавить книгу
                2. Удалить книг
                3. Найти книгу (по названию)
                4. Вывести число всех книг
                5. Вывести количество свободного места
                6. Выйти из программы
                """;
        String userChoice;

        do {
            newShelf.showBooks();
            System.out.println(menuItems);
            userChoice = scanner.nextLine();
            parseUserChoice(userChoice);
        } while(!userChoice.equals("6"));
    }

    private static void parseUserChoice(String userChoice) {
        switch (userChoice) {
            case "1" -> addNewBook();
            case "2" -> deleteBookByTitle();
            case "3" -> findBookByTitle();
            case "4" -> System.out.format("Всего книг на полке %d: %n", newShelf.getCurrentCount());
            case "5" -> System.out.format("На полке осталось места для %d книг%n",
                    Shelf.MAX_BOOK_COUNT - newShelf.getCurrentCount());
            case "6" -> System.out.println("Спасибо за работу с программой");
            default -> System.out.println("Неизвестный пункт меню. Попробуйте выбрать еще раз");
        }
    }

    private static void addNewBook() {
        if(newShelf.getCurrentCount() == Shelf.MAX_BOOK_COUNT) {
            System.out.println("На полке нет свободного места. Попробуйте удалить ненужные книги");
            return;
        }

        String msgForAdd = """
                Введите сведения о новой книге в формате
                (автор_книги пробел название_книги пробел год):
                """;
        System.out.println(msgForAdd);
        newShelf.addBook(receiveUserInput());
    }

    private static void deleteBookByTitle() {
        newShelf.deleteBook(findTitle('d'));
    }

    private static void findBookByTitle() {
        Book book = newShelf.findBook(findTitle('f'));
        String msgForFound = """
                Удалось найти книгу:
                автор: %s название: %s год: %s
                """;

        if(book != null) {
            System.out.format(msgForFound, book.getAuthor(), book.getTitle(), book.getYear());
        }
    }

    private static String findTitle(char operationFlag) {
        if(newShelf.getCurrentCount() == 0) {
            System.out.println("На полке нет книг. Добавьте новые книги");
            return "";
        }

        String operationType;
        if (operationFlag == 'd') {
            operationType = "удаления";
        } else {
            operationType = "поиска";
        }

        System.out.format("Введите название книги для %s: %n", operationType);
        return receiveUserInput();
    }
    
    private static String receiveUserInput() {
        String userInput = scanner.nextLine().trim();
        if (userInput.isBlank()) {
            System.out.println("Вы ввели пустую строку. Повторите ввод");
            return null;
        }
        return userInput;
    }
}
