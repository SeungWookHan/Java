import java.util.Scanner;

public class GenericMethodExample {
    public static <T> GStack<T> reverse(GStack<T> a) {
        GStack<T> s = new GStack<T>();
        while (true) {
            T tmp;
            tmp = a.pop();
            if (tmp==null)
                break;
            else
                s.push(tmp);
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println("2014184038 한승욱");
        Scanner scanner = new Scanner(System.in);
        GStack<Double> gs =
                new GStack<Double>();

        for (int i=0; i<5; i++) {
            System.out.print("숫자를 입력하시오: ");
            double input = scanner.nextDouble();
            gs.push(Double.valueOf(input));
        }
        gs = reverse(gs);
        for (int i=0; i<5; i++) {
            System.out.println(gs.pop());
        }
    }
}
