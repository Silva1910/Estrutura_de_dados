package TrabalhoSem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.UIManager;

public class TelaInicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
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
	public TelaInicial() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 360);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panelCliente = new JPanel();
		panelCliente.setBackground(new Color(128, 128, 128));
		panelCliente.setForeground(UIManager.getColor("Button.darkShadow"));
		panelCliente.setBorder(new LineBorder(new Color(255, 255, 255)));
		panelCliente.setBounds(10, 60, 199, 235);
		contentPane.add(panelCliente);
		panelCliente.setLayout(null);

		JButton btnClienteCadastro = new JButton("CADASTRO");
		btnClienteCadastro.setToolTipText("CADASTRAR  CLIENTES");
		btnClienteCadastro.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClienteCadastro.setBackground(new Color(255, 255, 255));
		btnClienteCadastro.setBounds(20, 90, 165, 23);
		panelCliente.add(btnClienteCadastro);

		JButton btnClienteConsulta = new JButton("CONSULTA");
		btnClienteConsulta.setToolTipText("CONSULTAR CLIENTES");
		btnClienteConsulta.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClienteConsulta.setBackground(new Color(255, 255, 255));
		btnClienteConsulta.setBounds(20, 124, 165, 23);
		panelCliente.add(btnClienteConsulta);

		JButton btnClienteExcluir = new JButton("EXCLUIR");
		btnClienteExcluir.setToolTipText("EXCLUSAO DE CLIENTES");
		btnClienteExcluir.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClienteExcluir.setBackground(new Color(255, 255, 255));
		btnClienteExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnClienteExcluir.setBounds(20, 158, 165, 23);
		panelCliente.add(btnClienteExcluir);

		JLabel lblCliente = new JLabel("CLIENTE");
		lblCliente.setToolTipText("CLASSE CLIENTE");
		lblCliente.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblCliente.setBounds(46, 34, 139, 27);
		panelCliente.add(lblCliente);
		
		JButton btnClienteCheckout = new JButton("CHECKOUT");
		btnClienteCheckout.setBounds(20, 192, 165, 23);
		panelCliente.add(btnClienteCheckout);
		btnClienteCheckout.setToolTipText("CHECKOUT");
		btnClienteCheckout.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClienteCheckout.setBackground(Color.WHITE);

		JPanel panelProduto = new JPanel();
		panelProduto.setForeground(new Color(255, 255, 255));
		panelProduto.setBackground(new Color(128, 128, 128));
		panelProduto.setBorder(new LineBorder(new Color(255, 255, 255)));
		panelProduto.setBounds(219, 60, 207, 235);
		contentPane.add(panelProduto);
		panelProduto.setLayout(null);

		JButton btnProdutoCadastro = new JButton("CADASTRO");
		btnProdutoCadastro.setToolTipText("CADASTRAR PRODUTOS");
		btnProdutoCadastro.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnProdutoCadastro.setBackground(new Color(255, 255, 255));
		btnProdutoCadastro.setBounds(20, 98, 165, 23);
		panelProduto.add(btnProdutoCadastro);

		JButton btnProdutoConsulta = new JButton("CONSULTA");
		btnProdutoConsulta.setToolTipText("CONSULTA DE PRODUTOS");
		btnProdutoConsulta.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnProdutoConsulta.setBackground(new Color(255, 255, 255));
		btnProdutoConsulta.setBounds(20, 150, 165, 23);
		panelProduto.add(btnProdutoConsulta);

		JButton btnProdutoExcluir = new JButton("EXCLUIR");
		btnProdutoExcluir.setToolTipText("EXCLUSAO DE PRODUTOS");
		btnProdutoExcluir.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnProdutoExcluir.setBackground(new Color(255, 255, 255));
		btnProdutoExcluir.setBounds(20, 200, 165, 23);
		panelProduto.add(btnProdutoExcluir);

		JLabel lblProduto = new JLabel("PRODUTO");
		lblProduto.setToolTipText("CLASSE DE PRODUTO");
		lblProduto.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblProduto.setBounds(42, 39, 143, 23);
		panelProduto.add(lblProduto);

		JPanel panelTipoProduto = new JPanel();
		panelTipoProduto.setBackground(new Color(128, 128, 128));
		panelTipoProduto.setBorder(new LineBorder(new Color(255, 255, 255)));
		panelTipoProduto.setBounds(436, 60, 207, 235);
		contentPane.add(panelTipoProduto);
		panelTipoProduto.setLayout(null);

		JButton btnTipoProdutoCadastro = new JButton("CADASTRO");
		btnTipoProdutoCadastro.setToolTipText("CADASTRAR TIPOS DE PRODUTOS");
		btnTipoProdutoCadastro.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTipoProdutoCadastro.setBackground(new Color(255, 255, 255));
		btnTipoProdutoCadastro.setBounds(20, 98, 165, 23);
		panelTipoProduto.add(btnTipoProdutoCadastro);

		JButton btnTipoProdutoConsulta = new JButton("CONSULTA");
		btnTipoProdutoConsulta.setToolTipText("CONSULTAR TIPOS DE PRODUTOS");
		btnTipoProdutoConsulta.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTipoProdutoConsulta.setBackground(new Color(255, 255, 255));
		btnTipoProdutoConsulta.setBounds(20, 150, 165, 23);
		panelTipoProduto.add(btnTipoProdutoConsulta);

		JButton btnTipoProdutoExcluir = new JButton("EXCLUIR");
		btnTipoProdutoExcluir.setToolTipText("EXCLUSAO DE TIPO DE PRODUTO");
		btnTipoProdutoExcluir.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTipoProdutoExcluir.setBackground(new Color(245, 255, 250));
		btnTipoProdutoExcluir.setBounds(20, 200, 165, 23);
		panelTipoProduto.add(btnTipoProdutoExcluir);

		JLabel lblTipoProduto = new JLabel("TIPO DO PRODUTO");
		lblTipoProduto.setToolTipText("CLASSE DE TIPO DO PRODUTO");
		lblTipoProduto.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTipoProduto.setBounds(10, 38, 197, 25);
		panelTipoProduto.add(lblTipoProduto);

		JLabel lblTelaInicial = new JLabel("TELA INICIAL");
		lblTelaInicial.setToolTipText("TELA INICIAL DO TRABALHO");
		lblTelaInicial.setForeground(new Color(255, 255, 255));
		lblTelaInicial.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblTelaInicial.setBounds(250, 11, 236, 31);
		contentPane.add(lblTelaInicial);
		
				JButton btnCarrinho = new JButton("CARRINHO");
				btnCarrinho.setBounds(529, 19, 114, 23);
				contentPane.add(btnCarrinho);
				btnCarrinho.setToolTipText("CARRINHO");
				btnCarrinho.setFont(new Font("Tahoma", Font.BOLD, 14));
				btnCarrinho.setBackground(new Color(255, 255, 255));
				
						// ActionListener para o botão COMPRA
						btnCarrinho.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								CompraClienteFrame CompraCliente = new CompraClienteFrame(TelaInicial.this, true);
								CompraCliente.setVisible(true);
							}
						});
						
						

		// ActionListener para o botão de CADASTRO do CLIENTE
		   btnClienteCadastro.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                // Cria uma instância da classe pfoupj e a torna visível
	            	ClienteCpfouCnpj ClienteCpfouCnpjjFrame = new ClienteCpfouCnpj();
	            	ClienteCpfouCnpjjFrame.setVisible(true);
	                

	                // Fecha o frame atual, se necessário
	                 setVisible(false);
	                 dispose();
	            }
	        });

	     
		// ActionListener para o botão de CONSULTA do CLIENTE
		btnClienteConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  conCliente conClientejFrame = new conCliente();
				  conClientejFrame.setVisible(true);

	                // Fecha o frame atual, se necessário
	                 setVisible(false);
	                 dispose();
			}
		});

		// ActionListener para o botão de EXCLUIR do CLIENTE
		btnClienteExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				excCliente excClientejFrame = new excCliente();
				  excClientejFrame.setVisible(true);

	                // Fecha o frame atual, se necessário
	                 setVisible(false);
	                 dispose();
			}
		});

		btnProdutoCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadProduto cadProdutojFrame = new cadProduto();
				cadProdutojFrame.setVisible(true);

	                // Fecha o frame atual, se necessário
	                 setVisible(false);
	                 dispose();
				
				
			}
		});
				// ActionListener para o botão CONSULTA do TIPO DO PRODUTO
		btnTipoProdutoConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultaTipoProdutoFrame consultaTipoProduto = new ConsultaTipoProdutoFrame(TelaInicial.this, true);
				consultaTipoProduto.setVisible(true);
			}
		});

		// ActionListener para o botão EXCLUIR do TIPO DO PRODUTO
		btnTipoProdutoExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				excTipoProduto excTipoProdutojFrame = new excTipoProduto();
				excTipoProdutojFrame.setVisible(true);

	                // Fecha o frame atual, se necessário
	                 setVisible(false);
	                 dispose();
							}
		});
		btnProdutoExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				excProduto excProdutojFrame = new excProduto();
				excProdutojFrame.setVisible(true);

	                // Fecha o frame atual, se necessário
	                 setVisible(false);
	                 dispose();
							}
		});
	
		btnTipoProdutoCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadTipoProduto cadTipoProdutojFrame = new cadTipoProduto();
				cadTipoProdutojFrame.setVisible(true);

	                // Fecha o frame atual, se necessário
	                 setVisible(false);
	                 dispose();
				
				
			}
		});
		
			
	
	}

	
	

	class ConsultaTipoProdutoFrame extends JDialog {
		public ConsultaTipoProdutoFrame(JFrame parent, boolean modal) {
			super(parent, "Consulta de Tipo de Produto", modal);
			setBounds(100, 100, 690, 360);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setLocationRelativeTo(parent);
		}
	}

	class ExcluirTipoProdutoFrame extends JDialog {
		public ExcluirTipoProdutoFrame(JFrame parent, boolean modal) {
			super(parent, "Exclusao de Tipo de Produto", modal);
			setBounds(100, 100, 690, 360);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setLocationRelativeTo(parent);
		}
	}

	class CadastroProdutoFrame extends JDialog {
		public CadastroProdutoFrame(JFrame parent, boolean modal) {
			super(parent, "Cadastro de Produto", modal);
			setBounds(100, 100, 690, 360);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setLocationRelativeTo(parent);
		}
	}

	class ConsultaProdutoFrame extends JDialog {
		public ConsultaProdutoFrame(JFrame parent, boolean modal) {
			super(parent, "Consulta de Produto", modal);
			setBounds(100, 100, 690, 360);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setLocationRelativeTo(parent);
		}
	}

	class ExcluirProdutoFrame extends JDialog {
		public ExcluirProdutoFrame(JFrame parent, boolean modal) {
			super(parent, "Exclusao de Produto", modal);
			setBounds(100, 100, 690, 360);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setLocationRelativeTo(parent);
		}
	}

	class CompraClienteFrame extends JDialog {
		public CompraClienteFrame(JFrame parent, boolean modal) {
			super(parent, "Compras de Produto", modal);

			setBounds(100, 100, 690, 360);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setLocationRelativeTo(parent);
		}
	}
}
