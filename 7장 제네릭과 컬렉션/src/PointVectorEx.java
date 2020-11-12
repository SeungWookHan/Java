import java.util.Vector;
import java.util.Scanner;

class Point {
    private int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
public class PointVectorEx {
    public static void main(String[] args) {
        System.out.println("2014184038 한승욱");
        Vector<Point> v = new Vector<Point>();
        Scanner input = new Scanner(System.in);

        for(int i=1; i<=3; i++){
            System.out.print("두 점 입력: ");
            int x = input.nextInt();
            int y = input.nextInt();
            v.add(new Point(x, y));
        }
//        v.add(new Point(2, 3));
//        v.add(new Point(-5, 20));
//        v.add(new Point(30, -8));

        v.remove(1);

        for(int i=0; i<v.size(); i++) {
            Point p = v.get(i);
            System.out.println("Point" + p);
        }
    }
}
