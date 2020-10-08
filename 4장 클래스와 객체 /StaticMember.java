import java.util.Scanner;

class CurrencyConverter {
    private static double rate;

    public static double toDollar(double won) {
        return won / rate;
    }

    public static double toKWR(double dollar) {
        return dollar * rate;
    }

    public static void setRate(double r) {
        rate = r;
    }

}

public class StaticMember {
    public static void main(String[] args) {
        System.out.println("2014184038 한승욱");
        Scanner scanner = new Scanner(System.in);
        System.out.print("환율(1달러)>> ");
        double rate = scanner.nextDouble();
        int is_currency = 0;
        int dollar, won;
        CurrencyConverter.setRate(rate);
        System.out.print("달러->한화 변환: 1, 한화->달러 변환: 2>> ");
        is_currency = scanner.nextInt();
        if (is_currency == 1) {
            System.out.print("금액 입력(달러) >>");
            dollar = scanner.nextInt();
            System.out.println(dollar + "를 한화로 변환하면" + CurrencyConverter.toKWR(dollar));
        } else if (is_currency == 2) {
            System.out.print("금액 입력(한화) >>");
            won = scanner.nextInt();
            System.out.println(won + "를 달러로 변환하면" + CurrencyConverter.toDollar(won));
        }

        scanner.close();

    }
}
