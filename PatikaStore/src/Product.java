public abstract class  Product {

//NOTEBOOK VE TELEFIN ORTAK ÖZELLİKLERİ
  private int sistemNumber ;
  private String urunadi ;
  private double Price  ;
  private  String markabilgisi ;
  private int depolama ;
  private double ekranBoyutu ;
  private int ram  ;

  public Product (int sistemNumber,String urunadi,double Price,String markabilgisi  ,int depolama,double ekranBoyutu,int ram) {
    this.sistemNumber  = sistemNumber ;
    this.Price = Price ;
    this.depolama = depolama ;
    this.urunadi = urunadi ;
    this.markabilgisi = markabilgisi ;
    this.ram = ram ;
    this.ekranBoyutu = ekranBoyutu ;

  }

  public int getSistemNumber() {
    return sistemNumber;
  }

  public void setSistemNumber(int sistemNumber) {
    this.sistemNumber = sistemNumber;
  }

  public double getPrice() {
    return Price;
  }

  public void setPrice(int price) {
    Price = price;
  }

  public int getDepolama() {
    return depolama;
  }

  public void setDepolama(int depolama) {
    this.depolama = depolama;
  }


  public String geturunadi() {
    return urunadi;
  }

  public void seturunadi(String urunadi) {
    this.urunadi = urunadi;
  }

  public String getMarkabilgisi() {
    return markabilgisi;
  }

  public void setMarkabilgisi(String markabilgisi) {
    this.markabilgisi = markabilgisi;
  }

  public int getRam() {
    return ram;
  }

  public void setRam(int ram) {
    this.ram = ram;
  }

  public double getEkranBoyutu() {
    return ekranBoyutu;
  }

  public void setEkranBoyutu(double ekranBoyutu) {
    this.ekranBoyutu = ekranBoyutu;
  }
}
