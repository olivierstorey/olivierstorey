package Labs.Lab2;

public class BookA {
    // Variables
    private String title, author;
   
    // Constructeurs
    public BookA(String a, String t) {
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
  
    public void affiche() {
      System.out.print("Book[ Title: "+ title + ", Author: "+ author + " ]");
    }
  }
  