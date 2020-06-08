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
		
		addWindowListener(new WindowAdapter() {//ação para modificar a label e mostrr data e hora
			public void windowActivated(WindowEvent e) {
				alterarLabel();
			}
		});
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("CALCULADORA DE M\u00C9DIAS UNIVERSITARIAS ");
		setFont(new Font("Calibri", Font.BOLD, 14));
		setResizable(false);
		setBounds(100, 100, 467, 479);
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
		lblNewLabel.setBounds(69, 35, 313, 14);
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
		
		lblData = new JLabel("");
		lblData.setLabelFor(this);
		lblData.setHorizontalAlignment(SwingConstants.CENTER);
		lblData.setFont(new Font("Arial", Font.BOLD, 12));
		lblData.setBounds(69, 412, 313, 14);
		contentPane.add(lblData);
	}
	
		private void alterarLabel() {// metodo pra mostrar data e hora no lugar do Frame
		//Date data = new Date();
		//DateFormat formatador =
        //DateFormat.getDateInstance(DateFormat.FULL);		
		//lblData.setText(formatador.format(data));
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime data = LocalDateTime.now();

        lblData.setText(data.format(formatador));
	}
}
