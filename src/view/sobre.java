package view;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class sobre extends JDialog {

	private static final long serialVersionUID = -5512666712820487201L;
	private final JPanel contentPanel = new JPanel();
	private JButton btnGitHub;

	public static void main(String[] args) {
		try {
			sobre dialog = new sobre();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public sobre() {
		setTitle("Sistema da Mecânica CarMech");
		setIconImage(Toolkit.getDefaultToolkit().getImage(sobre.class.getResource("/img/pngegg.png")));
		setBounds(100, 100, 800, 600);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(192, 192, 192));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Mecânica de Carro");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(279, 87, 242, 30);
		contentPanel.add(lblNewLabel);
		{
			JLabel lblNewLabel_1 = new JLabel("Autor : Gustavo Cavalcante Moreira");
			lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
			lblNewLabel_1.setBounds(280, 226, 264, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Sob a Licença MIT");
			lblNewLabel_2.setFont(new Font("Lucida Handwriting", Font.PLAIN, 12));
			lblNewLabel_2.setBounds(303, 346, 128, 14);
			contentPanel.add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("");
			lblNewLabel_3.setIcon(new ImageIcon(sobre.class.getResource("/img/mit-icon.png")));
			lblNewLabel_3.setBounds(303, 371, 128, 128);
			contentPanel.add(lblNewLabel_3);
		}

		JLabel lblNewLabel_4 = new JLabel("Mecânica CarMech");
		lblNewLabel_4.setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		lblNewLabel_4.setBounds(310, 122, 128, 14);
		contentPanel.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(sobre.class.getResource("/img/pngwing.com (2).png")));
		lblNewLabel_5.setBounds(310, 126, 211, 103);
		contentPanel.add(lblNewLabel_5);
		{
			JLabel lblNewLabel_6 = new JLabel("Redes Sociais");
			lblNewLabel_6.setFont(new Font("Tw Cen MT", Font.ITALIC, 20));
			lblNewLabel_6.setBounds(310, 251, 121, 14);
			contentPanel.add(lblNewLabel_6);
		}
		{
			JLabel lblNewLabel_7 = new JLabel("carmech_oficial");
			lblNewLabel_7.setIcon(
					new ImageIcon(sobre.class.getResource("/img/3228551_app_b_w_instagram_logo_media_icon (1).png")));
			lblNewLabel_7.setBounds(310, 293, 115, 67);
			contentPanel.add(lblNewLabel_7);
		}

		btnGitHub = new JButton("");
		btnGitHub.setContentAreaFilled(false);
		btnGitHub.setBorderPainted(false);
		btnGitHub.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				link("https://github.com/moreiragustavo?tab=repositories");
			}
		});
		btnGitHub.setIcon(new ImageIcon(sobre.class.getResource("/img/github.png")));
		btnGitHub.setBorder(null);
		btnGitHub.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGitHub.setBounds(341, 265, 42, 46);
		contentPanel.add(btnGitHub);

		JLabel lblNewLabel_8 = new JLabel("GitHub");
		lblNewLabel_8.setBounds(306, 283, 77, 14);
		contentPanel.add(lblNewLabel_8);
		{
			JPanel buttonPane = new JPanel();
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			buttonPane.setLayout(null);
			{
				JButton okButton = new JButton("OK");
				okButton.setBounds(312, 5, 47, 23);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setBounds(364, 5, 65, 23);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}

		}

	}

	private void link(String site) {
		Desktop desktop = Desktop.getDesktop();
		try {
			URI uri = new URI(site);
			desktop.browse(uri);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
