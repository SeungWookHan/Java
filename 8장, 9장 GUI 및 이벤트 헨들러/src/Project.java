import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Project extends JFrame {
    public Project(){
        setTitle("2014184038 한승욱");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container con = getContentPane();
        con.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        GridLayout grid = new GridLayout(4, 2);
        grid.setVgap(5);

        panel.setLayout(grid);

        JLabel j1 = new JLabel("이름");
        JTextField j2 = new JTextField("");
        JLabel j3 = new JLabel("학과");
        JTextField j4 = new JTextField("");
        JButton j5 = new JButton("확인");
        JButton j6 = new JButton("취소");

        JButton b1 = new JButton("");
        JButton b2 = new JButton("이름:");
        JButton b3 = new JButton("입력창");
        JButton b4 = new JButton("학과:");
        b2.setOpaque(true);
        b2.setBorderPainted(false);
        b2.setBackground(Color.cyan);
        b3.setOpaque(true);
        b3.setBorderPainted(false);
        b3.setBackground(Color.BLUE);
        b4.setOpaque(true);
        b4.setBorderPainted(false);
        b4.setBackground(Color.PINK);

        panel.add(j1);
        panel.add(j2);
        panel.add(j3);
        panel.add(j4);
        panel.add(j5);
        panel.add(j6);

        con.add(b1, BorderLayout.CENTER);
        con.add(b2, BorderLayout.NORTH);
        con.add(b3, BorderLayout.WEST);
        con.add(b4, BorderLayout.SOUTH);
        con.add(panel, BorderLayout.CENTER);

        j5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b2.setText(j2.getText());
                b4.setText(j4.getText());
            }
        });

        j6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b2.setText("");
                b4.setText("");
            }
        });

        setSize(250,250);
        setVisible(true);
    }
    public static void main(String[] args) {
        System.out.println("2014184038 한승욱");
        new Project();
    }
}
