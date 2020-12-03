import java.util.Scanner;

public class calculateRectangleArea {
    public static void main(String[] args) {
        System.out.println("  +--a---+");
        System.out.println("  |      |");
        System.out.println(" b|      |b");
        System.out.println("  |      |");
        System.out.println("  +------+");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of 'a':");
        int távolságA = scan.nextInt();
        System.out.println("Enter the length of 'b':");
        int távolságB = scan.nextInt();
        System.out.println("Area: " + távolságA * távolságB + " m^2");
        int sum = távolságA + távolságB;
        System.out.println("Perimeter: " + sum + " m");
    }
}