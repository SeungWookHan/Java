import javax.swing.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        setTitle("300x300 스윙 프레임 만들기");
        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        System.out.println("2014184038 한승욱");
        MyFrame frame = new MyFrame();
    }
}
