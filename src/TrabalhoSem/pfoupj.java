package TrabalhoSem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Color;

public class pfoupj extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pfoupj frame = new pfoupj();
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
	public pfoupj() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 360);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ESCOLHA QUAL O TIPO DE CLIENTE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel.setBounds(118, 21, 395, 44);
		contentPane.add(lblNewLabel);
		
		JButton btnClienteCpf = new JButton("CPF");
		btnClienteCpf.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClienteCpf.setBounds(198, 111, 229, 44);
		contentPane.add(btnClienteCpf);
		
		JButton btnClienteCnpj = new JButton(" CNPJ");
		btnClienteCnpj.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClienteCnpj.setBounds(198, 182, 229, 44);
		contentPane.add(btnClienteCnpj);

		 JButton btnVoltar = new JButton("Voltar");
	        btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 20));
	        btnVoltar.setBounds(564, 11, 100, 30);
	        contentPane.add(btnVoltar);
	        
	        btnClienteCpf.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                // Cria uma instância da classe pfoupj e a torna visível
	            	clienteCpf clienteCpfjFrame = new clienteCpf();
	            	clienteCpfjFrame.setVisible(true);

	                // Fecha o frame atual, se necessário
	                 setVisible(false);
	                 dispose();
	            }
	        });
	        btnClienteCnpj.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                // Cria uma instância da classe pfoupj e a torna visível
	            	clienteCnpj clienteCnpjjFrame = new clienteCnpj();
	            	clienteCnpjjFrame.setVisible(true);

	                // Fecha o frame atual, se necessário
	                 setVisible(false);
	                 dispose();
	            }
	        });
	        
	        

	        btnVoltar.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                // Cria uma instância da tela inicial (classe ED) e a torna visível
	                ED telaInicial = new ED();
	                telaInicial.setVisible(true);

	                // Fecha o frame atual
	                dispose();
	            }
	        });
	}
}
