import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JCheckBox;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JEditorPane;
import javax.swing.ImageIcon;

public class FrameLab4 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameLab4 window = new FrameLab4();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FrameLab4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 194, 166));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 1, true), "\u0406\u0434\u0435\u043D\u0442\u0438\u0444\u0456\u043A\u0430\u0446\u0456\u044F", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(new Color(255, 194, 166));
		panel.setBounds(34, 139, 434, 103);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Користувач");
		lblNewLabel_1.setBounds(38, 36, 60, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Пароль");
		lblNewLabel.setBounds(48, 61, 46, 14);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(108, 33, 110, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(108, 58, 110, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Запам'ятати");
		chckbxNewCheckBox.setSelected(true);
		chckbxNewCheckBox.setFont(new Font("Arial", Font.ITALIC, 11));
		chckbxNewCheckBox.setBackground(new Color(255, 194, 166));
		chckbxNewCheckBox.setBounds(312, 46, 97, 23);
		panel.add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("Увійти");
		btnNewButton.setBackground(new Color(128, 128, 128));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 11));
		btnNewButton.setBounds(268, 254, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Скасувати");
		btnNewButton_1.setBackground(new Color(128, 128, 128));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 11));
		btnNewButton_1.setBounds(367, 254, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\IVAN\\Downloads\\free-icon-text-editor-8422310 (1).png"));
		lblNewLabel_2.setBounds(226, 42, 69, 86);
		frame.getContentPane().add(lblNewLabel_2);
		frame.setBounds(100, 100, 513, 376);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
