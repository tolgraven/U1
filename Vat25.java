
public interface Vat25 extends Vat {
  default double getVAT() {
    return 1.25;
  }
}
