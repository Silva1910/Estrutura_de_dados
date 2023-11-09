package TrabalhoSem;

import javax.swing.JPanel;



import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.PlainDocument;
import java.awt.Color;

public class clienteCnpj extends JFrame {

    private JPanel contentPane;
    private JTextField textFieldNomeFantasia;
    private JTextField textFieldCelular;
    private JTextField textFieldNumero;
    private JTextField textFieldLogradouro;
    private JTextField textFieldCnpj;
    private JTextField textFieldComplemento;
    private JTextField textFieldCEP;
    private JTextField textFieldEmail;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    clienteCnpj frame = new clienteCnpj();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public clienteCnpj() {
        getContentPane().setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 690, 360);
        contentPane = new JPanel();
        contentPane.setBackground(Color.LIGHT_GRAY);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);


       AlphaNumericTextField textFieldNomeFantasia = new AlphaNumericTextField();
   
        textFieldNomeFantasia.setToolTipText("DIGITE O NOME FANTASIA DA EMPRESA");
        textFieldNomeFantasia.setBounds(191, 57, 185, 26);
        contentPane.add(textFieldNomeFantasia);
        textFieldNomeFantasia.setColumns(10);

        AlphaNumericTextField textFieldLogradouro = new AlphaNumericTextField();
        textFieldLogradouro.setToolTipText("DIGITE O LOGRADOURO DA EMPRESA");
        textFieldLogradouro.setBounds(164, 185, 140, 26);
        contentPane.add(textFieldLogradouro);
        textFieldLogradouro.setColumns(10);

        AlphaNumericTextField textFieldComplemento = new AlphaNumericTextField();
        textFieldComplemento.setToolTipText("DIGITE O COMPLEMENTO DA EMPRESA");
        textFieldComplemento.setBounds(191, 243, 148, 26);
        contentPane.add(textFieldComplemento);
        textFieldComplemento.setColumns(10);
		
        textFieldEmail = new  JTextField();
        textFieldEmail.setToolTipText("DIGITE O E-MAIL DA EMPRESA ");
		textFieldEmail.setBounds(470, 102, 175, 26);
		contentPane.add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		textFieldCnpj = createNumericTextField();
        textFieldCnpj.setToolTipText("DIGITE O CNPJ");
		textFieldCnpj.setBounds(470, 57, 193, 26);
		contentPane.add(textFieldCnpj);
		textFieldCnpj.setColumns(10);
	
		
		textFieldNumero =  createNumericTextField();
		textFieldNumero.setBounds(455, 185, 148, 26);
		contentPane.add(textFieldNumero);
		textFieldNumero.setColumns(10);
		textFieldNumero.setToolTipText("DIGITE O NUMERO DA PORTA");
		
		textFieldCelular = createNumericTextField();   
		textFieldCelular.setBounds(133, 102, 133, 26);
		contentPane.add(textFieldCelular);
		textFieldCelular.setColumns(10);
		textFieldCelular.setToolTipText("DIGITE O NUMERO DO TELEFONE");
		
		textFieldCEP = createNumericTextField();
		textFieldCEP.setBounds(423, 240, 148, 26);
		contentPane.add(textFieldCEP);
		textFieldCEP.setColumns(10);
		textFieldCEP.setToolTipText("DIGITE O CEP DA EMPRESA");
		
		
		 JButton btnVoltar = new JButton("Voltar");
	        btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, 16));
	        btnVoltar.setBounds(545, 11, 100, 30);
	        contentPane.add(btnVoltar);
		
		
		JLabel lblNewLabel = new JLabel("NOME FANTASIA :");
		lblNewLabel.setToolTipText("NOME FANTASIA ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(21, 63, 200, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("TELEFONE :");
		lblNewLabel_1.setToolTipText("TELEFONE ");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblNewLabel_1.setBounds(21, 102, 107, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("LOGRADOURO :");
		lblNewLabel_2.setToolTipText(" LOGRADOURO");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(21, 186, 160, 26);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("NUMERO :");
		lblNewLabel_3.setToolTipText(" NUMERO ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(347, 179, 200, 33);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("COMPLEMENTO :");
		lblNewLabel_4.setToolTipText(" COMPLEMENTO");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setBounds(21, 244, 160, 25);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("CNPJ:");
		lblNewLabel_5.setToolTipText("CNPJ");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_5.setBounds(401, 63, 59, 20);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_7 = new JLabel("INFORMAÇÕES DA EMPRESA");
		lblNewLabel_7.setToolTipText("INFORMAÇÕES DA EMPRESA");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_7.setBounds(21, 11, 341, 26);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_6 = new JLabel("CEP :");
		lblNewLabel_6.setToolTipText("CEP");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_6.setBounds(349, 240, 64, 26);
		contentPane.add(lblNewLabel_6);
		
		
		
		JLabel lblNewLabel_8 = new JLabel("INFORMAÇÕES DE ENDEREÇO DA EMPRESA");
		lblNewLabel_8.setToolTipText("INFORMAÇÕES DE ENDEREÇO EMPRESA");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_8.setBounds(21, 136, 458, 36);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("E-mail:");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_9.setBounds(399, 108, 80, 20);
		contentPane.add(lblNewLabel_9);

	    btnVoltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Cria uma instância da tela inicial (classe ED) e a torna visível
                pfoupj telaInicial = new pfoupj();
                telaInicial.setVisible(true);

                // Fecha o frame atual
                dispose();
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
    public class AlphaNumericTextField extends JTextField {
        public AlphaNumericTextField() {
            setDocument(new AlphaNumericDocument());
        }

        private class AlphaNumericDocument extends PlainDocument {
            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                // Verifica se a string contém apenas letras
                if (str != null && str.matches("[a-zA-Z]+")) {
                    super.insertString(offs, str, a);
                }
            }
        }
    }
}
