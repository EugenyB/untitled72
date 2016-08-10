package main;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	    new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
////        Stream.generate(() -> scanner.hasNextInt())
//        System.out.println(IntStream.generate(() -> scanner.nextInt()).limit(n).sum());
//        Random r = new Random();
//        System.out.println(IntStream.generate(() -> r.nextInt(100)).limit(10000).average().getAsDouble());
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        int n = scanner.nextInt();
        double h = (b-a)/n;
        System.out.println(IntStream.range(0, n).mapToDouble(i -> a + i * h).map(this::myFun).sum() * h);
    }

    double myFun(double x) {
        return Math.sin(x);
    }
}
