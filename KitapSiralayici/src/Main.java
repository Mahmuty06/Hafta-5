
import  java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        System.out.println(" İSMİNE GÖRE SIRALA ");
        System.out.println("-----------------------");

        TreeSet<Book> books = new TreeSet<>(new BookNameComparable());
        // TREESET OLUŞTURULARAK KİTAP SINIFINDAN YENİ KİTAP NESNELERİ EKLENDİ

        books.add(new Book("MAHMUTUN İLKOKUL HAYATI", 100, "MAHMUT YILDIRIM", 2030));
        books.add(new Book("MAHMUTUN ORTAOKUL HAYATI", 150, "MAHMUT YILDIRIM", 2035));
        books.add(new Book("MAHMUTUN LİSE HAYATI", 500, "MAHMUT YILDIRIM", 2040));
        books.add(new Book("MAHMUTUN ÜNİVERSİTE HAYATI", 750, "MAHMUT YILDIRIM", 2045));
        books.add(new Book("MAHMUTUN ÇALIŞMA HAYATI", 1000, "MAHMUT YILDIRIM", 2050));

        //FOR DÖNGÜSÜ İLE KİTAP İSMİNE GÖRE EKRANA YAZDIRILDI
        for (Book book : books) {
            System.out.println(book.getBookName());

        }



        System.out.println("*************************");
        System.out.println("SAYFA SAYISINA GÖRE SIRALA ");
        System.out.println("-----------------------");

        TreeSet<Book> books1 = new TreeSet<>(new BookNumberComparable());
        // TREESET OLUŞTURULARAK KİTAP SINIFINDAN YENİ KİTAP NESNELERİ EKLENDİ

        books1.add(new Book("MAHMUTUN İLKOKUL HAYATI", 100, "MAHMUT YILDIRIM", 2030));
        books1.add(new Book("MAHMUTUN ORTAOKUL HAYATI", 150, "MAHMUT YILDIRIM", 2035));
        books1.add(new Book("MAHMUTUN LİSE HAYATI", 500, "MAHMUT YILDIRIM", 2040));
        books1.add(new Book("MAHMUTUN ÜNİVERSİTE HAYATI", 750, "MAHMUT YILDIRIM", 2045));
        books1.add(new Book("MAHMUTUN ÇALIŞMA HAYATI", 1000, "MAHMUT YILDIRIM", 2045));

        for (Book book : books1) {
            //FOR DÖNGÜSÜ İLE SAYFA SAYISINA  GÖRE EKRANA YAZDIRILDI
            System.out.println(book.getBookName());

            }
    }

}
