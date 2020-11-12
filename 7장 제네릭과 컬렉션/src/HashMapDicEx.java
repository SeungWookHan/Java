import java.util.*;

public class HashMapDicEx {
    public static void main(String[] args) {
        System.out.println("2014184038 한승욱");
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> dic =
                new HashMap<String, String>();

        int i = 1;
        while(true){
            if (i == 4)
                break;
            System.out.print("입력할 영어 단어를 입력하시오: ");
            String input_eng = scanner.next();
            String isExist = dic.get(input_eng);
            if(isExist == null){
                System.out.print("없는 단어네요 한 단어를 입력하시오: ");
                String input_han = scanner.next();
                dic.put(input_eng, input_han);
                i ++;
            }
            else {
                System.out.println("있는 단어네요. 다시 처음으로 돌아갑니다.: ");
            }
        }

        while(true) {
            System.out.print("찾고 싶은 단어는?");
            String eng = scanner.next();
            if(eng.equals("exit")) {
                System.out.println("종료합니다...");
                break;
            }
            String kor = dic.get(eng);
            if(kor == null)
                System.out.println(eng +
                        "는 없는 단어 입니다.");
            else
                System.out.println(kor);
        }
        scanner.close();
    }
}
