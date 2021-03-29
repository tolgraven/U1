
public abstract class Item implements Vat {
  protected final String name;

  protected Item(String name) {
    this.name = name;
  }

  public String getName() { return this.name; }

  public abstract double getPrice();
  public final double getPricePlusVAT() {
    return getPrice() * getVAT();
  }

  public abstract double getVAT(); // XXX this needed?

}
