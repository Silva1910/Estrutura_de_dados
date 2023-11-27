package TrabalhoSem;

import java.awt.Color;

import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;



import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class conCliente extends JFrame {

	private JPanel contentPane;
	private JPanel contentPane_1;
	private JTextField textField;
	private JTextField textFieldCpf;
	private JTextField textFieldCnpj;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					conCliente frame = new conCliente();
					frame.setVisible(true);
					  frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public conCliente() {
		getContentPane().setLayout(null);

		contentPane = new JPanel();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 360);
		contentPane_1 = new JPanel();
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBackground(Color.LIGHT_GRAY);
		setContentPane(contentPane_1);
		contentPane_1.setLayout(null);

		JLabel lblConsultaCliente = new JLabel("CONSULTA DE CLIENTE");
		lblConsultaCliente.setToolTipText("CONSULTA DE CLIENTE POR CPF");
		lblConsultaCliente.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblConsultaCliente.setBounds(192, 11, 267, 31);
		contentPane_1.add(lblConsultaCliente);

		JLabel lblEscolhaCliente = new JLabel("ESCOLHA O TIPO DO CLIENTE :");
		lblEscolhaCliente.setToolTipText("ESCOLHA O TIPO DO CLIENTE");
		lblEscolhaCliente.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEscolhaCliente.setBounds(10, 83, 302, 20);
		contentPane_1.add(lblEscolhaCliente);

		DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
		comboBoxModel.addElement("CPF");
		comboBoxModel.addElement("CNPJ");
		JComboBox<String> comboBox = new JComboBox<>(comboBoxModel);
		comboBox.setBounds(322, 83, 126, 22);
		contentPane_1.add(comboBox);
		comboBox.setSelectedItem("CPF");

		JLabel lblResultadoConsulta = new JLabel("RESULTADO DA CONSULTA :");
		lblResultadoConsulta.setToolTipText("RESULTADO DA SUA CONSULTA");
		lblResultadoConsulta.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblResultadoConsulta.setBounds(10, 202, 267, 25);
		contentPane_1.add(lblResultadoConsulta);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(287, 205, 249, 67);
		contentPane_1.add(scrollPane);

		JTextArea textArea = new JTextArea();
		textArea.setToolTipText("RESULTADO DA CONSULTA DO CLIENTE ");
		scrollPane.setViewportView(textArea);
		
	
	    	
			
				JButton btnVoltarConCliente = new JButton("Voltar");
				btnVoltarConCliente.setToolTipText("VOLTE A TELA ANTERIOR");
		        btnVoltarConCliente.setFont(new Font("Tahoma", Font.BOLD, 16));
		        btnVoltarConCliente.setBounds(430, 285, 110, 30);
		        contentPane_1.add(btnVoltarConCliente);
		        
		        JButton btnConsultarCliente = new JButton("Consultar");
		        btnConsultarCliente.setBackground(new Color(0, 204, 255));
		        btnConsultarCliente.setToolTipText("CADASTRAR O CLIENTE POR CPF");
		        btnConsultarCliente.setFont(new Font("Tahoma", Font.BOLD, 16));
		        btnConsultarCliente.setBounds(550, 285, 114, 30);
		        contentPane_1.add(btnConsultarCliente);
		        
		        textFieldCpf =   createNumericTextField();
		        textFieldCpf.setToolTipText("CLIENTE POR CPF");
		        textFieldCpf.setBounds(77, 137, 131, 20);
		        contentPane_1.add(textFieldCpf);
		        textFieldCpf.setColumns(10);
		        
		    	
		        textFieldCnpj =   createNumericTextField();
		        textFieldCnpj.setToolTipText("CLIENTE POR CNPJ");
		        textFieldCnpj.setBounds(77, 171, 171, 20);
		        contentPane_1.add(textFieldCnpj);
		        textFieldCnpj.setColumns(10);
		        textFieldCnpj.setEnabled(false);
		        
		        JLabel lblCpf = new JLabel("CPF :");
		        lblCpf.setToolTipText("CPF");
		        lblCpf.setFont(new Font("Tahoma", Font.BOLD, 18));
		        lblCpf.setBounds(10, 136, 96, 17);
		        contentPane_1.add(lblCpf);
		        
		        JLabel lblCnpj = new JLabel("CNPJ :");
		        lblCnpj.setToolTipText("CNPJ");
		        lblCnpj.setFont(new Font("Tahoma", Font.BOLD, 18));
		        lblCnpj.setBounds(10, 174, 96, 17);
		        contentPane_1.add(lblCnpj);
		        
		        
	   btnVoltarConCliente.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               // Cria uma instância da tela inicial (classe ED) e a torna visível
        	   TelaInicial telaInicial = new TelaInicial();
               telaInicial.setVisible(true);

               // Fecha o frame atual
               dispose();
           }
       });
	   comboBox.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               String selectedItem = (String) comboBox.getSelectedItem();

               if ("CPF".equals(selectedItem)) {
                   textFieldCnpj.setEnabled(false);
                   textFieldCpf.setEnabled(true);
               } else if ("CNPJ".equals(selectedItem)) {
                   textFieldCpf.setEnabled(false);
                   textFieldCnpj.setEnabled(true);
               }
           }
       });
	   
	// peterson fazer tratamento AQUI
	   btnConsultarCliente.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // Obtenha o item selecionado no combobox
		        String selectedItem = (String) comboBox.getSelectedItem();

		        // Verifique se os campos estão vazios
		        if ((textFieldCpf.isEnabled() && textFieldCpf.getText().isEmpty()) ||
		            (textFieldCnpj.isEnabled() && textFieldCnpj.getText().isEmpty())) {
		            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos antes de consultar.");
		            return; // Não continue com a consulta se algum campo estiver vazio
		        }

		        // Faça algo com o item selecionado
		        if ("CPF".equals(selectedItem)) {
		            // Lógica para consultar por CPF
		            String cpf = textFieldCpf.getText();
		            // Faça algo com o CPF, por exemplo, exiba em textArea
		            JOptionPane.showMessageDialog(null, "O CLIENTE POR CPF FOI CONSULTADO");
		            textArea.setText("Consulta por CPF: " + cpf);
		        } else if ("CNPJ".equals(selectedItem)) {
		            // Lógica para consultar por CNPJ
		            String cnpj = textFieldCnpj.getText();
		            JOptionPane.showMessageDialog(null, "O CLIENTE POR CNPJ FOI CONSULTADO");
		            // Faça algo com o CNPJ, por exemplo, exiba em textArea
		            textArea.setText("Consulta por CNPJ: " + cnpj);
		        }
		    }
		});

		








}

    private JTextField createNumericTextField() {
    	 JTextField textField = new JTextField();
    	   
    	    textField.setDocument(new NumericDocument());
    	    return textField;
    }
    private class NumericDocument extends PlainDocument {
        @Override
        public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
            // Verifica se a string contém apenas dígitos
            if (str != null && str.matches("\\d+")) {
                super.insertString(offs, str, a);
            }
        }
    }
}