import java.util.Vector;
import java.util.Scanner;

public class VectorEx {
    public static void main(String[] args) {
        System.out.println("2014184038 한승욱");
        Vector<Integer> v = new Vector<Integer>(3);
        Scanner input = new Scanner(System.in);
        System.out.println("벡터의 현재 용량 : " + v.capacity());
        for(int i=1; i<=4; i++){
            System.out.print("정수 입력: ");
            if (i == 4){
                v.add(2, input.nextInt());
            }
            else
                v.add(input.nextInt());
        }

        System.out.println("벡터 내의 요소 객체 수 : " + v.size());
        System.out.println("벡터의 현재 용량 : " + v.capacity());

        for(int i=0; i<v.size(); i++) {
            int n = v.get(i);
            System.out.println(n);
        }

        int sum = 0;
        for(int i=0; i<v.size(); i++) {
            int n = v.elementAt(i);
            sum += n;
        }
        System.out.println("벡터에 있는 정수 합 : " + sum);
    }
}
