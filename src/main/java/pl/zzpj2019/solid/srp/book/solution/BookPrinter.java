package pl.zzpj2019.solid.srp.book.solution;

import java.util.Map;

public class BookPrinter implements Printable {
    @Override
    public void printPage(Book book, int pageNumber) {
        String pageContent = book.getPages().get(pageNumber);
        System.out.println(pageContent);
    }

    @Override
    public String printAllPages(Book book) {
        StringBuilder bookPages = new StringBuilder();
        for (Map.Entry<Integer, String> page : book.getPages().entrySet()) {
            bookPages.append(page.getKey() + " " + page.getValue());
        }
        return bookPages.toString();
    }
}
