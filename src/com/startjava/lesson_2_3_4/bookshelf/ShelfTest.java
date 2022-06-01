package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Scanner;

public class ShelfTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.format("%nДобро пожаловать в программу - \"Книжная полка\"%n");
        String menu = """
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
            System.out.println(menu);
            userChoice = scanner.next();
            Shelf.start(userChoice);
        } while(!userChoice.equals("6"));
    }
}
