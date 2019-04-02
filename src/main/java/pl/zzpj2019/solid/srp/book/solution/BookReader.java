package pl.zzpj2019.solid.srp.book.solution;

public class BookReader implements Readable {
    private int currentPage = 0;
    private Book book;

    public BookReader(Book book) {
        this.book = book;
    }

    @Override
    public void turnPage() {
        currentPage ++;
    }

    @Override
    public String getCurrentPageContents() {
        return this.book.getPages().get(currentPage);
    }
}
