import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Label;
import java.text.SimpleDateFormat;//import data e hora 
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.*;
import java.awt.Toolkit;
import javax.swing.ImageIcon;


public class Principal extends JFrame {

	private JPanel contentPane;
	private JLabel lblData = new JLabel("");//label para mostrar a hora e data 

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/icones/calculadora1.png")));
		
		addWindowListener(new WindowAdapter() {//ação para modificar a label e mostrr data e hora
			public void windowActivated(WindowEvent e) {
				alterarLabel();
			}
		});
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("CALCULADORA DE M\u00C9DIAS UNIVERSITARIAS ");
		setFont(new Font("Calibri", Font.BOLD, 14));
		setResizable(false);
		setBounds(100, 100, 473, 321);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);
		
		JButton btnNewButton = new JButton("1\u00B0\r\n SEMESTRE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NotaFinal notafinal = new NotaFinal();
				notafinal.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 11));
		btnNewButton.setBounds(261, 54, 145, 30);
		contentPane.add(btnNewButton);
		
		JButton btnSemestre = new JButton("2\u00B0 SEMESTRE");
		btnSemestre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSemestre.setFont(new Font("Arial", Font.BOLD, 11));
		btnSemestre.setBounds(261, 95, 145, 30);
		contentPane.add(btnSemestre);
		
		JButton btnSemestre_1 = new JButton("3\u00B0 \r\nSEMESTRE");
		btnSemestre_1.setFont(new Font("Arial", Font.BOLD, 11));
		btnSemestre_1.setBounds(261, 136, 145, 30);
		contentPane.add(btnSemestre_1);
		
		JButton btnSemestre_2 = new JButton("4\u00B0 SEMESTRE");
		btnSemestre_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSemestre_2.setFont(new Font("Arial", Font.BOLD, 11));
		btnSemestre_2.setBounds(261, 177, 145, 30);
		contentPane.add(btnSemestre_2);
		
		JLabel lblNewLabel = new JLabel("ESCOLHA UM SEMESTRE");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel.setBounds(234, 29, 204, 14);
		contentPane.add(lblNewLabel);
		
		lblData = new JLabel("");
		lblData.setLabelFor(this);
		lblData.setHorizontalAlignment(SwingConstants.CENTER);
		lblData.setFont(new Font("Arial", Font.BOLD, 12));
		lblData.setBounds(261, 231, 145, 14);
		contentPane.add(lblData);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setToolTipText("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(Principal.class.getResource("/icones/facul.png")));
		lblNewLabel_1.setBounds(55, 54, 145, 153);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("UNIVERSIDADE X");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2.setBounds(55, 29, 145, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DEVELOPED BY ANDR\u00C9 CARVALHO ");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setToolTipText("");
		lblNewLabel_3.setFont(new Font("Calibri", Font.BOLD, 12));
		lblNewLabel_3.setBounds(10, 231, 249, 20);
		contentPane.add(lblNewLabel_3);
	}
	
		private void alterarLabel() {// metodo pra mostrar data e hora no lugar da label

		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime data = LocalDateTime.now();

        lblData.setText(data.format(formatador));
	}
}
