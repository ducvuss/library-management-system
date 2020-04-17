package models;

import java.io.Serializable;

/**
 * Book class
 */
public class Book implements Serializable{
    /**
	 *
	 */
	private static final long serialVersionUID = 1930404926290293251L;
	/**
	 *
	 */
	private Integer bookId;
	private String bookName;
	private Integer authorId;
	private Integer publisherId;

    public Book(String bookId, String bookName, String authorId, String publisherId) {
        setProperties(bookId, bookName, authorId, publisherId);
    }
    
    public Book(String bookInfo) {
        String[] book = bookInfo.split(",");
        setProperties(book[0], book[1], book[2], book[3]);
    }
    
    private void setProperties(String bookId, String bookName, String authorId, String publisherId){
        this.bookId = Integer.parseInt(bookId);
        this.bookName = bookName;
        this.authorId = Integer.parseInt(authorId);
        this.publisherId = Integer.parseInt(publisherId);
    }

	/**
     * @return the bookName
     */
    public String getTitle() {
        return bookName;
    }

    /**
     * @param bookName the bookName to set
     */
    public void setTitle(String bookName) {
        this.bookName = bookName;
    }
}