

public class Order extends Item {
  private static long counter;
  private final long orderNumber;
  private final List<Item> items;

  public Order(Item...) {
    // TODO copy items to this.items
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
