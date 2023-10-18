import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SmartPhoneOperation {

    static List<SmartPhone> SmartPhones = new ArrayList<>() ;

       static void eklemeSmartPhone () {
        SmartPhones.add(new SmartPhone( 1 ,"SAMSUNG GALAXY A51  ", 3199.0  ,"Samsung", 128   , 6.5,6,32,
                4000.0,"siyah")) ;
        SmartPhones.add(new SmartPhone( 2 ," iPhone 11 64 GB ", 7379.0  ,"Apple", 64   , 6.1,6,5,
                3046.0,"mavi")) ;
        SmartPhones.add(new SmartPhone( 3 ,"Redmi Note 10 Pro 8GB ", 4012.0  ,"Xiaomi", 128   , 6.5,12,35,
                4000.0,"beyaz")) ;
    }
    public static void SmartPhoneList() {

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.format("| %-2s | %-27s | %-10s | %-10s | %-9s | %-9s | %-9s | %-10s | %-10s | %-7s |\n",
                "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "RAM", "Kamera", "Pil", "Renk");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");

        for (SmartPhone i : SmartPhones) {
            System.out.format("| %-2d | %-27s | %-10s | %-10s | %-9d | %-9.1f | %-9d | %-10d | %-10s | %-7s |\n",
                    i.getSistemNumber(), i.geturunadi(), i.getPrice(), i.getMarkabilgisi(), i.getDepolama(), i.getEkranBoyutu(), i.getRam(),
                    i.getKamera(), i.getpilGucu(), i.getRenk());
        }

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
    }
    public static void addSmartPhone() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Yeni bir smartphone eklemek için aşağıdaki bilgileri girin:");

        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Enter tuşu için tampon temizleme
        if (isIdAlreadyUsed(id)) {
            System.out.println("Bu ID zaten kullanılıyor. Lütfen başka bir ID girin.");
            return;
        }
        System.out.print("Ürün Adı: ");
        String name = scanner.nextLine();

        System.out.print("Fiyat: ");
        double price = scanner.nextDouble();

        System.out.print("Marka: ");
        String brand = scanner.nextLine();

        System.out.print("Depolama: ");
        int storage = scanner.nextInt();

        System.out.print("Ekran: ");
        double screenSize = scanner.nextDouble();

        System.out.print("Ram: ");
        int ram = scanner.nextInt();

        System.out.print("Kamera: ");
        int kamera = scanner.nextInt();


        System.out.print("Pil: ");
        double pilGucu = scanner.nextDouble();

        System.out.print("Renk: ");
        String renk = scanner.nextLine();


        SmartPhone newSmartPhone = new SmartPhone(id, name, price, brand, storage, screenSize, ram,kamera,pilGucu, renk);

        SmartPhones.add(newSmartPhone);

        System.out.println("Yeni smartphone başarıyla eklendi.");
        SmartPhoneList();
    }

    public static void removeSmartPhoneById() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Silmek istediğiniz smartphone ID'sini girin: ");
        int id = scanner.nextInt();

        SmartPhone removedSmartPhone = null;

        for (SmartPhone smartPhone : SmartPhones) {
            if (smartPhone.getSistemNumber() == id) {
                removedSmartPhone = smartPhone;
                break;
            }
        }

        if (removedSmartPhone != null) {
            SmartPhones.remove(removedSmartPhone);
            System.out.println("ID " + id + " olan smartphone başarıyla silindi.");
        } else {
            System.out.println("ID " + id + " ile eşleşen bir smartphone bulunamadı.");
        }


        SmartPhoneList();
    }

    public static void filterSmartPhone() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Filtreleme seçeneğini seçin:");
        System.out.println("1 - ID'ye Göre Filtrele");
        System.out.println("2 - Markaya Göre Filtrele");
        System.out.print("Seçeneği girin (1 veya 2): ");

        int option = scanner.nextInt();
        scanner.nextLine();

        switch (option) {
            case 1:
                filterSmartPhoneById();
                break;
            case 2:

                filterSmartPhonesByBrand();
                break;
            default:
                System.out.println("Geçersiz seçenek. Lütfen 1 veya 2 girin.");
                break;
        }
    }

    public static void filterSmartPhoneById() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Filtrelemek istediğiniz SmartPhone ID'sini girin: ");
        int id = scanner.nextInt();
        boolean found = false;


        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.format("| %-2s | %-27s | %-10s | %-10s | %-9s | %-9s | %-9s | %-10s | %-10s | %-7s |\n",
                "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "RAM", "Kamera", "Pil", "Renk");;
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");

        for (SmartPhone smartPhone : SmartPhones) {
            if (smartPhone.getSistemNumber() == id) {
                found = true;
                // ID'ye göre eşleşen SmartPhone'u tablo şeklinde ekrana bastır
                System.out.format("| %-2s | %-27s | %-10s | %-10s | %-9d | %-9.1f | %-9d | %-10s | %-10s | %-7s |\n",
                        smartPhone.getSistemNumber(), smartPhone.geturunadi(), smartPhone.getPrice(), smartPhone.getMarkabilgisi(),
                        smartPhone.getDepolama(), smartPhone.getEkranBoyutu(), smartPhone.getRam(),
                        smartPhone.getKamera(), smartPhone.getpilGucu(), smartPhone.getRenk());
                break;
            }
        }

        if (!found) {
            System.out.println("ID " + id + " ile eşleşen SmartPhone bulunamadı.");
        }

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
    }


    public static List<SmartPhone> filterSmartPhonesByBrand() {
        List<SmartPhone> filteredPhones = new ArrayList<>();

        // Kullanıcıdan marka adını al
        Scanner scanner = new Scanner(System.in);
        System.out.print("Filtrelemek istediğiniz Marka'yı girin: ");
        String brandToFilter = scanner.nextLine();

        for (SmartPhone phone : SmartPhones) {
            if (phone.getMarkabilgisi().equalsIgnoreCase(brandToFilter)) {
                filteredPhones.add(phone);
            }
        }


        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.format("| %-2s | %-27s | %-10s | %-10s | %-9s | %-9s | %-9s | %-10s | %-10s | %-7s |\n",
                "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "RAM", "Kamera", "Pil", "Renk");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");

        for (SmartPhone i : filteredPhones) {
            System.out.format("| %-2d | %-27s | %-10s | %-10s | %-9d | %-9.1f | %-9d | %-10d | %-10s | %-7s |\n",
                    i.getSistemNumber(), i.geturunadi(), i.getPrice(), i.getMarkabilgisi(), i.getDepolama(), i.getEkranBoyutu(), i.getRam(),
                    i.getKamera(), i.getpilGucu(), i.getRenk());
        }

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");

        return filteredPhones;
    }

    public static boolean isIdAlreadyUsed(int id) {
        for (SmartPhone smartphone : SmartPhones) {
            if (smartphone.getSistemNumber() == id) {
                return true;
            }
        }
        return false;
    }

}