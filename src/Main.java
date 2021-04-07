import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" mời bạn nhập số a: ");
        double a = scanner.nextDouble();
        System.out.print(" mời bạn nhập số b: ");
        double b = scanner.nextDouble();
        System.out.print(" mời bạn nhập số c: ");
        double c = scanner.nextDouble();
        QuadraticEquation pt = new QuadraticEquation(a,b,c);
        pt.getDiscriminant();
        pt.disPlay();
    }
}
