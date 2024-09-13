package java8.StreamAPIs.StreamOperationsExamples.MapOperations1;

import java.util.Arrays;
import java.util.List;
/*

public class StreamExample3
{
    public boolean isPrime ( int number)
        {
            if (number <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
        public void PrintPrime ()
        {
            List<Integer> list = Arrays.asList(1, 23, 66, 8, 3, 2, 4, 6, 8, 7, 9);
            boolean containsPrime = list.stream().anyMatch(this::isPrime);
            System.out.println("List contains a prime number: " + containsPrime);
        }
    public static void main(String[] args) {
        StreamExample3 s=new StreamExample3();
        s.PrintPrime();
    }
}
*/

public class StreamExample3 {
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    private void printPrime() {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 11, 12, 13, 14, 15);
        boolean containsPrime = numbers.stream()
                .anyMatch(this::isPrime);
        System.out.println("List contains a prime number: " + containsPrime);

    }

    public static void main(String[] args) {
            StreamExample3 s=new StreamExample3();
            s.printPrime();
        }
    }