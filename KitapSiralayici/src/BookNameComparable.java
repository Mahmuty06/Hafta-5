import java.util.Comparator;

public class BookNameComparable implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        //KİTAP İSİMLERİ KARŞILAŞTIRILARAK ALFABETİK SIRALAMAYA GÖRE UYGULANIR.
        return o1.getBookName().compareTo(o2.getBookName()) ;
    }
}

