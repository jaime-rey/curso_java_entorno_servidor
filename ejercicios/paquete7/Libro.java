package ejercicios.paquete7;

public class Libro {
    private String title;
    private String author;
    private int pages;

    public Libro(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public Libro() {
        this("Sin título", "Anónimo", 0);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public static void main(String[] args) {
        Libro libro1 = new Libro("Libro 1", "Autor 1", 150);
        Libro libro2 = new Libro("1984", "George Orwell", 328);
        Libro libro3 = new Libro();

        System.out.println("Libro 1: " + libro1.getTitle() + " - " + libro1.getAuthor() + " - " + libro1.getPages());
        System.out.println("Libro 2: " + libro2.getTitle() + " - " + libro2.getAuthor() + " - " + libro2.getPages());
        System.out.println("Libro 3: " + libro3.getTitle() + " - " + libro3.getAuthor() + " - " + libro3.getPages());
    }
}
