package TestLeafTest;

public class Fibonacci {
	public void printFibonacci(int n) {
        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }

    public static void main(String[] args) {
        Fibonacci obj = new Fibonacci();
        obj.printFibonacci(10);
    }
}


