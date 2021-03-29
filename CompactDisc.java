
public class CompactDisc extends Recording {

  public CompactDisc(String name, String artist, int year, int condition, double price) {
    super(name, artist, year, condition, price, "CD");
  }

  public double getPrice() {
    double price = this.price * (condition / 10);
    return price >= 10? price: 10;
  }
}

