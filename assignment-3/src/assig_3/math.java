package assig_3;

class Math {

    void printTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    long factorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    boolean isPrime(int num) {
        if (num <= 1) return false;
        int i = 2;
        while (i <= num / 2) {
            if (num % i == 0) return false;
            i++;
        }
        return true;
    }

    void fibonacci(int term) {
        int first = 0, second = 1;
        System.out.print("Fibonacci: ");
        for (int i = 1; i <= term; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
}
