import java.util.Date;

public class LongPlay extends Recording {

  public LongPlay(String name, String artist, int year, int condition, double price) {
    super(name, artist, year, condition, price, "LP");
  }

  public double getPrice() {
    double price = this.price * (condition / 10);
    Date date = new Date();
    int age = date.getYear() - this.year;
    price += age * 5;
    
    return price >= 10? price: 10;
  }
}
