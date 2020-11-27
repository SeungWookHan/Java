import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KeyCodeEx extends JFrame {
    private JLabel la = new JLabel();
    Container c = getContentPane();

    public KeyCodeEx() {
        setTitle("r: 빨간색, g: 초록색, y: 노란색, b: 파란색, 그 외의 입력: 흰색");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        c.addKeyListener(new MyKeyListener());
        c.add(la);

        setSize(300,150);
        setVisible(true);

        c.setFocusable(true);
        c.requestFocus();
    }
    class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            la.setText("한승욱이" + e.getKeyText(e.getKeyCode()) + "키를 눌렀습니다.");

            if(e.getKeyChar() == 'r')
                c.setBackground(Color.RED);
            else if(e.getKeyChar() == 'g')
                c.setBackground(Color.GREEN);
            else if(e.getKeyChar() == 'y')
                c.setBackground(Color.YELLOW);
            else if(e.getKeyChar() == 'b')
                c.setBackground(Color.BLUE);
            else
                c.setBackground(Color.WHITE);
        }
    }
    public static void main(String [] args) {
        new KeyCodeEx();
    }
}