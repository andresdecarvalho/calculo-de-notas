import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Dialog.ModalExclusionType;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setAutoRequestFocus(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("CALCULADORA DE M\u00C9DIAS UNIVERSITARIAS ");
		setFont(new Font("Calibri", Font.BOLD, 14));
		setResizable(false);
		setBounds(100, 100, 467, 463);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("1\u00B0\r\n SEMESTRE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NotaFinal notafinal = new NotaFinal();
				notafinal.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 11));
		btnNewButton.setBounds(69, 97, 115, 115);
		contentPane.add(btnNewButton);
		
		JButton btnSemestre = new JButton("2\u00B0 SEMESTRE");
		btnSemestre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSemestre.setFont(new Font("Arial", Font.BOLD, 11));
		btnSemestre.setBounds(267, 97, 115, 115);
		contentPane.add(btnSemestre);
		
		JButton btnSemestre_1 = new JButton("3\u00B0 \r\nSEMESTRE");
		btnSemestre_1.setFont(new Font("Arial", Font.BOLD, 11));
		btnSemestre_1.setBounds(69, 278, 115, 115);
		contentPane.add(btnSemestre_1);
		
		JButton btnSemestre_2 = new JButton("4\u00B0 SEMESTRE");
		btnSemestre_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSemestre_2.setFont(new Font("Arial", Font.BOLD, 11));
		btnSemestre_2.setBounds(267, 278, 115, 115);
		contentPane.add(btnSemestre_2);
		
		JLabel lblNewLabel = new JLabel("ESCOLHA UM SEMESTRE");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel.setBounds(38, 22, 374, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1\u00B0 SEMESTRE");
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(69, 77, 115, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("2\u00B0 SEMESTRE");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Calibri", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(267, 77, 115, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("3\u00B0 SEMESTRE");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Calibri", Font.BOLD, 12));
		lblNewLabel_1_2.setBounds(69, 263, 115, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("4\u00B0 SEMESTRE");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Calibri", Font.BOLD, 12));
		lblNewLabel_1_3.setBounds(267, 263, 115, 14);
		contentPane.add(lblNewLabel_1_3);
	}
}
