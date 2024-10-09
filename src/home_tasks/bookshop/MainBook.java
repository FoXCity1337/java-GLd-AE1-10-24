package home_tasks.bookshop;

import java.util.ArrayList;

public class MainBook {
    public static void main(String[] args) {
        BookInformation book1 = new BookInformation(1, "Гарри Поттер и узник Азкабана",
                "Дж. К. Роулинг", 528, 2013,"Азбука");
        BookInformation book2 = new BookInformation(2, "Гарри Поттер и Принц-полукровка",
                "Дж. К. Роулинг", 672, 2015,"Эксмо");
        BookInformation book3 = new BookInformation(3, "Возвращение Шерлока Холмса",
                "Артур Дойл", 832,"Азбука");
        BookInformation book4 = new BookInformation(4, "Приключения Шерлока Холмса",
                "Артур Дойл", 308,"Эксмо");
        BookInformation book5 = new BookInformation(5, "Властелин колец. Возвращение короля",
                "Джон Толкин", "ACT", 2024, 416, 374, "Мягкий");
        BookInformation book6 = new BookInformation(6, "Властелин колец. Хранители кольца",
                "Джон Толкин", "ACT", 2021, 576, 450, "Мягкий");

        BookUtils bookList = new BookUtils(new ArrayList<>());

        bookList.addBook(book1);
        bookList.addBook(book2);
        bookList.addBook(book3);
        bookList.addBook(book4);
        bookList.addBook(book5);
        bookList.addBook(book6);

        //bookList.getAuthorsBook();
        //bookList.getPublishingBook();
        //bookList.searchByYearIssue();
    }
}
