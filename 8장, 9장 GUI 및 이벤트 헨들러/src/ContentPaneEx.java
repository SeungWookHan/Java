import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
    public ContentPaneEx() {
        setTitle("2014184038 한승욱 ContentPane과 JFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setBackground(Color.BLUE);
        contentPane.setLayout(new FlowLayout());

        contentPane.add(new JButton("컴퓨터공학과"));
        contentPane.add(new JButton("2014184038"));
        contentPane.add(new JButton("한승욱"));

        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        System.out.println("2014184038 한승욱");
        new ContentPaneEx();
    }
}
