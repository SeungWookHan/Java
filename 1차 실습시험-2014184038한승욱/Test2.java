import java.util.Scanner;
import java.util.StringTokenizer;
class Rect{
	int width, height;
	Rect(int width, int height){
			this.width = width;
			this.height = height;
		}
	
	boolean equals(int height, int width) {
		if (height == width) {
			System.out.println("같은 사각형을 입력했습니다.");
			return true;
		}
		else{
			return false;
		}
	}
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Rect rect[] = new Rect[3];
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<rect.length; i++) {
			System.out.print("사각형의 높이를 입력하시오 (너비X높이)");
			String input = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(input, "X");
			int width = Integer.parseInt(st.nextToken());
			int height = Integer.parseInt(st.nextToken());
			rect[i] = new Rect(width, height);
		}
		
		for(int i=0; i<rect.length; i++) {
			System.out.println(rect[i].width + " " + rect[i].height);
		}
		scanner.close();
	}

}
