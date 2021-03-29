
public abstract class Recording extends Item implements Vat25 {
    protected int year;
    protected String artist;
    protected double price;
    private   String type;
    protected int condition;

  public Recording(String name, String artist, int year, int condition, double price, String type) {
    super(name);
    this.artist = artist;
    this.year = year;
    this.condition = condition;
    this.price = price;
    this.type = type;
  }
    
    public String toString() {
	  return "name=" + name + "," + "artist=" + artist + "," + "year=" + year + "," +
  "type=" + type + "," + + "condition=" + condition + "," + "original price=" + price + "," + "price=" + getPrice() + "," + "price+vat=" + price * getVat(); }
  

  public double getVAT() { return 1.25; }
}
