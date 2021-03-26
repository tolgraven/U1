
public class Book extends Item implements Vat6 {
  private final String author;
  private final double price;
  private final boolean bound;

  public Book(String name, String author, double price, boolean bound) {
    super(name);
    this.author = author;
    this.price = price;
    this.bound = bound;
  }

  public double getPrice() { return this.price * (bound? 1.25: 1.0); }
  public String toString() {
    return author + " - " + name + "a " + price + " kr" + 
          (bound? "inbunden": ""); }
  
  public double getVAT() { return 1.06; }
}
///hhh