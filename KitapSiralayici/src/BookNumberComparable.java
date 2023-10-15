import java.util.Comparator;
public class BookNumberComparable implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        //SAYFA SAYILARI KARŞILAŞTIRILARAK KÜÇÜK OLANA GÖRE SIRALANMASI SAĞLANIR.
        return o1.getNumberPages()-o2.getNumberPages();
    }
}
