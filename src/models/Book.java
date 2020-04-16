package models;

import java.io.Serializable;

/**
 * Book class
 */
public class Book implements Serializable{
    /**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private Integer bookId;
	private String bookName;
	private Integer authorId;
	private Integer publisherId;

    public Book(Integer bookId, String bookName, Integer authorId, Integer publisherId) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorId = authorId;
        this.publisherId = publisherId;
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