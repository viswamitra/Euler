package Utils;

/**
 * User: abhiramk
 * Date: 17/09/13
 * Time: 11:31 PM
 * This file is the one this project deserves, but not the one it needs
 *
 * /
 **/

interface A {
    public void methA();
        }

interface B {
    public void methB();
}


public class InfTest implements A, B{

    @Override
    public void methA() {
        System.out.println("calling method");
    }

    @Override
    public void methB() {
        System.out.println("calling method B");
    }





    public static void main(String[] args) {
        InfTest in = new InfTest();
        in.methA();
        in.methB();

    }
}
