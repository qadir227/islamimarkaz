package model;

/**
 * Created by Qadir Hussain on 11/28/2015.
 */
public class BookData {

    private String bookTitle;
    private String bookAuthor;
    private String bookImageUrl;
    private String bookLanguage;

    public BookData(String bookTitle, String bookAuthor, String bookImageUrl, String bookLanguage) {

        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookImageUrl = bookImageUrl;
        this.bookLanguage = bookLanguage;


    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getBookImageUrl() {
        return bookImageUrl;
    }

    public String getBookLanguage() {
        return bookLanguage;
    }
}
