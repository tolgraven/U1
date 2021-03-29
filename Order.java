

public class Order extends Item {
  private static long counter = 0;
  private final long orderNumber;
  private final List<Item> items;

  public Order(Item... items) {
    this.orderNumber = ++counter;
    this.items = new ArrayList<Item>(items);
  }

  public double getTotalValue() {
    double result = 0;
    for(Item item: items) {
      result += item.getPrice();
    }
    return result;
  }
  public double getTotalValuePlusVAT() {
    double result = 0;
    for(Item item: items) {
      result += item.getPricePlusVAT();
    }
    return result;
  }
  public String printReceipt() {
    String result = "Receipt for order #" + counter + "\n-----------\n";
    for(Item item: items) {
      result += "* " + this.getClass.getSimpleName() + "{ " + item +" }\n";
    }
    return result;
  }
  
}
