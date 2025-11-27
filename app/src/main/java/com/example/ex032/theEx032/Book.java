package com.example.ex032.theEx032;

public class Book extends LibraryItem implements Searchable, Displayable {
    private int numOfPages;
    private String author;

    public Book(String title, int yearPublished, int numOfPages, String author) {
        super(title, yearPublished);
        this.numOfPages = numOfPages;
        this.author = author;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void displayFullDetails() {
        System.out.println("The book details:" + "\n" + super.toString() + "numOfPages: " + numOfPages + "\n" + "author" + author);
    }

    @Override
    public double calculateLateFee(int daysPastDue) {
        return 0.5 * daysPastDue;
    }

    @Override
    public boolean matches(String query) {
        return query.equals(author) || query.equals(getTitle());
    }
}
