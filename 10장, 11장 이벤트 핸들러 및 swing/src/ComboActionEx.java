import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ComboActionEx extends JFrame {
    private String [] fruits = {"apple", "banana", "kiwi", "mango"};
    private ImageIcon [] images = { new ImageIcon("/Users/Han/programming/java/10장, 11장 이벤트 핸들러 및 swing/src/images/apple.jpg"),
            new ImageIcon("/Users/Han/programming/java/10장, 11장 이벤트 핸들러 및 swing/src/images/banana.jpg"),
            new ImageIcon("/Users/Han/programming/java/10장, 11장 이벤트 핸들러 및 swing/src/images/kiwi.jpg"),
            new ImageIcon("/Users/Han/programming/java/10장, 11장 이벤트 핸들러 및 swing/src/images/mango.jpg")};
    private JLabel imgLabel = new JLabel(images[0]);
    private JComboBox<String> strCombo = new JComboBox<String>(fruits);

    public ComboActionEx() {
        setTitle("2014184038 한승욱 - 콤보박스 활용 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(strCombo);
        c.add(imgLabel);

        strCombo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JComboBox<String> cb = (JComboBox<String>)e.getSource();
                int index = cb.getSelectedIndex();
                imgLabel.setIcon(images[index]);
            }
        });
        setSize(300,250);
        setVisible(true);
    }
    public static void main(String [] args) {
        new ComboActionEx();
    }
}
