import java.util.*;

public class ArrayListEx {
    public static void main(String[] args) {
        System.out.println("2014184038 한승욱");
        ArrayList<String> a = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<4; i++) {
            System.out.print("이름을 입력하세요>>");
            String s = scanner.next();
            a.add(s);
        }

        for(int i=0; i<a.size(); i++) {
            String name = a.get(i);
            System.out.print(name + " ");
        }
        int longestIndex = 0;
        int shortestIndex = 0;
        for(int i=1; i<a.size(); i++) {
            if(a.get(longestIndex).length() < a.get(i).length())
                longestIndex = i;
        }
        for(int i=1; i<a.size(); i++) {
            if(a.get(shortestIndex).length() > a.get(i).length())
                shortestIndex = i;
        }
        System.out.println("\n가장 긴 이름은 : " +
                a.get(longestIndex) + " " + (longestIndex+1) + "번째 입력된 것입니다.");
        System.out.println("\n가장 짧은 이름은 : " +
                a.get(shortestIndex) + " " + (shortestIndex+1) + "번째 입력된 것입니다.");
        scanner.close();
    }
}
