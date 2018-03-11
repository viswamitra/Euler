package Utils;

public class Test {

  public static void main(String[] args) {
    Outer outer = new Outer();
    outer.meth();
  }
}

class Outer {
  public void meth() {
    System.out.println("print method");
  }
}
