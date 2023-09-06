package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.DAO;
import java.awt.Font;

public class principal extends JFrame {

	private static final long serialVersionUID = 1L;
	DAO dao = new DAO();
	@SuppressWarnings("unused")
	private Connection con;

	private JPanel contentPane;
	private JLabel lblData;
	private JButton lblStatus;
	public JLabel lblUsuario;
	public JButton btnUsuarios;
	public JButton btnRelatorios;
	public JPanel panelRodape;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel panel_6;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal frame = new principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public principal() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				setarData();
			}
		});
		setTitle("Sistema da Mecânica CarMech");
		setIconImage(Toolkit.getDefaultToolkit().getImage(principal.class.getResource("/img/pngegg.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		panelRodape = new JPanel();
		panelRodape.setBackground(new Color(255, 255, 255));
		panelRodape.setBounds(0, 507, 784, 54);
		contentPane.add(panelRodape);
		panelRodape.setLayout(null);

		lblData = new JLabel("New label");
		lblData.setFont(new Font("Dubai Medium", Font.PLAIN, 14));
		lblData.setBounds(257, 11, 278, 32);
		panelRodape.add(lblData);
		lblData.setForeground(new Color(0, 0, 0));
		lblData.setBackground(new Color(255, 255, 255));

		JLabel lblNewLabel_1 = new JLabel("Usuário:");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBounds(62, 20, 69, 14);
		panelRodape.add(lblNewLabel_1);

		lblUsuario = new JLabel("");
		lblUsuario.setBackground(new Color(0, 0, 0));
		lblUsuario.setForeground(new Color(0, 0, 0));
		lblUsuario.setBounds(118, 20, 148, 14);
		panelRodape.add(lblUsuario);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setIcon(new ImageIcon(principal.class.getResource("/img/pngwing.com (2).png")));
		lblNewLabel.setBounds(204, 308, 97, 119);
		contentPane.add(lblNewLabel);

		btnRelatorios = new JButton("");
		btnRelatorios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				relatorios Relatorios = new relatorios();
				Relatorios.setVisible(true);
			}
		});
		btnRelatorios.setBorder(null);
		btnRelatorios.setContentAreaFilled(false);
		btnRelatorios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRelatorios.setToolTipText("Relatórios");
		btnRelatorios.setIcon(new ImageIcon(principal.class.getResource("/img/pngegg (4).png")));
		btnRelatorios.setBounds(406, 185, 97, 96);
		contentPane.add(btnRelatorios);

		JButton btnServicos = new JButton("");
		btnServicos.setBackground(new Color(255, 255, 255));
		btnServicos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				servicos Servicos = new servicos();
				Servicos.setVisible(true);
			}
		});
		btnServicos.setIcon(new ImageIcon(principal.class.getResource("/img/pngegg (5).png")));
		btnServicos.setContentAreaFilled(false);
		btnServicos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnServicos.setToolTipText("Serviços");
		btnServicos.setBorder(null);
		btnServicos.setBounds(390, 41, 97, 96);
		contentPane.add(btnServicos);

		JButton btnFornecedor = new JButton("");
		btnFornecedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fornecedores Fornecedor = new fornecedores();
				Fornecedor.setVisible(true);
			}
		});
		btnFornecedor.setIcon(new ImageIcon(principal.class.getResource("/img/pngwing.com (8).png")));
		btnFornecedor.setToolTipText("Usuarios");
		btnFornecedor.setContentAreaFilled(false);
		btnFornecedor.setBorder(null);
		btnFornecedor.setBounds(364, 308, 147, 116);
		contentPane.add(btnFornecedor);

		panel = new JPanel();
		panel.setBounds(697, 437, 77, 59);
		contentPane.add(panel);

		lblStatus = new JButton("");
		panel.add(lblStatus);
		lblStatus.setToolTipText("Status");
		lblStatus.setContentAreaFilled(false);
		lblStatus.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblStatus.setBorder(null);
		lblStatus.setIcon(new ImageIcon(principal.class.getResource("/img/dbon.png")));

		JButton btnSobre = new JButton("");
		btnSobre.setBounds(0, 427, 77, 80);
		contentPane.add(btnSobre);
		btnSobre.setIcon(new ImageIcon(principal.class.getResource("/img/pngwing.com.png")));
		btnSobre.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSobre.setContentAreaFilled(false);
		btnSobre.setBorder(null);
		btnSobre.setToolTipText("Sobre");

		JButton btnClientes = new JButton("");
		btnClientes.setBounds(179, 23, 147, 151);
		contentPane.add(btnClientes);
		btnClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clientes Clientes = new clientes();
				Clientes.setVisible(true);
			}
		});
		btnClientes.setIcon(new ImageIcon(principal.class.getResource("/img/pngegg (13).png")));
		btnClientes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnClientes.setContentAreaFilled(false);
		btnClientes.setBorder(null);
		btnClientes.setToolTipText("Cliente");

		panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(183, 39, 143, 110);
		contentPane.add(panel_1);

		btnUsuarios = new JButton("");
		btnUsuarios.setBounds(204, 180, 97, 96);
		contentPane.add(btnUsuarios);
		btnUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usuarioos Usuarioos = new usuarioos();
				Usuarioos.setVisible(true);
			}
		});
		btnUsuarios.setToolTipText("Usuarios");
		btnUsuarios.setBorder(null);
		btnUsuarios.setContentAreaFilled(false);
		btnUsuarios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnUsuarios.setIcon(new ImageIcon(principal.class.getResource("/img/pngegg (2).png")));

		panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(179, 171, 147, 116);
		contentPane.add(panel_2);

		panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBounds(179, 308, 147, 119);
		contentPane.add(panel_3);

		panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setBounds(374, 39, 137, 110);
		contentPane.add(panel_4);

		panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 255, 255));
		panel_5.setBounds(374, 176, 137, 110);
		contentPane.add(panel_5);

		panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 255, 255));
		panel_6.setBounds(368, 305, 143, 119);
		contentPane.add(panel_6);
		btnSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sobre Sobre = new sobre();
				Sobre.setVisible(true);
			}
		});

	}

	private void setarData() {
		Date data = new Date();
		DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL);
		lblData.setText(formatador.format(data));
	}
}