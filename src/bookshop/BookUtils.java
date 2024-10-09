package bookshop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class BookUtils {
    private ArrayList<BookInformation> bookList;

    public BookUtils(ArrayList<BookInformation> bookInformation) {
        this.bookList = bookInformation;
    }

    public void addBook(BookInformation bookInformation) {
        this.bookList.add(bookInformation);
    }

    private void getAuthorsList() {
        HashSet<String> authorsList = new HashSet<>();
        for (BookInformation information : bookList) {
            authorsList.add(information.getAuthor());
        }
        System.out.println(authorsList);
    }

    private void getPublishingList() {
        HashSet<String> publishingList = new HashSet<>();
        for (BookInformation information : bookList) {
            publishingList.add(information.getPublishing());
        }
        System.out.println(publishingList);
    }

    public void getAuthorsBook() {
        getAuthorsList();
        System.out.println("Введите нужного автора");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println("Книги заданного автора: ");
        for (BookInformation information : bookList) {
            if (string.equalsIgnoreCase(information.getAuthor())) {
                System.out.println(information.getName());
            }
        }
    }

    public void getPublishingBook() {
        getPublishingList();
        System.out.println("Введите нужное издательство");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println("Книги заданного издательства: ");
        for (BookInformation information : bookList) {
            if (string.equalsIgnoreCase(information.getPublishing())) {
                System.out.println(information.getName());
            }
        }
    }

    public void searchByYearIssue() {
        System.out.println("Введите год выпуска");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        System.out.println("Книги выпущенные с момента заданного года: ");
        for (BookInformation information : bookList) {
            if (information.getPublishingYear() >= year) {
                System.out.println(information.getName());
            }
        }
    }

}
