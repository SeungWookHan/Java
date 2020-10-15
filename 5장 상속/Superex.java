import java.util.Scanner;

public class Superex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("2014184038 한승욱");
        System.out.print("(ColorPoint)포인트 x, y를 입력하시오>>");
        int input_a = input.nextInt();
        int input_b = input.nextInt();
        System.out.print("(ColorPoint)색상을 입력하시오>>");
        String color = input.next();
        ColorPoint cp = new ColorPoint(input_a, input_b, color);
        cp.showColorPoint();
        input.close();
    }
}
