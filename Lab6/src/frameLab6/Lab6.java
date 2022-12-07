package frameLab6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JToolBar;
import javax.swing.JPopupMenu;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

public class Lab6 extends JFrame {
	
	private static boolean isNumeric(String str){
	    return str != null && str.matches("[0-9.]+");
	}
	
	private static String TextNumber(int num) {
		String text = "Помилка" ;
		if(num ==0)
			text ="Нуль";
		else if(num < 0 && Math.abs(num) < 10 )
			text = "Просте від'ємне число";
		else if(num < 0 && Math.abs(num) >= 10  && Math.abs(num) < 100)
			text = "Двозначне від'ємне число";
		else if(num < 0 && Math.abs(num) >= 100)
			text = "Трьозначне від'ємне число";
		else if(num > 0 && Math.abs(num) < 10)
			text = "Просте число";
		else if(num > 0 && Math.abs(num) >= 10  && Math.abs(num) < 100)
			text = "Двозначне  число";
		else if(num > 0 && Math.abs(num) >= 100)
			text = "Трьозначне число";
		return text;
	}
	
	private JPanel contentPane;
	protected Object num  ;
	public Object value;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lab6 frame = new Lab6();
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
	public Lab6() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 641, 492);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		JMenu program = new JMenu("Програма");
		JMenu pravka = new JMenu("Правка");
		menuBar.add(program);

		JLabel lblNewLabel_2 = new JLabel("Число підходить");
		lblNewLabel_2.setBounds(242, 36, 133, 14);
		lblNewLabel_2.setVisible(false);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Число не підходить");
		lblNewLabel_3.setBounds(247, 36, 157, 14);
		lblNewLabel_3.setVisible(false);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(371, 77, 233, 59);
		contentPane.add(lblNewLabel_4);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(130, 33, 59, 20);
		contentPane.add(spinner);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Перевірка");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((int) spinner.getValue() < 999 && (int)spinner.getValue() > -999){
					lblNewLabel_2.setVisible(true);
					lblNewLabel_3.setVisible(false);
				}
				else {
					lblNewLabel_3.setVisible(true);
					lblNewLabel_2.setVisible(false);
				}
				
			}
		});
		program.add(mntmNewMenuItem);
		
		
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Опис");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if( (int) spinner.getValue() > 999 || (int) spinner.getValue() < -999) {
					lblNewLabel_4.setText("Error");
				}
				else {
					lblNewLabel_4.setText(TextNumber((int)spinner.getValue()));
					value = (String) TextNumber((int)spinner.getValue());
				}
			}
		});
		program.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("");
		mntmNewMenuItem_2.setEnabled(false);
		program.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Вийти");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		program.add(mntmNewMenuItem_3);
		menuBar.add(pravka);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Копіювати");
		
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 num = (int) spinner.getValue();
			}
		});
		pravka.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Вставити");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			  spinner.setValue(num);
			}
		});
		
		pravka.add(mntmNewMenuItem_5);
		menuBar.setBounds(0, 0, 625, 22);
		contentPane.add(menuBar);
		
		
		
		JLabel lblNewLabel = new JLabel("Число від -999 до 999");
		lblNewLabel.setBounds(10, 36, 110, 14);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 12));
		panel.setBounds(66, 147, 484, 223);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBounds(10, 11, 469, 202);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setBackground(new Color(255, 128, 0));
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\IVAN\\eclipse-workspace\\Lab6\\src\\frameLab6\\Num1.png"));
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(lblNewLabel_1, popupMenu);
		
		JMenu menu = new JMenu("");
		popupMenu.add(menu);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Змінити");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\IVAN\\eclipse-workspace\\Lab6\\src\\frameLab6\\Num2.png"));
			}
		});
		menu.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Видалити");
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setVisible(false);
			}
		});
		menu.add(mntmNewMenuItem_7);
		
		textField = new JTextField();
		textField.setBounds(66, 116, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(162, 116, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(258, 116, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Додати рамку");
		mntmNewMenuItem_8.setForeground(new Color(0, 0, 0));
		mntmNewMenuItem_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setBorder(new LineBorder(new Color( Integer.parseInt(textField.getText()), Integer.parseInt(textField_1.getText()), Integer.parseInt(textField_2.getText())), 12));
			}
		});
		menu.add(mntmNewMenuItem_8);
		
		JButton btnNewButton = new JButton("Старт");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form2 frame = new Form2();
				frame.label =(String) value;
				frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(526, 33, 89, 23);
		contentPane.add(btnNewButton);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
