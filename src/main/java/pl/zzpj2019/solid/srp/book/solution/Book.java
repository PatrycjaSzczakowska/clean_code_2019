package pl.zzpj2019.solid.srp.book.solution;

import java.util.HashMap;
import java.util.Map;

public class Book {
    private Map<Integer, String> pages = new HashMap<>();

    private String libraryRoomName;
    private String rowLocator;
    private int indexOnShelf;

    public String getTitle() {
        return "A Great Book";
    }

    public String getAuthor() {
        return "John Doe";
    }

    public Map<Integer, String> getPages() {
        return pages;
    }

    public void setPages(Map<Integer, String> pages) {
        this.pages = pages;
    }

    public String getLibraryRoomName() {
        return libraryRoomName;
    }

    public void setLibraryRoomName(String libraryRoomName) {
        this.libraryRoomName = libraryRoomName;
    }

    public String getRowLocator() {
        return rowLocator;
    }

    public void setRowLocator(String rowLocator) {
        this.rowLocator = rowLocator;
    }

    public int getIndexOnShelf() {
        return indexOnShelf;
    }

    public void setIndexOnShelf(int indexOnShelf) {
        this.indexOnShelf = indexOnShelf;
    }
}
