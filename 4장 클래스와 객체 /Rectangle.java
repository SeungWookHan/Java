import java.util.Scanner;

public class Rectangle {
    int width;
    int height;

    public int getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        System.out.println("2014184038 한승욱");
        Rectangle rect = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        int is_convert = 0;

        System.out.print("정사각형으로 변환하시겠습니까?>>1:네, 2:아니오");
        is_convert = scanner.nextInt();
        if (is_convert == 1) {
            System.out.print("숫자 한개만 입력하시오>>");
            rect.width = scanner.nextInt();
            rect.height = rect.width;
        } else if (is_convert == 2) {
            System.out.print("너비와 높이를 입력하시오>>");
            rect.width = scanner.nextInt();
            rect.height = scanner.nextInt();
        }

        System.out.println("사각형의 면적은 " + rect.getArea());

        scanner.close();
    }
}
