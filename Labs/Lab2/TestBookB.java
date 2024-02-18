package Labs.Lab2;

public class TestBookB {
    public static void main(String[] args) {
        System.out.println();
        BookB book1 = new BookB("E.B.Koffman", "Abstraction and Design Using Java");
        BookB book2 = new BookB("Duane A.Bailey", "Data Structures in Java for Principled Programmer");
        book2.affiche();
        System.out.println();
        System.out.println(book1);
        System.out.println();
    }
}
