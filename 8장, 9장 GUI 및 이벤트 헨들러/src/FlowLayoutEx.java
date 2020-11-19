import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class FlowLayoutEx extends JFrame {
    public FlowLayoutEx(int hor, int ver) {
        setTitle("2014184038 한승욱 FlowLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.setLayout(new FlowLayout(FlowLayout.LEFT, hor, ver));
        c.add(new JButton("add"));
        c.add(new JButton("sub"));
        c.add(new JButton("mul"));
        c.add(new JButton("div"));
        c.add(new JButton("Calculate"));

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        System.out.println("2014184038 한승욱");
        Scanner scanner = new Scanner(System.in);
        System.out.print("수평, 수직을 입력하시오: ");
        int hor = scanner.nextInt();
        int ver = scanner.nextInt();
        new FlowLayoutEx(hor, ver);
    }
}
