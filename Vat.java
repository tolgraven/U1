
public interface Vat {
  public abstract double getVAT(); // 6% = 1.06, 25% = 1.25
}

public interface Vat25 extends Vat {
  public double getVAT();
}
public interface Vat6 extends Vat {
  public double getVAT();
}
