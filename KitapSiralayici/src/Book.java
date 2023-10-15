public class Book {
// OLUŞTURULAN SINIFIN  DEĞİŞKENLERİ
    private String bookName ;
    private int numberPages  ;
    private String writer ;
    private int date ;
//MAİN SINIFINDAN GELEN DEĞERLER BOOK SINIFININ  DEĞİŞKENLERİNE  ATANDI
    public Book(String bookName, int numberPages, String writer, int date) {
        this.bookName = bookName;
        this.numberPages = numberPages;
        this.writer = writer;
        this.date = date;
    }
//GET SET METOTLARI YAZILDI
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

}
