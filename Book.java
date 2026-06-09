//Eduardo
//6.9.26
//Book class for my Book objects


public class Book {

    //Private fields (3 data variables, 2+ types)
    private String  title;    // reference type  (String)
    private int     pages;    // primitive type  (int)
    private boolean inPrint;  // primitive type  (boolean)

    //No-arg (default) constructor
    public Book() {
        title   = "Unknown Title";
        pages   = 0;
        inPrint = false;
    }

    //Parameterized constructor
    public Book(String title, int pages, boolean inPrint) {
        this.title   = title;
        this.pages   = pages;
        this.inPrint = inPrint;
    }

    //toString
    @Override
    public String toString() {
        return "Book{title='" + title + "', pages=" + pages + ", inPrint=" + inPrint + "}";
    }

    //Getters
    public String  getTitle()   { return title; }
    public int     getPages()   { return pages; }
    public boolean isInPrint()  { return inPrint; }

    //Setters
    public void setTitle(String title)     { this.title   = title; }
    public void setInPrint(boolean inPrint){ this.inPrint = inPrint; }

    public void setPages(int pages) {
        // Guard: page count must be positive
        if (pages > 0) this.pages = pages;
    }
}