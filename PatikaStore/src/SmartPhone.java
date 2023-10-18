public class SmartPhone extends Product {

    private int kamera ;
    private double pilGucu ;
    private String renk ;

public SmartPhone(int sistemNumber,String urunadi,double Price,String markabilgisi  ,int depolama,double ekranBoyutu,int ram, int kamera,double pilGucu,String renk) {
    super(sistemNumber,urunadi,Price,markabilgisi,depolama,ekranBoyutu,ram);

}

    public int getKamera() {
        return kamera;
    }

    public void setKamera(int kamera) {
        this.kamera = kamera;
    }

    public double getpilGucu() {
        return pilGucu;
    }

    public void setPilGucu(double pilGucu) {
        this.pilGucu = pilGucu;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }
}
