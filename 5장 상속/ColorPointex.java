import java.util.Scanner;

class Point {
    private int x, y;

    public Point() {
        this.x = this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void showPoint() {
        System.out.println("좌표: " + "(" + x + "," + y + ")");
    }
}

class ColorPoint extends Point {
    private String color;

    public ColorPoint() {
        super();
    }

    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void showColorPoint() {
        System.out.print("색:" + color);
        showPoint();
    }
}

public class ColorPointex {
    public static void main(String[] args) {
        System.out.println("2014184038 한승욱");
        Scanner input = new Scanner(System.in);
        Point p = new Point();
        System.out.print("(Point)포인트 x, y를 입력하시오>>");
        int input_a = input.nextInt();
        int input_b = input.nextInt();
        p.set(input_a, input_b);
        p.showPoint();

        ColorPoint cp = new ColorPoint();
        System.out.print("(ColorPoint)포인트 x, y를 입력하시오>>");
        input_a = input.nextInt();
        input_b = input.nextInt();
        cp.set(input_a, input_b);
        System.out.print("(ColorPoint)색상을 입력하시오>>");
        String color = input.next();
        cp.setColor(color);
        cp.showColorPoint();
        input.close();
    }
}