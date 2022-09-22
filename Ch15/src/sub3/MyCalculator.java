package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class MyCalculator extends JFrame {

	private JPanel contentPane;
	private JTextField txtdisp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyCalculator frame = new MyCalculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyCalculator() {
		StringBuilder sb = new StringBuilder();
		
		setTitle("MyCalculator v1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 398, 578);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtdisp = new JTextField();
		txtdisp.setEditable(false);
		txtdisp.setFont(new Font("굴림", Font.BOLD, 22));
		txtdisp.setHorizontalAlignment(SwingConstants.RIGHT);
		txtdisp.setText("0");
		txtdisp.setBounds(12, 10, 356, 57);
		contentPane.add(txtdisp);
		txtdisp.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(12, 179, 80, 80);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(104, 179, 80, 80);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(196, 179, 80, 80);
		contentPane.add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(12, 269, 80, 80);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(104, 269, 80, 80);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(196, 269, 80, 80);
		contentPane.add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(12, 359, 80, 80);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(104, 359, 80, 80);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(196, 359, 80, 80);
		contentPane.add(btn3);
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(12, 449, 172, 80);
		contentPane.add(btn0);
		
		JButton btnpuls = new JButton("+");
		btnpuls.setBounds(288, 179, 80, 170);
		contentPane.add(btnpuls);
		
		JButton btnminus = new JButton("-");
		btnminus.setBounds(288, 89, 80, 80);
		contentPane.add(btnminus);
		
		JButton btnmulti = new JButton("*");
		btnmulti.setBounds(196, 89, 80, 80);
		contentPane.add(btnmulti);
		
		JButton btndiv = new JButton("/");
		btndiv.setBounds(104, 89, 80, 80);
		contentPane.add(btndiv);
		
		JButton btncancle = new JButton("C");
		btncancle.setBounds(12, 89, 80, 80);
		contentPane.add(btncancle);
		
		JButton btndec = new JButton(".");
		btndec.setBounds(196, 449, 80, 80);
		contentPane.add(btndec);
		
		JButton btnEq = new JButton("=");
		btnEq.setBounds(288, 359, 80, 170);
		contentPane.add(btnEq);
	}

}
