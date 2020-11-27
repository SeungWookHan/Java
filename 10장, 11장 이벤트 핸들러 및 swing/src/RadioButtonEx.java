import javax.swing.*;
import java.awt.*;

public class RadioButtonEx extends JFrame {
    public RadioButtonEx() {
        setTitle("2014184038 한승욱");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        ImageIcon cherryIcon = new ImageIcon("/Users/Han/programming/java/10장, 11장 이벤트 핸들러 및 swing/src/images/cherry.jpg");
        ImageIcon selectedCherryIcon =
                new ImageIcon("/Users/Han/programming/java/10장, 11장 이벤트 핸들러 및 swing/src/images/selectedCherry.jpg");

        ButtonGroup g = new ButtonGroup();
        JRadioButton apple = new JRadioButton("사과");
        JRadioButton pear = new JRadioButton("배", true);
        JRadioButton cherry = new JRadioButton("체리", cherryIcon);
        cherry.setBorderPainted(true);
        cherry.setSelectedIcon(selectedCherryIcon);

        g.add(apple);
        g.add(pear);
        g.add(cherry);

        c.add(apple);
        c.add(pear);
        c.add(cherry);
        setSize(250,150);
        setVisible(true);
    }
    public static void main(String [] args) {
        new RadioButtonEx();
    }
}
