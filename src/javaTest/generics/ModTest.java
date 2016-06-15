package javaTest.generics;

/**
 * Created by abhiramk on 11/05/16.
 */
class A {
    int k;

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    static B b;

    static class B {
        int c;
    }

}


public class ModTest {

    public static void main(String[] args) {

    }
}
