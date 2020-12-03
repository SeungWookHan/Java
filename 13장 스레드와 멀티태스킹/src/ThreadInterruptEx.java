import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TimerRunnable2 implements Runnable {
    private JLabel timerLabel;
    private JButton btn;
    private Thread th;

    public TimerRunnable2(JLabel timerLabel, JButton btn, Thread th) {
        this.timerLabel = timerLabel;
        this.btn = btn;
        this.th = th;
    }

    @Override
    public void run() {
        int n=0;
        while(true) {
            timerLabel.setText(Integer.toString(n));
            n++;

            try {
                Thread.sleep(1000);
                if(n>=120){
                    btn.setEnabled(false);
                    th.interrupt();
                }
            }
            catch(InterruptedException e) {
                return;
            }

        }
    }
}
public class ThreadInterruptEx extends JFrame {
    private Thread th;
    public ThreadInterruptEx() {
        setTitle(" hreadInterruptEx 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel timerLabel = new JLabel();
        timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
        JButton btn =new JButton("kill Timer");
        TimerRunnable2 runnable = new TimerRunnable2(timerLabel, btn, th);
        th = new Thread(runnable);
        c.add(timerLabel);

        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                th.interrupt();
                JButton btn = (JButton)e.getSource();
                btn.setEnabled(false);
            }
        });
        c.add(btn);
        setSize(300,170);
        setVisible(true);

        th.start();
    }
    public static void main(String[] args) {
        new ThreadInterruptEx();
    }
}
