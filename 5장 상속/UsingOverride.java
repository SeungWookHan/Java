import java.util.Scanner;

public class UsingOverride {
    public static void main(String[] args) {
        int count = 0;
        Shape start = null, last = null, obj = null;
        Scanner input = new Scanner(System.in);
        System.out.println("2014184038 한승욱");
        // start = new Line();
        // last = start;
        // obj = new Rect();
        // last.next = obj;
        // last = obj;
        // obj = new Line();
        // last.next = obj;
        // last = obj;
        // obj = new Circle();
        // last.next = obj;

        // Shape p = start; p != null
        while (count < 4) {
            System.out.print("1. Line  2. Circle  3. Rect>>");
            int input_num = input.nextInt();
            if (input_num == 1) {
                // System.out.println("pass");
                if (count == 0) {
                    start = new Line();
                    last = start;
                } else {
                    obj = new Line();
                    last.next = obj;
                    last = obj;
                }
                count++;
            } else if (input_num == 2) {
                // System.out.println("pass");
                if (count == 0) {
                    start = new Circle();
                    last = start;
                } else {
                    obj = new Circle();
                    last.next = obj;
                    last = obj;
                }
                count++;
            } else if (input_num == 3) {
                // System.out.println("pass");
                if (count == 0) {
                    start = new Rect();
                    last = start;
                } else {
                    obj = new Rect();
                    last.next = obj;
                    last = obj;
                }
                count++;
            } else {
                System.out.println("1 ~ 3 범위만 입력하시오.");
                continue;
            }
        }
        Shape p = start;
        while (p != null) {
            p.draw();
            p = p.next;
        }
        input.close();
    }

}
