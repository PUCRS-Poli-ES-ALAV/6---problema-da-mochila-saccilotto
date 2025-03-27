public class ExJavex {

    private int arrayIt[] = new int[100];

    private void setarrayIt(int n) {
        arrayIt = new int[n];
    }   

    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }

    public int fiboRec(int n) {
        if (n <= 1) {
            return n;
        } else {
            int a = fiboRec(n - 1);
            int b = fiboRec(n - 2);
            return a + b;
        }
    }

    public int fibo(int n) {
        setarrayIt(n);
        arrayIt[0] = 0;
        arrayIt[1] = 1;

        for (int i = 2; i <= n; i++) {
            arrayIt[i] = arrayIt[i - 1] + arrayIt[i - 2];
        }

        return arrayIt[n];
    }

    public int memoizedFibo(int[] arrayMemo, int n) {
        for (int i = 0; i < n; i++) {
            arrayMemo[i] = -1;
        }

        return lookupFibo(arrayMemo, n);
    }

    public int lookupFibo(int[] arrayMemo, int n) {
        if (arrayMemo[n] >= 0) {
            return arrayMemo[n];
        }

        if (n <= 1) {
            arrayMemo[n] = n;
        } else {
            arrayMemo[n] = lookupFibo(arrayMemo, n - 1) + lookupFibo(arrayMemo, n - 2);
        }
        
        return arrayMemo[n];
    }
}