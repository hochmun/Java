package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class ComponentsTest extends JFrame {

	private JPanel contentPane;
	private JTextField txtf1;
	private JTextField txtf2;
	private JTextField txtf3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentsTest frame = new ComponentsTest();
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
	public ComponentsTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 429, 481);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("컴포넌트 실습하기");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel.setBounds(12, 10, 137, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Button 컴포넌트");
		lblNewLabel_1.setBounds(12, 51, 93, 15);
		contentPane.add(lblNewLabel_1);
		
		JButton btn1 = new JButton("버튼 1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btn1.setBounds(8, 76, 97, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("버튼 2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼2 클릭...");
			}
		});
		btn2.setBounds(106, 76, 97, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("버튼 3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼3 클릭...", "일반대화상자", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btn3.setBounds(205, 76, 97, 23);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("버튼 4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer = JOptionPane.showConfirmDialog(null, "버튼4 클릭...", "확인대화상자", JOptionPane.YES_NO_OPTION);
				
				if(answer == JOptionPane.YES_OPTION) {
					System.out.println("YES 클릭...");
				} else {
					System.out.println("NO 클릭...");
				}
				
			}
		});
		btn4.setBounds(302, 76, 97, 23);
		contentPane.add(btn4);
		
		JLabel lblNewLabel_2 = new JLabel("TextField 컴포넌트");
		lblNewLabel_2.setBounds(12, 109, 111, 15);
		contentPane.add(lblNewLabel_2);
		
		txtf1 = new JTextField();
		txtf1.setBounds(12, 134, 116, 21);
		contentPane.add(txtf1);
		txtf1.setColumns(10);
		
		txtf2 = new JTextField();
		txtf2.setColumns(10);
		txtf2.setBounds(12, 163, 116, 21);
		contentPane.add(txtf2);
		
		txtf3 = new JTextField();
		txtf3.setColumns(10);
		txtf3.setBounds(12, 194, 116, 21);
		contentPane.add(txtf3);
		
		JLabel lbltxtf1result = new JLabel("결과 : ");
		lbltxtf1result.setBounds(245, 137, 154, 15);
		contentPane.add(lbltxtf1result);
		
		JLabel lbltxtf2result = new JLabel("결과 : ");
		lbltxtf2result.setBounds(245, 166, 154, 15);
		contentPane.add(lbltxtf2result);
		
		JLabel lbltxtf3result = new JLabel("결과 : ");
		lbltxtf3result.setBounds(245, 197, 154, 15);
		contentPane.add(lbltxtf3result);
		
		JButton btntxtf1 = new JButton("확인");
		btntxtf1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt = txtf1.getText();
				lbltxtf1result.setText("결과 : "+txt);
			}
		});
		btntxtf1.setBounds(140, 133, 97, 23);
		contentPane.add(btntxtf1);
		
		JButton btntxtf2 = new JButton("확인");
		btntxtf2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt = txtf2.getText();
				lbltxtf2result.setText("결과 : "+txt);
			}
		});
		btntxtf2.setBounds(140, 162, 97, 23);
		contentPane.add(btntxtf2);
		
		JButton btntxtf3 = new JButton("확인");
		btntxtf3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt = txtf3.getText();
				lbltxtf3result.setText("결과 : "+txt);
			}
		});
		btntxtf3.setBounds(140, 193, 97, 23);
		contentPane.add(btntxtf3);
		
		JLabel lblNewLabel_3 = new JLabel("CheckBox 컴포넌트");
		lblNewLabel_3.setBounds(12, 225, 110, 15);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("취미를 고르세요");
		lblNewLabel_4.setBounds(22, 250, 101, 15);
		contentPane.add(lblNewLabel_4);
		
		JCheckBox chk1 = new JCheckBox("등산");
		chk1.setBounds(12, 271, 57, 23);
		contentPane.add(chk1);
		
		JCheckBox chk2 = new JCheckBox("여행");
		chk2.setBounds(12, 296, 57, 23);
		contentPane.add(chk2);
		
		JCheckBox chk3 = new JCheckBox("독서");
		chk3.setBounds(92, 271, 57, 23);
		contentPane.add(chk3);
		
		JCheckBox chk4 = new JCheckBox("운동");
		chk4.setBounds(92, 296, 57, 23);
		contentPane.add(chk4);
		
		JCheckBox chk5 = new JCheckBox("게임");
		chk5.setBounds(188, 271, 57, 23);
		contentPane.add(chk5);
		
		JLabel lblchkresult = new JLabel("결과 : ");
		lblchkresult.setBounds(50, 323, 252, 15);
		contentPane.add(lblchkresult);
		
		JButton btnchk = new JButton("확인");
		btnchk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> list = new ArrayList<>();
				
				if (chk1.isSelected() == true) {
					list.add(chk1.getText());
				}
				if (chk2.isSelected() == true) {
					list.add(chk2.getText());
				}
				if (chk3.isSelected() == true) {
					list.add(chk3.getText());
				}
				if (chk4.isSelected() == true) {
					list.add(chk4.getText());
				}
				if (chk5.isSelected() == true) {
					list.add(chk5.getText());
				}
				lblchkresult.setText("결과 : "+list);
			}
		});
		btnchk.setBounds(302, 282, 97, 23);
		contentPane.add(btnchk);
		
		JLabel lblNewLabel_5 = new JLabel("Radiobutton 컴포넌트");
		lblNewLabel_5.setBounds(12, 352, 137, 15);
		contentPane.add(lblNewLabel_5);
		
		JRadioButton nrb1 = new JRadioButton("남자");
		nrb1.setBounds(28, 373, 121, 23);
		contentPane.add(nrb1);
		
		JRadioButton nrb2 = new JRadioButton("여자");
		nrb2.setBounds(156, 373, 121, 23);
		contentPane.add(nrb2);
		
		JLabel lblnrbresult = new JLabel("결과 : ");
		lblnrbresult.setBounds(50, 402, 335, 15);
		contentPane.add(lblnrbresult);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(nrb1);
		bg.add(nrb2);
		
		JButton btnnrb = new JButton("확인");
		btnnrb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (nrb1.isSelected() == true) {
					lblnrbresult.setText("결과 : 남자");
				} else if (nrb2.isSelected() == true) {
					lblnrbresult.setText("결과 : 여자");
				} else {
					lblnrbresult.setText("결과 : ");
				}
			}
		});
		btnnrb.setBounds(302, 373, 97, 23);
		contentPane.add(btnnrb);
		
		
		
	}
}
