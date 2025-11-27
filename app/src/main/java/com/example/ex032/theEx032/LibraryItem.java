package com.example.ex032.theEx032;

import java.util.UUID;

public abstract class LibraryItem {
    private final UUID itemId;
    private String title;
    private int yearPublished;
    private boolean isBorrowed;

    public LibraryItem(String title, int yearPublished) {
        this.title = title;
        this.yearPublished = yearPublished;
        itemId = UUID.randomUUID();
        isBorrowed = false;
    }

    public UUID getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public void borrow()
    {
        if (!isBorrowed) isBorrowed = true;
    }
    public void returnItem()
    {
        isBorrowed = false;
    }

    public abstract double calculateLateFee(int daysPastDue);

    @Override
    public String toString() {
        return  "itemId=" + itemId + "\n" +
                "title='" + title + "\n" +
                "yearPublished=" + yearPublished + "\n" +
                "isBorrowed=" + isBorrowed + "\n";
    }
}
