package com.example.ex032.theEx032;

public class Magazine extends LibraryItem implements Searchable, Displayable {
    private String editorName;
    private int issueNumber;

    public Magazine(String title, int yearPublished, String editorName, int issueNumber) {
        super(title, yearPublished);
        this.editorName = editorName;
        this.issueNumber = issueNumber;
    }

    public String getEditorName() {
        return editorName;
    }

    public void setEditorName(String editorName) {
        this.editorName = editorName;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayFullDetails() {
        System.out.println("The magazine details:" + "\n" + super.toString() + "editorName: " + editorName + "\n" + "issueNumber: " + issueNumber);
    }

    @Override
    public double calculateLateFee(int daysPastDue) {
        return 2.0 * daysPastDue;
    }

    @Override
    public boolean matches(String query) {
        return query.equals(editorName) || query.equals(getTitle());
    }
}
