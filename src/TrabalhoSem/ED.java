package TrabalhoSem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class ED extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ED frame = new ED();
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
	public ED() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.BLACK));
		panel.setBounds(10, 60, 199, 235);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("CADASTRO");
		btnNewButton.setBounds(20, 95, 165, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("CONSULTA");
		btnNewButton_2.setBounds(20, 150, 165, 23);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_7 = new JButton("EXCLUIR");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_7.setBounds(20, 200, 165, 23);
		panel.add(btnNewButton_7);
		
		JLabel lblNewLabel_1 = new JLabel("CLIENTE");
		lblNewLabel_1.setBounds(70, 40, 55, 14);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.BLACK));
		panel_1.setBounds(219, 60, 207, 235);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("CADASTRO");
		btnNewButton_1.setBounds(20, 95, 165, 23);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("CONSULTA");
		btnNewButton_3.setBounds(20, 150, 165, 23);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_8 = new JButton("EXCLUIR");
		btnNewButton_8.setBounds(20, 200, 165, 23);
		panel_1.add(btnNewButton_8);
		
		JLabel lblNewLabel_2 = new JLabel("PRODUTO");
		lblNewLabel_2.setBounds(69, 40, 76, 14);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.BLACK));
		panel_2.setBounds(436, 60, 207, 235);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_4 = new JButton("CADASTRO");
		btnNewButton_4.setBounds(20, 95, 165, 23);
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("CONSULTA");
		btnNewButton_5.setBounds(20, 150, 165, 23);
		panel_2.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("EXCLUIR");
		btnNewButton_6.setBounds(20, 200, 165, 23);
		panel_2.add(btnNewButton_6);
		
		JLabel lblNewLabel_3 = new JLabel("TIPO DO PRODUTO");
		lblNewLabel_3.setBounds(56, 41, 117, 14);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("TELA INICIAL");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(250, 11, 236, 31);
		contentPane.add(lblNewLabel);
	}
}
