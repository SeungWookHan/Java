import java.util.StringTokenizer;
import java.util.Scanner;

public class StringTokenizerEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("날짜를 입력하시오:");
        String s = input.nextLine();
        StringTokenizer st = new StringTokenizer(s, "/");
        int i=1;
        while (st.hasMoreTokens()) {
            System.out.print(st.nextToken());
            if(i==1){
                System.out.print("년 ");
            }
            else if(i==2){
                System.out.print("월 ");
            }
            else{
                System.out.print("일");
            }
            i++;
        }
    }
}
