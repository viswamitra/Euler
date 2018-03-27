package geeksforgeeks.Arrays;

public class Sieve {
  public void sieve(int n) {
    boolean[] prime = new boolean[n+1];
    for(int i =0; i < prime.length; i++) {
      prime[i] = true;
    }

    for(int i = 2; i * i <= n; i++) {
      if(prime[i]) {
        for(int j = i * 2; j <= n; j+= i) {
          prime[j] = false;
        }
      }
    }

    for(int i = 2; i < prime.length; i++) {
      if (prime[i]) {
        System.out.print(i+" ");
      }
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int n = 100;
    new Sieve().sieve(n);
  }
}
