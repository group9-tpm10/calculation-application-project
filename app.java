package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.EtchedBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class test extends JFrame {

	private JPanel contentPane;
	private JTextField textDisplay;
	private JPanel panel_number;

	String operandl = "";
	String operator = "";

	boolean isEqualsFress = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test frame = new test();
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
	public test() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 505, 399);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(233, 233, 233));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("CASIO");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(202, 10, 71, 34);
		contentPane.add(lblNewLabel);

		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(33, 47, 424, 71);
		contentPane.add(panel);
		panel.setLayout(null);

		textDisplay = new JTextField();
		textDisplay.setFont(new Font("Tahoma", Font.BOLD, 18));
		textDisplay.setBounds(26, 10, 371, 47);
		textDisplay.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(textDisplay);
		textDisplay.setColumns(10);

		panel_number = new JPanel();
		panel_number.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_number.setBounds(15, 127, 460, 225);
		contentPane.add(panel_number);
		panel_number.setLayout(new GridLayout(4, 4, 4, 4));

		JButton btnNumber1 = new JButton("1");
		btnNumber1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isEqualsFress) {
					isEqualsFress = false;
					textDisplay.setText("");
				}

				String content = e.getActionCommand();
				textDisplay.setText(textDisplay.getText() + content);
			}
		});
		btnNumber1.setBackground(new Color(223, 223, 223));
		btnNumber1.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_number.add(btnNumber1);

		JButton btnNumber2 = new JButton("2");
		btnNumber2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isEqualsFress) {
					isEqualsFress = false;
					textDisplay.setText("");
				}

				String content = e.getActionCommand();
				textDisplay.setText(textDisplay.getText() + content);
			}
		});
		btnNumber2.setBackground(new Color(223, 223, 223));
		btnNumber2.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_number.add(btnNumber2);

		JButton btnNumber3 = new JButton("3");
		btnNumber3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isEqualsFress) {
					isEqualsFress = false;
					textDisplay.setText("");
				}

				String content = e.getActionCommand();
				textDisplay.setText(textDisplay.getText() + content);
			}
		});
		btnNumber3.setBackground(new Color(223, 223, 223));
		btnNumber3.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_number.add(btnNumber3);

		JButton btnAddition = new JButton("+");
		btnAddition.setBackground(new Color(223, 223, 223));
		btnAddition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String information = e.getActionCommand();

				operator = information;
				operandl = textDisplay.getText();

				textDisplay.setText("");
			}
		});
		btnAddition.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_number.add(btnAddition);

		JButton btnNumber4 = new JButton("4");
		btnNumber4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isEqualsFress) {
					isEqualsFress = false;
					textDisplay.setText("");
				}

				String content = e.getActionCommand();
				textDisplay.setText(textDisplay.getText() + content);
			}

		});
		btnNumber4.setBackground(new Color(223, 223, 223));
		btnNumber4.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_number.add(btnNumber4);

		JButton btnNumber5 = new JButton("5");
		btnNumber5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isEqualsFress) {
					isEqualsFress = false;
					textDisplay.setText("");
				}

				String content = e.getActionCommand();
				textDisplay.setText(textDisplay.getText() + content);
			}
		});
		btnNumber5.setBackground(new Color(223, 223, 223));
		btnNumber5.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_number.add(btnNumber5);

		JButton btnNumber6 = new JButton("6");
		btnNumber6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isEqualsFress) {
					isEqualsFress = false;
					textDisplay.setText("");
				}

				String content = e.getActionCommand();
				textDisplay.setText(textDisplay.getText() + content);
			}
		});
		btnNumber6.setBackground(new Color(223, 223, 223));
		btnNumber6.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_number.add(btnNumber6);

		JButton btnSubtraction = new JButton("-");
		btnSubtraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String information = e.getActionCommand();

				operator = information;
				operandl = textDisplay.getText();

				textDisplay.setText("");
			}
		});
		btnSubtraction.setBackground(new Color(223, 223, 223));
		btnSubtraction.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_number.add(btnSubtraction);

		JButton btnNumber7 = new JButton("7");
		btnNumber7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isEqualsFress) {
					isEqualsFress = false;
					textDisplay.setText("");
				}

				String content = e.getActionCommand();
				textDisplay.setText(textDisplay.getText() + content);
			}
		});
		btnNumber7.setBackground(new Color(223, 223, 223));
		btnNumber7.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_number.add(btnNumber7);

		JButton btnNumber8 = new JButton("8");
		btnNumber8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isEqualsFress) {
					isEqualsFress = false;
					textDisplay.setText("");
				}

				String content = e.getActionCommand();
				textDisplay.setText(textDisplay.getText() + content);
			}
		});
		btnNumber8.setBackground(new Color(223, 223, 223));
		btnNumber8.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_number.add(btnNumber8);

		JButton btnNumber9 = new JButton("9");
		btnNumber9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isEqualsFress) {
					isEqualsFress = false;
					textDisplay.setText("");
				}

				String content = e.getActionCommand();
				textDisplay.setText(textDisplay.getText() + content);
			}
		});
		btnNumber9.setBackground(new Color(223, 223, 223));
		btnNumber9.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_number.add(btnNumber9);

		JButton btnMultiplication = new JButton("*");
		btnMultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String information = e.getActionCommand();

				operator = information;
				operandl = textDisplay.getText();

				textDisplay.setText("");
			}
		});
		btnMultiplication.setBackground(new Color(223, 223, 223));
		btnMultiplication.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_number.add(btnMultiplication);

		JButton btnNumber0 = new JButton("0");
		btnNumber0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isEqualsFress) {
					isEqualsFress = false;
					textDisplay.setText("");
				}

				String content = e.getActionCommand();
				textDisplay.setText(textDisplay.getText() + content);
			}
		});
		btnNumber0.setBackground(new Color(223, 223, 223));
		btnNumber0.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_number.add(btnNumber0);

		JButton btnRefreash = new JButton("C");
		btnRefreash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisplay.setText("");
				operandl = "";
				operator = "";
				isEqualsFress = false;
			}
		});
		btnRefreash.setBackground(new Color(223, 223, 223));
		btnRefreash.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_number.add(btnRefreash);

		JButton btnResult = new JButton("=");
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textDisplay.getText().equals("") || operandl.equals("")) {
					return;
				}
				try {
					double oprand1 = Double.parseDouble(operandl);
					double oprand2 = Double.parseDouble(textDisplay.getText());
					double result = 0;

					if (operator.equals("+")) {
						result = oprand1 + oprand2;
					} else if (operator.equals("-")) {
						result = oprand1 - oprand2;
					} else if (operator.equals("*")) {
						result = oprand1 * oprand2;
					} else if (operator.equals("/")) {
						result = oprand1 / oprand2;
					}

					textDisplay.setText("" + result);
					isEqualsFress = true;

				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});	
		btnResult.setBackground(new Color(223, 223, 223));
		btnResult.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_number.add(btnResult);

		JButton btnDivision = new JButton("/");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String information = e.getActionCommand();

				operator = information;
				operandl = textDisplay.getText();

				textDisplay.setText("");
			}
		});
		btnDivision.setBackground(new Color(223, 223, 223));
		btnDivision.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_number.add(btnDivision);
	}
}
