interface Printable {
    void print();
}

interface Shareable {
    void share();
}



class Document implements Printable, Shareable {
    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    @Override
    public void share() {
        System.out.println("Sharing document...");
    }
}
public class Multiple {
    public static void main(String[] args) {
        Document document = new Document();
        document.print(); // Output: Printing document...
        document.share(); // Output: Sharing document...
    }
}


