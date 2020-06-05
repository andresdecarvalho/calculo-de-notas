import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.text.DecimalFormat;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;

public class NotaFinal extends JFrame {

	private JPanel contentPane;
	private JTextField txtN2;
	private JTextField txtDiciplina;
	private JButton btnLimpar;
	private JTextField lblMdia;
	private JTextField txtQuestoes;
	private JTextField txtAluno;
	private JTextField txtAcertos;
	private JTextField txtN1;
	private JTextField txtNotafinal;
	private JTextField txtDiciplina2;
	private JTextField txtN4;
	private JTextField txtQuestoes2;
	private JTextField txtAcertos2;
	private JTextField txtN3;
	private JTextField txtNotafinal2;
	private JTextField txtAprovado;
	private JTextField txtAprovado2;
	private JTextField txtDiciplina3;
	private JTextField txtDiciplina4;
	private JTextField txtDiciplina5;
	private JTextField txtDiciplina6;
	private JTextField txtDiciplina7;
	private JTextField txtDiciplina8;
	private JTextField txtDiciplina9;
	private JTextField txtN6;
	private JTextField txtN8;
	private JTextField txtN10;
	private JTextField txtN12;
	private JTextField txtN14;
	private JTextField txtN16;
	private JTextField txtN18;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField txtN5;
	private JTextField txtN7;
	private JTextField txtN9;
	private JTextField txtN11;
	private JTextField txtN13;
	private JTextField txtN15;
	private JTextField txtN17;
	private JTextField txtNotafinal3;
	private JTextField txtNotafinal4;
	private JTextField txtNotafinal7;
	private JTextField txtNotafinal6;
	private JTextField txtNotafinal5;
	private JTextField txtNotafinal8;
	private JTextField txtNotafinal9;
	private JTextField txtAprovado3;
	private JTextField txtAprovado4;
	private JTextField txtAprovado5;
	private JTextField txtAprovado6;
	private JTextField txtAprovado7;
	private JTextField txtAprovado8;
	private JTextField txtAprovado9;
	private JTextField txtRgm;
	private JTextField txtCurso;
	private JTextField txtTurma;
	private JLabel lblRgm;
	private JLabel lblCurso;
	private JLabel lblTurma;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NotaFinal frame = new NotaFinal();
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
	public NotaFinal() {
		setBackground(SystemColor.textHighlight);
		setFont(new Font("Calibri", Font.PLAIN, 12));
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(NotaFinal.class.getResource("/icones/calculadora.png")));
		setTitle("Calculo de notas - UNICID");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 925, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblDisciplina = new JLabel("DISCIPLINA");
		lblDisciplina.setBounds(21, 83, 96, 14);
		contentPane.add(lblDisciplina);

		txtN2 = new JTextField();
		txtN2.setBounds(309, 100, 48, 20);
		contentPane.add(txtN2);
		txtN2.setColumns(10);

		txtDiciplina = new JTextField();
		txtDiciplina.setText("LINGUA PORTUGUESA ");
		txtDiciplina.setBounds(21, 100, 268, 20);
		contentPane.add(txtDiciplina);
		txtDiciplina.setColumns(10);

		JButton btnCalcular = new JButton("RESULTADO");
		btnCalcular.addActionListener(new ActionListener() {
			// evento "clicar" no botão
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		btnCalcular.setToolTipText("Calcular");
		btnCalcular.setBounds(716, 416, 171, 23);
		contentPane.add(btnCalcular);

		JButton btnLimpar = new JButton("LIMPAR");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnLimpar.setToolTipText("Limpar");
		btnLimpar.setBounds(559, 416, 128, 23);
		contentPane.add(btnLimpar);

		JLabel lblN2 = new JLabel("NOTA A2");
		lblN2.setBounds(309, 83, 59, 14);
		contentPane.add(lblN2);

		JLabel lblAluno = new JLabel("NOME DO ALUNO");
		lblAluno.setBounds(21, 11, 214, 14);
		contentPane.add(lblAluno);

		txtAluno = new JTextField();
		txtAluno.setColumns(10);
		txtAluno.setBounds(21, 24, 268, 20);
		contentPane.add(txtAluno);

		txtNotafinal = new JTextField();
		txtNotafinal.setColumns(10);
		txtNotafinal.setBounds(620, 100, 48, 20);
		contentPane.add(txtNotafinal);

		JLabel lblNotafinal = new JLabel("NOTA FINAL");
		lblNotafinal.setBounds(620, 83, 96, 14);
		contentPane.add(lblNotafinal);

		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		layeredPane.setForeground(Color.LIGHT_GRAY);
		layeredPane.setBounds(370, 55, 240, 323);
		contentPane.add(layeredPane);

		txtQuestoes2 = new JTextField();
		txtQuestoes2.setColumns(10);
		txtQuestoes2.setBounds(10, 76, 47, 20);
		layeredPane.add(txtQuestoes2);

		txtAcertos2 = new JTextField();
		txtAcertos2.setColumns(10);
		txtAcertos2.setBounds(92, 76, 47, 20);
		layeredPane.add(txtAcertos2);

		txtN3 = new JTextField();
		txtN3.setColumns(10);
		txtN3.setBounds(178, 76, 47, 20);
		layeredPane.add(txtN3);

		txtQuestoes = new JTextField();
		txtQuestoes.setBounds(10, 45, 47, 20);
		layeredPane.add(txtQuestoes);
		txtQuestoes.setColumns(10);

		JLabel lblQuestoes = new JLabel("Q.QUEST\u00D5ES");
		lblQuestoes.setBounds(10, 23, 71, 14);
		layeredPane.add(lblQuestoes);

		JLabel lblAcertos = new JLabel("Q.ACERTOS");
		lblAcertos.setBounds(92, 23, 73, 14);
		layeredPane.add(lblAcertos);

		JLabel lblN1 = new JLabel("PROVA GLOBALIZADA");
		lblN1.setHorizontalAlignment(SwingConstants.CENTER);
		lblN1.setBounds(10, 0, 220, 14);
		layeredPane.add(lblN1);

		txtAcertos = new JTextField();
		txtAcertos.setBounds(91, 45, 47, 20);
		layeredPane.add(txtAcertos);
		txtAcertos.setColumns(10);

		JLabel lblMedia = new JLabel("NOTA A1");
		lblMedia.setBounds(178, 23, 62, 14);
		layeredPane.add(lblMedia);

		txtN1 = new JTextField();
		txtN1.setBounds(178, 45, 47, 20);
		layeredPane.add(txtN1);
		txtN1.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(10, 107, 48, 20);
		layeredPane.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(10, 138, 48, 20);
		layeredPane.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(10, 169, 48, 20);
		layeredPane.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(10, 200, 48, 20);
		layeredPane.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(10, 231, 48, 20);
		layeredPane.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(10, 262, 48, 20);
		layeredPane.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(10, 292, 48, 20);
		layeredPane.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(92, 107, 47, 20);
		layeredPane.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(92, 138, 47, 20);
		layeredPane.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(92, 169, 47, 20);
		layeredPane.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(92, 200, 47, 20);
		layeredPane.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(92, 231, 47, 20);
		layeredPane.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(92, 262, 47, 20);
		layeredPane.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(92, 292, 47, 20);
		layeredPane.add(textField_27);
		
		txtN5 = new JTextField();
		txtN5.setColumns(10);
		txtN5.setBounds(178, 107, 47, 20);
		layeredPane.add(txtN5);
		
		txtN7 = new JTextField();
		txtN7.setColumns(10);
		txtN7.setBounds(178, 138, 47, 20);
		layeredPane.add(txtN7);
		
		txtN9 = new JTextField();
		txtN9.setColumns(10);
		txtN9.setBounds(178, 169, 47, 20);
		layeredPane.add(txtN9);
		
		txtN11 = new JTextField();
		txtN11.setColumns(10);
		txtN11.setBounds(178, 200, 47, 20);
		layeredPane.add(txtN11);
		
		txtN13 = new JTextField();
		txtN13.setColumns(10);
		txtN13.setBounds(178, 231, 47, 20);
		layeredPane.add(txtN13);
		
		txtN15 = new JTextField();
		txtN15.setColumns(10);
		txtN15.setBounds(178, 262, 47, 20);
		layeredPane.add(txtN15);
		
		txtN17 = new JTextField();
		txtN17.setColumns(10);
		txtN17.setBounds(178, 292, 47, 20);
		layeredPane.add(txtN17);

		txtDiciplina2 = new JTextField();
		txtDiciplina2.setText("FUNDAMENTOS DE SISTEMAS DE INFORMA\u00C7\u00C3O ");
		txtDiciplina2.setColumns(10);
		txtDiciplina2.setBounds(21, 131, 268, 20);
		contentPane.add(txtDiciplina2);

		txtN4 = new JTextField();
		txtN4.setColumns(10);
		txtN4.setBounds(309, 131, 48, 20);
		contentPane.add(txtN4);

		txtNotafinal2 = new JTextField();
		txtNotafinal2.setColumns(10);
		txtNotafinal2.setBounds(620, 131, 48, 20);
		contentPane.add(txtNotafinal2);

		txtAprovado = new JTextField();
		txtAprovado.setColumns(10);
		txtAprovado.setBounds(690, 100, 197, 20);
		contentPane.add(txtAprovado);

		JLabel lblSituação = new JLabel("SITUA\u00C7\u00C3O DE APROVA\u00C7\u00C3O");
		lblSituação.setBounds(715, 83, 145, 14);
		contentPane.add(lblSituação);

		txtAprovado2 = new JTextField();
		txtAprovado2.setColumns(10);
		txtAprovado2.setBounds(690, 131, 197, 20);
		contentPane.add(txtAprovado2);
		
		JButton btnCalculoGlobalizada = new JButton("CALCULO GLOBALIZADA");
		btnCalculoGlobalizada.setToolTipText("Calcular");
		btnCalculoGlobalizada.setBounds(370, 416, 158, 23);
		contentPane.add(btnCalculoGlobalizada);
		
		txtDiciplina3 = new JTextField();
		txtDiciplina3.setText("SISTEMAS OPERACIONAIS ");
		txtDiciplina3.setColumns(10);
		txtDiciplina3.setBounds(21, 162, 268, 20);
		contentPane.add(txtDiciplina3);
		
		txtDiciplina4 = new JTextField();
		txtDiciplina4.setText("ENGENHARIA DE REQUISITOS ");
		txtDiciplina4.setColumns(10);
		txtDiciplina4.setBounds(21, 192, 268, 20);
		contentPane.add(txtDiciplina4);
		
		txtDiciplina5 = new JTextField();
		txtDiciplina5.setText("ORGANIZA\u00C7\u00C3O E ARQUITETURA DE COMPUTADORES ");
		txtDiciplina5.setColumns(10);
		txtDiciplina5.setBounds(21, 223, 268, 20);
		contentPane.add(txtDiciplina5);
		
		txtDiciplina6 = new JTextField();
		txtDiciplina6.setText("APLICA\u00C7\u00D5ES PARA INTERNET");
		txtDiciplina6.setColumns(10);
		txtDiciplina6.setBounds(21, 254, 268, 20);
		contentPane.add(txtDiciplina6);
		
		txtDiciplina7 = new JTextField();
		txtDiciplina7.setText("PROGRAMA\u00C7\u00C3O DE COMPUTADORES");
		txtDiciplina7.setColumns(10);
		txtDiciplina7.setBounds(21, 285, 268, 20);
		contentPane.add(txtDiciplina7);
		
		txtDiciplina8 = new JTextField();
		txtDiciplina8.setText("INTERFACE HUMANO-COMPUTADOR");
		txtDiciplina8.setColumns(10);
		txtDiciplina8.setBounds(21, 316, 268, 20);
		contentPane.add(txtDiciplina8);
		
		txtDiciplina9 = new JTextField();
		txtDiciplina9.setText("MODELAGEM DE NEG\u00D3CIOS");
		txtDiciplina9.setColumns(10);
		txtDiciplina9.setBounds(21, 347, 268, 20);
		contentPane.add(txtDiciplina9);
		
		txtN6 = new JTextField();
		txtN6.setColumns(10);
		txtN6.setBounds(309, 162, 48, 20);
		contentPane.add(txtN6);
		
		txtN8 = new JTextField();
		txtN8.setColumns(10);
		txtN8.setBounds(309, 192, 48, 20);
		contentPane.add(txtN8);
		
		txtN10 = new JTextField();
		txtN10.setColumns(10);
		txtN10.setBounds(309, 223, 48, 20);
		contentPane.add(txtN10);
		
		txtN12 = new JTextField();
		txtN12.setColumns(10);
		txtN12.setBounds(309, 254, 48, 20);
		contentPane.add(txtN12);
		
		txtN14 = new JTextField();
		txtN14.setColumns(10);
		txtN14.setBounds(309, 285, 48, 20);
		contentPane.add(txtN14);
		
		txtN16 = new JTextField();
		txtN16.setColumns(10);
		txtN16.setBounds(309, 316, 48, 20);
		contentPane.add(txtN16);
		
		txtN18 = new JTextField();
		txtN18.setColumns(10);
		txtN18.setBounds(309, 347, 48, 20);
		contentPane.add(txtN18);
		
		txtNotafinal3 = new JTextField();
		txtNotafinal3.setColumns(10);
		txtNotafinal3.setBounds(620, 162, 48, 20);
		contentPane.add(txtNotafinal3);
		
		txtNotafinal4 = new JTextField();
		txtNotafinal4.setColumns(10);
		txtNotafinal4.setBounds(620, 192, 48, 20);
		contentPane.add(txtNotafinal4);
		
		txtNotafinal7 = new JTextField();
		txtNotafinal7.setColumns(10);
		txtNotafinal7.setBounds(620, 285, 48, 20);
		contentPane.add(txtNotafinal7);
		
		txtNotafinal6 = new JTextField();
		txtNotafinal6.setColumns(10);
		txtNotafinal6.setBounds(620, 254, 48, 20);
		contentPane.add(txtNotafinal6);
		
		txtNotafinal5 = new JTextField();
		txtNotafinal5.setColumns(10);
		txtNotafinal5.setBounds(620, 223, 48, 20);
		contentPane.add(txtNotafinal5);
		
		txtNotafinal8 = new JTextField();
		txtNotafinal8.setColumns(10);
		txtNotafinal8.setBounds(620, 316, 48, 20);
		contentPane.add(txtNotafinal8);
		
		txtNotafinal9 = new JTextField();
		txtNotafinal9.setColumns(10);
		txtNotafinal9.setBounds(620, 347, 48, 20);
		contentPane.add(txtNotafinal9);
		
		txtAprovado3 = new JTextField();
		txtAprovado3.setColumns(10);
		txtAprovado3.setBounds(690, 162, 197, 20);
		contentPane.add(txtAprovado3);
		
		txtAprovado4 = new JTextField();
		txtAprovado4.setColumns(10);
		txtAprovado4.setBounds(690, 192, 197, 20);
		contentPane.add(txtAprovado4);
		
		txtAprovado5 = new JTextField();
		txtAprovado5.setColumns(10);
		txtAprovado5.setBounds(690, 223, 197, 20);
		contentPane.add(txtAprovado5);
		
		txtAprovado6 = new JTextField();
		txtAprovado6.setColumns(10);
		txtAprovado6.setBounds(690, 254, 197, 20);
		contentPane.add(txtAprovado6);
		
		txtAprovado7 = new JTextField();
		txtAprovado7.setColumns(10);
		txtAprovado7.setBounds(690, 285, 197, 20);
		contentPane.add(txtAprovado7);
		
		txtAprovado8 = new JTextField();
		txtAprovado8.setColumns(10);
		txtAprovado8.setBounds(690, 316, 197, 20);
		contentPane.add(txtAprovado8);
		
		txtAprovado9 = new JTextField();
		txtAprovado9.setColumns(10);
		txtAprovado9.setBounds(690, 347, 197, 20);
		contentPane.add(txtAprovado9);
		
		txtRgm = new JTextField();
		txtRgm.setColumns(10);
		txtRgm.setBounds(299, 24, 120, 20);
		contentPane.add(txtRgm);
		
		txtCurso = new JTextField();
		txtCurso.setColumns(10);
		txtCurso.setBounds(429, 24, 120, 20);
		contentPane.add(txtCurso);
		
		txtTurma = new JTextField();
		txtTurma.setColumns(10);
		txtTurma.setBounds(559, 24, 120, 20);
		contentPane.add(txtTurma);
		
		lblRgm = new JLabel("RGM");
		lblRgm.setBounds(299, 11, 120, 14);
		contentPane.add(lblRgm);
		
		lblCurso = new JLabel("CURSO");
		lblCurso.setBounds(429, 11, 120, 14);
		contentPane.add(lblCurso);
		
		lblTurma = new JLabel("TURMA");
		lblTurma.setBounds(559, 11, 120, 14);
		contentPane.add(lblTurma);
	}

	// método para calcular a média de notas
	private void calcular() {
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		double media, media2, media3, media4, media5, media6, media7, media8, media9,
		nota1, nota2, nota3, nota4, nota5, nota6, nota7, nota8, nota9,
		nota10, nota11, nota12, nota13, nota14, nota15, nota16, nota17, nota18
		;
		
		nota1 = Double.parseDouble(txtN1.getText().replace(",", "."));
		nota2 = Double.parseDouble(txtN2.getText().replace(",", "."));
		nota3 = Double.parseDouble(txtN4.getText().replace(",", "."));
		nota4 = Double.parseDouble(txtN3.getText().replace(",", "."));
		nota5 = Double.parseDouble(txtN5.getText().replace(",", "."));
		nota6 = Double.parseDouble(txtN6.getText().replace(",", "."));
		nota7 = Double.parseDouble(txtN7.getText().replace(",", "."));
		nota8 = Double.parseDouble(txtN8.getText().replace(",", "."));
		nota9 = Double.parseDouble(txtN9.getText().replace(",", "."));
		nota10 = Double.parseDouble(txtN10.getText().replace(",", "."));
		nota11 = Double.parseDouble(txtN11.getText().replace(",", "."));
		nota12 = Double.parseDouble(txtN12.getText().replace(",", "."));
		nota13 = Double.parseDouble(txtN13.getText().replace(",", "."));	
		nota14 = Double.parseDouble(txtN14.getText().replace(",", "."));
		nota15 = Double.parseDouble(txtN15.getText().replace(",", "."));
		nota16 = Double.parseDouble(txtN16.getText().replace(",", "."));
		nota17 = Double.parseDouble(txtN17.getText().replace(",", "."));
		nota18 = Double.parseDouble(txtN18.getText().replace(",", "."));
		
		media = nota1 + nota2;
		media2 = nota3 + nota4;
		media3 = nota5 + nota6;
		media4 = nota7 + nota8;
		media5 = nota9 + nota10;
		media6 = nota11 + nota12;
		media7 = nota13 + nota14;
		media8 = nota15 + nota16;
		media9 = nota17 + nota18;

		txtNotafinal.setText(formatador.format(media));
		txtNotafinal2.setText(formatador.format(media2));
		txtNotafinal3.setText(formatador.format(media3));
		txtNotafinal4.setText(formatador.format(media4));
		txtNotafinal5.setText(formatador.format(media5));
		txtNotafinal6.setText(formatador.format(media6));
		txtNotafinal7.setText(formatador.format(media7));
		txtNotafinal8.setText(formatador.format(media8));
		txtNotafinal9.setText(formatador.format(media9));

		// materia 1
		if (media >= 0 && media <= 5.99) {
			JOptionPane.showMessageDialog(null, " Aluno(a) :" + txtAluno.getText()
					+ "\n RGM: " + txtRgm.getText()
					+ "\n Curso: " + txtCurso.getText() 
					+ "\n Turma: " + txtTurma.getText()
					+ "\n Sua nota final é de "
					+ txtNotafinal.getText().replace(".", ",") + " pontos !"
					+ "\n Será necessario fazer a prova AF, na disciplina de " + txtDiciplina.getText(), 
					"UNICID - ADS 1B NOITE", JOptionPane.INFORMATION_MESSAGE);txtAprovado.setText("Necessidade de fazer AF");
		} else if (media >= 6 && media <= 10.00) {			
			JOptionPane.showMessageDialog(null,
					"Sua nota final é de : " + txtNotafinal.getText().replace(".", ",")
					+ " pontos na disciplina de :" + txtDiciplina.getText() + " \n " + txtAluno.getText()
					+ " está Aprovado(a) para o proximo semestre!!! Parabéns ", 
					"UNICID - ADS 1B NOITE", JOptionPane.INFORMATION_MESSAGE);txtAprovado.setText("Aprovado");
		}else {
			JOptionPane.showMessageDialog(null, "Digite uma nota valida", "UNICID - ADS 1B NOITE",
					JOptionPane.ERROR_MESSAGE);
		}
				
		// materia 2
		if (media2 >= 0 && media2 <= 5.99) {
			JOptionPane.showMessageDialog(null, " Aluno(a) " + txtAluno.getText() + "\n Sua nota final é de "
					+ txtNotafinal2.getText().replace(".", ",") + " pontos !"
					+ "\n Será necessario fazer a prova AF, na disciplina de " + txtDiciplina2.getText(), 
					"UNICID - ADS 1B NOITE", JOptionPane.INFORMATION_MESSAGE);txtAprovado2.setText("Necessidade de fazer AF");
		} else if (media2 >= 6 && media2 <= 10.00) {			
			JOptionPane.showMessageDialog(null,
					"Sua nota final é de : " + txtNotafinal2.getText().replace(".", ",")
					+ " pontos na disciplina de :" + txtDiciplina2.getText() + " \n " + txtAluno.getText()
					+ " está Aprovado(a) para o proximo semestre!!! Parabéns ", 
					"UNICID - ADS 1B NOITE", JOptionPane.INFORMATION_MESSAGE);txtAprovado2.setText("Aprovado");
		} else {
			JOptionPane.showMessageDialog(null, "Digite uma nota valida", "UNICID - ADS 1B NOITE",
					JOptionPane.ERROR_MESSAGE);
		}

		// materia 3
		if (media3 >= 0 && media3 <= 5.99) {
			JOptionPane.showMessageDialog(null, " Aluno(a) " + txtAluno.getText() + "\n Sua nota final é de "
					+ txtNotafinal3.getText().replace(".", ",") + " pontos !"
					+ "\n Será necessario fazer a prova AF, na disciplina de " + txtDiciplina3.getText(), 
					"UNICID - ADS 1B NOITE", JOptionPane.INFORMATION_MESSAGE);txtAprovado3.setText("Necessidade de fazer AF");
		} else if (media3 >= 6 && media3 <= 10.00) {			
			JOptionPane.showMessageDialog(null,
					"Sua nota final é de : " + txtNotafinal3.getText().replace(".", ",")
					+ " pontos na disciplina de :" + txtDiciplina3.getText() + " \n " + txtAluno.getText()
					+ " está Aprovado(a) para o proximo semestre!!! Parabéns ", 
					"UNICID - ADS 1B NOITE", JOptionPane.INFORMATION_MESSAGE);txtAprovado3.setText("Aprovado");
		} else {
			JOptionPane.showMessageDialog(null, "Digite uma nota valida", "UNICID - ADS 1B NOITE",
					JOptionPane.ERROR_MESSAGE);
		}
								
		// materia 4
		if (media4 >= 0 && media4 <= 5.99) {
			JOptionPane.showMessageDialog(null, " Aluno(a) " + txtAluno.getText() + "\n Sua nota final é de "
					+ txtNotafinal4.getText().replace(".", ",") + " pontos !"
					+ "\n Será necessario fazer a prova AF, na disciplina de " + txtDiciplina4.getText(), 
					"UNICID - ADS 1B NOITE", JOptionPane.INFORMATION_MESSAGE);txtAprovado4.setText("Necessidade de fazer AF");
		} else if (media4 >= 6 && media4 <= 10.00) {			
			JOptionPane.showMessageDialog(null,
					"Sua nota final é de : " + txtNotafinal4.getText().replace(".", ",")
					+ " pontos na disciplina de :" + txtDiciplina4.getText() + " \n " + txtAluno.getText()
					+ " está Aprovado(a) para o proximo semestre!!! Parabéns ", 
					"UNICID - ADS 1B NOITE", JOptionPane.INFORMATION_MESSAGE);txtAprovado4.setText("Aprovado");
		} else {
			JOptionPane.showMessageDialog(null, "Digite uma nota valida", "UNICID - ADS 1B NOITE",
			JOptionPane.ERROR_MESSAGE);
		}

		// materia 5
		if (media5 >= 0 && media5 <= 5.99) {
			JOptionPane.showMessageDialog(null, " Aluno(a) " + txtAluno.getText() + "\n Sua nota final é de "
					+ txtNotafinal5.getText().replace(".", ",") + " pontos !"
					+ "\n Será necessario fazer a prova AF, na disciplina de " + txtDiciplina5.getText(), 
					"UNICID - ADS 1B NOITE", JOptionPane.INFORMATION_MESSAGE);txtAprovado5.setText("Necessidade de fazer AF");
		} else if (media5 >= 6 && media5 <= 10.00) {			
			JOptionPane.showMessageDialog(null,
					"Sua nota final é de : " + txtNotafinal5.getText().replace(".", ",")
					+ " pontos na disciplina de :" + txtDiciplina5.getText() + " \n " + txtAluno.getText()
					+ " está Aprovado(a) para o proximo semestre!!! Parabéns ", 
					"UNICID - ADS 1B NOITE", JOptionPane.INFORMATION_MESSAGE);txtAprovado5.setText("Aprovado");
		}else {
			JOptionPane.showMessageDialog(null, "Digite uma nota valida", "UNICID - ADS 1B NOITE",
					JOptionPane.ERROR_MESSAGE);
		}
				
		// materia 6
		if (media6 >= 0 && media6 <= 5.99) {
			JOptionPane.showMessageDialog(null, " Aluno(a) " + txtAluno.getText() + "\n Sua nota final é de "
					+ txtNotafinal6.getText().replace(".", ",") + " pontos !"
					+ "\n Será necessario fazer a prova AF, na disciplina de " + txtDiciplina6.getText(), 
					"UNICID - ADS 1B NOITE", JOptionPane.INFORMATION_MESSAGE);txtAprovado6.setText("Necessidade de fazer AF");
		} else if (media6 >= 6 && media6 <= 10.00) {			
			JOptionPane.showMessageDialog(null,
					"Sua nota final é de : " + txtNotafinal6.getText().replace(".", ",")
					+ " pontos na disciplina de :" + txtDiciplina6.getText() + " \n " + txtAluno.getText()
					+ " está Aprovado(a) para o proximo semestre!!! Parabéns ", 
					"UNICID - ADS 1B NOITE", JOptionPane.INFORMATION_MESSAGE);txtAprovado6.setText("Aprovado");
		} else {
			JOptionPane.showMessageDialog(null, "Digite uma nota valida", "UNICID - ADS 1B NOITE",
					JOptionPane.ERROR_MESSAGE);
		}

		// materia 7
		if (media7 >= 0 && media7 <= 5.99) {
			JOptionPane.showMessageDialog(null, " Aluno(a) " + txtAluno.getText() + "\n Sua nota final é de "
					+ txtNotafinal7.getText().replace(".", ",") + " pontos !"
					+ "\n Será necessario fazer a prova AF, na disciplina de " + txtDiciplina7.getText(), 
					"UNICID - ADS 1B NOITE", JOptionPane.INFORMATION_MESSAGE);txtAprovado7.setText("Necessidade de fazer AF");
		} else if (media7 >= 6 && media7 <= 10.00) {			
			JOptionPane.showMessageDialog(null,
					"Sua nota final é de : " + txtNotafinal7.getText().replace(".", ",")
					+ " pontos na disciplina de :" + txtDiciplina7.getText() + " \n " + txtAluno.getText()
					+ " está Aprovado(a) para o proximo semestre!!! Parabéns ", 
					"UNICID - ADS 1B NOITE", JOptionPane.INFORMATION_MESSAGE);txtAprovado7.setText("Aprovado");
		} else {
			JOptionPane.showMessageDialog(null, "Digite uma nota valida", "UNICID - ADS 1B NOITE",
					JOptionPane.ERROR_MESSAGE);
		}
								
		// materia 8
		if (media8 >= 0 && media8 <= 5.99) {
			JOptionPane.showMessageDialog(null, " Aluno(a) " + txtAluno.getText() + "\n Sua nota final é de "
					+ txtNotafinal4.getText().replace(".", ",") + " pontos !"
					+ "\n Será necessario fazer a prova AF, na disciplina de " + txtDiciplina8.getText(), 
					"UNICID - ADS 1B NOITE", JOptionPane.INFORMATION_MESSAGE);txtAprovado8.setText("Necessidade de fazer AF");
		} else if (media8 >= 6 && media8 <= 10.00) {			
			JOptionPane.showMessageDialog(null,
					"Sua nota final é de : " + txtNotafinal8.getText().replace(".", ",")
					+ " pontos na disciplina de :" + txtDiciplina8.getText() + " \n " + txtAluno.getText()
					+ " está Aprovado(a) para o proximo semestre!!! Parabéns ", 
					"UNICID - ADS 1B NOITE", JOptionPane.INFORMATION_MESSAGE);txtAprovado8.setText("Aprovado");
		} else {
			JOptionPane.showMessageDialog(null, "Digite uma nota valida", "UNICID - ADS 1B NOITE",
			JOptionPane.ERROR_MESSAGE);
		}
	
		// materia 9
		if (media9 >= 0 && media9 <= 5.99) {
			JOptionPane.showMessageDialog(null, " Aluno(a) " + txtAluno.getText() + "\n Sua nota final é de "
					+ txtNotafinal9.getText().replace(".", ",") + " pontos !"
					+ "\n Será necessario fazer a prova AF, na disciplina de " + txtDiciplina9.getText(), 
					"UNICID - ADS 1B NOITE", JOptionPane.INFORMATION_MESSAGE);txtAprovado9.setText("Necessidade de fazer AF");
		} else if (media9 >= 6 && media9 <= 10.00) {			
			JOptionPane.showMessageDialog(null,
					"Sua nota final é de : " + txtNotafinal9.getText().replace(".", ",")
					+ " pontos na disciplina de :" + txtDiciplina9.getText() + " \n " + txtAluno.getText()
					+ " está Aprovado(a) para o proximo semestre!!! Parabéns ", 
					"UNICID - ADS 1B NOITE", JOptionPane.INFORMATION_MESSAGE);txtAprovado9.setText("Aprovado");
		} else {
			JOptionPane.showMessageDialog(null, "Digite uma nota valida", "UNICID - ADS 1B NOITE",
			JOptionPane.ERROR_MESSAGE);
		}
				
	}

	// método para limpar
	private void limpar() {
		txtAluno.setText(null);
		txtRgm.setText(null);
		txtCurso.setText(null);
		txtTurma.setText(null);
		txtN1.setText(null);
		txtN2.setText(null);
		txtN3.setText(null);
		txtN4.setText(null);
		txtN5.setText(null);
		txtN6.setText(null);
		txtN7.setText(null);
		txtN8.setText(null);
		txtN9.setText(null);
		txtN10.setText(null);
		txtN11.setText(null);
		txtN12.setText(null);
		txtN13.setText(null);
		txtN14.setText(null);
		txtN15.setText(null);
		txtN16.setText(null);
		txtN17.setText(null);
		txtN18.setText(null);
		txtDiciplina.setText(null);
		txtDiciplina2.setText(null);
		txtDiciplina3.setText(null);
		txtDiciplina4.setText(null);
		txtDiciplina5.setText(null);
		txtDiciplina6.setText(null);
		txtDiciplina7.setText(null);
		txtDiciplina8.setText(null);
		txtDiciplina9.setText(null);
		txtNotafinal.setText(null);
		txtNotafinal2.setText(null);
		txtNotafinal3.setText(null);
		txtNotafinal4.setText(null);
		txtNotafinal5.setText(null);
		txtNotafinal6.setText(null);
		txtNotafinal7.setText(null);
		txtNotafinal8.setText(null);
		txtNotafinal9.setText(null);
		txtAprovado.setText(null);
		txtAprovado2.setText(null);
		txtAprovado3.setText(null);
		txtAprovado4.setText(null);
		txtAprovado5.setText(null);
		txtAprovado6.setText(null);
		txtAprovado7.setText(null);
		txtAprovado8.setText(null);
		txtAprovado9.setText(null);
	}
}
