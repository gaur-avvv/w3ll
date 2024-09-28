public class enumTest {
    public static void main(String[] args) {
        System.out.println("All books:");
        for (Book book : Book.values()) {
            System.out.println(book);
        }
    }
}

public enum Book{
    JHTP("Java How to Program", "2015"),
    CHTP("C How to Program", "2013"),
    IW3HTP("Internet & World Wide Web How to Program", "2012"),
    CPPHTP("C++ How to Program", "2014"),
    VBHTP("Visual Basic How to Program", "2014"),
    CSHARPHTP("Visual C# How to Program", "2014");

    private String title;
    private String year;

    private Book(String title, String year) {
        this.title = title;
        this.year = year;
    }
}