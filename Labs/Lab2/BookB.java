package Labs.Lab2;

public class BookB {
    // Variables
    private String title, author;
   
    // Constructeurs
    public BookB(String a, String t) {
      author = a;
      title = t;
    }
  
    // Accesseurs
    public String getAuthor() {
      return author;
    }
    
    public String getTitle() {
      return title;
    }
  
    // Modificateurs
    public void setAuthor(String sA) {
      author = sA;
    }
  
    public void setTitle(String sT) {
      title = sT;
    }

    public void affiche(){
        System.out.println("Book[Title: " + title + ", Author: " + author + "]");
    }
  
    public String toString() {
      return "Book[ Title: " + title + ", Author: " + author + "]";
    }
}
  
