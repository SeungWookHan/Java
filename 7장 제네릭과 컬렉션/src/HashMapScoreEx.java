import java.util.*;

public class HashMapScoreEx {
    public static void main(String[] args) {
        System.out.println("2014184038 한승욱");
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> javaScore = new HashMap<String, Integer>();
        int i = 1;
        while(true){
            if (i == 6)
                break;
            System.out.print("학생명을 입력하시오: ");
            String name = scanner.next();
            if(javaScore.get(name) == null){
                System.out.print("없는 이름이네요 점수를 입력하시오: ");
                int score = scanner.nextInt();
                javaScore.put(name, score);
                i ++;
            }
            else {
                System.out.println("있는 이름이네요. 다시 처음으로 돌아갑니다.: ");
            }
        }
/*
        javaScore.put("김성동", 97);
        javaScore.put("황기태", 88);
        javaScore.put("김남윤", 98);
        javaScore.put("이재문", 70);
        javaScore.put("한원선", 99);
*/

        System.out.println("HashMap의 요소 개수 :"
                + javaScore.size());

        Set<String> keys = javaScore.keySet();

        Iterator<String> it = keys.iterator();
        while(it.hasNext()) {
            String name = it.next();
            int score = javaScore.get(name);
            System.out.println(name + " : " + score);
        }
    }
}
