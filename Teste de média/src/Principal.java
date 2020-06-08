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
		setTitle("CALCULADORA DE M\u00C9DIAS UNIVERSITARIAS - UNIVERSIDADE X");
		setFont(new Font("Calibri", Font.BOLD, 14));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 353, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("1\u00B0\r\n SEMESTRE");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 11));
		btnNewButton.setBounds(38, 61, 115, 115);
		contentPane.add(btnNewButton);
		
		JButton btnSemestre = new JButton("2\u00B0 SEMESTRE");
		btnSemestre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSemestre.setFont(new Font("Arial", Font.BOLD, 11));
		btnSemestre.setBounds(191, 61, 115, 115);
		contentPane.add(btnSemestre);
		
		JButton btnSemestre_1 = new JButton("3\u00B0 \r\nSEMESTRE");
		btnSemestre_1.setFont(new Font("Arial", Font.BOLD, 11));
		btnSemestre_1.setBounds(38, 210, 115, 115);
		contentPane.add(btnSemestre_1);
		
		JButton btnSemestre_2 = new JButton("4\u00B0 SEMESTRE");
		btnSemestre_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSemestre_2.setFont(new Font("Arial", Font.BOLD, 11));
		btnSemestre_2.setBounds(191, 210, 115, 115);
		contentPane.add(btnSemestre_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel.setBounds(38, 22, 265, 14);
		contentPane.add(lblNewLabel);
	}
}
