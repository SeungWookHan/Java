import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WinEx extends JFrame{
	WinEx(){
		setTitle("Win Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		GridLayout grid = new GridLayout(4, 2);
		grid.setVgap(5);
		grid.setHgap(5);
		c.setLayout(grid);
		JTextField t1 = new JTextField("");
		JTextField t2 = new JTextField("");
		JTextField t3 = new JTextField("");
		c.add(new JLabel("이름"));
		c.add(t1);
		c.add(new JLabel("학과"));
		c.add(t2);
		c.add(new JLabel("학번"));
		c.add(t3);
		JButton btn1 = new JButton("Reset");
		JButton btn2 = new JButton("Print");
		c.add(btn1);
		c.add(btn2);
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");
				t3.setText("");
			}
		});

		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(t1.getText().equals(""))
					System.out.println("이름: 해당없음");
				else
					System.out.println("이름: " + t1.getText());
				if(t2.getText().equals(""))
					System.out.println("학과: 해당없음");
				else
					System.out.println("학과: " + t2.getText());
				if(t3.getText().equals(""))
					System.out.println("학번: 해당없음");
				else
					System.out.println("학번: " + t3.getText());
			}
		});
		
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new WinEx();
	}

}
