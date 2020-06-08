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
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;

import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.JavaBean;
import java.awt.Dimension;
import java.awt.Component;
import javax.swing.DropMode;

public class NotaFinal extends JFrame {

	private JPanel contentPane;
	private JTextField txtN2;
	private JTextField txtDiciplina;
	private JButton btnLimpar;
	private JTextField txtAluno;
	private JTextField txtN1;
	private JTextField txtNotafinal;
	private JTextField txtDiciplina2;
	private JTextField txtN4;
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
	private JButton btnMenu;

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
	 * Create the frame. metodo construtor (linhas de codigo que criam os frames)
	 */
	public NotaFinal() {
		setBackground(Color.LIGHT_GRAY);
		setFont(new Font("Calibri", Font.BOLD, 14));
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(NotaFinal.class.getResource("/icones/calculadora.png")));
		setTitle("C\u00C1LCULO DE NOTAS - UNIVERSIDADE X");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 833, 516);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblDisciplina = new JLabel("DISCIPLINA ");
		lblDisciplina.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		lblDisciplina.setHorizontalTextPosition(SwingConstants.LEADING);
		lblDisciplina.setVerticalAlignment(SwingConstants.TOP);
		lblDisciplina.setVerticalTextPosition(SwingConstants.TOP);
		lblDisciplina.setFont(new Font("Calibri", Font.BOLD, 12));
		lblDisciplina.setToolTipText("Nome das disciplinas que foram realizadas no semestre atual");
		lblDisciplina.setBounds(21, 110, 299, 14);
		contentPane.add(lblDisciplina);

		txtN2 = new JTextField();
		txtN2.setFont(new Font("Arial", Font.BOLD, 12));
		txtN2.setBounds(430, 127, 48, 20);
		contentPane.add(txtN2);
		txtN2.setColumns(10);

		txtDiciplina = new JTextField();
		txtDiciplina.setFont(new Font("Arial", Font.BOLD, 12));
		txtDiciplina.setText("LINGUA PORTUGUESA ");
		txtDiciplina.setBounds(21, 127, 299, 20);
		contentPane.add(txtDiciplina);
		txtDiciplina.setColumns(10);

		JButton btnCalcular = new JButton("RESULTADO");
		btnCalcular.setFont(new Font("Arial", Font.BOLD, 12));
		btnCalcular.addActionListener(new ActionListener() {
			// evento "clicar" no botão, este metodo faz o calculo
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		btnCalcular.setToolTipText("Calcular e ver resultado final");
		btnCalcular.setBounds(646, 438, 154, 23);
		contentPane.add(btnCalcular);

		JButton btnLimpar = new JButton("LIMPAR");
		btnLimpar.setFont(new Font("Arial", Font.BOLD, 12));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnLimpar.setToolTipText("Limpar todos os campos");
		btnLimpar.setBounds(482, 438, 154, 23);
		contentPane.add(btnLimpar);

		JLabel lblN2 = new JLabel("NOTA A2");
		lblN2.setFont(new Font("Calibri", Font.BOLD, 12));
		lblN2.setToolTipText("Nota de atividades e provas realizadas");
		lblN2.setHorizontalAlignment(SwingConstants.CENTER);
		lblN2.setBounds(415, 110, 74, 14);
		contentPane.add(lblN2);

		JLabel lblAluno = new JLabel("NOME DO ALUNO");
		lblAluno.setFont(new Font("Calibri", Font.BOLD, 12));
		lblAluno.setToolTipText("Coloque seu nome");
		lblAluno.setBounds(21, 11, 214, 14);
		contentPane.add(lblAluno);

		txtAluno = new JTextField();
		txtAluno.setFont(new Font("Arial", Font.BOLD, 12));
		txtAluno.setColumns(10);
		txtAluno.setBounds(21, 24, 299, 20);
		contentPane.add(txtAluno);

		txtNotafinal = new JTextField();
		txtNotafinal.setFont(new Font("Arial", Font.BOLD, 12));
		txtNotafinal.setColumns(10);
		txtNotafinal.setBounds(507, 127, 48, 20);
		contentPane.add(txtNotafinal);

		JLabel lblNotafinal = new JLabel("NOTA FINAL");
		lblNotafinal.setFont(new Font("Calibri", Font.BOLD, 12));
		lblNotafinal.setToolTipText("Nota final");
		lblNotafinal.setHorizontalAlignment(SwingConstants.CENTER);
		lblNotafinal.setBounds(490, 110, 81, 14);
		contentPane.add(lblNotafinal);

		txtDiciplina2 = new JTextField();
		txtDiciplina2.setFont(new Font("Arial", Font.BOLD, 12));
		txtDiciplina2.setText("FUNDAMENTOS DE SISTEMAS DE INFORMA\u00C7\u00C3O ");
		txtDiciplina2.setColumns(10);
		txtDiciplina2.setBounds(21, 158, 299, 20);
		contentPane.add(txtDiciplina2);

		txtN4 = new JTextField();
		txtN4.setFont(new Font("Arial", Font.BOLD, 12));
		txtN4.setColumns(10);
		txtN4.setBounds(430, 158, 48, 20);
		contentPane.add(txtN4);

		txtNotafinal2 = new JTextField();
		txtNotafinal2.setFont(new Font("Arial", Font.BOLD, 12));
		txtNotafinal2.setColumns(10);
		txtNotafinal2.setBounds(507, 158, 48, 20);
		contentPane.add(txtNotafinal2);

		txtAprovado = new JTextField();
		txtAprovado.setFont(new Font("Arial", Font.BOLD, 12));
		txtAprovado.setColumns(10);
		txtAprovado.setBounds(586, 127, 214, 20);
		contentPane.add(txtAprovado);

		JLabel lblSituacao = new JLabel("SITUA\u00C7\u00C3O DE APROVA\u00C7\u00C3O");
		lblSituacao.setVerticalAlignment(SwingConstants.BOTTOM);
		lblSituacao.setFont(new Font("Calibri", Font.BOLD, 12));
		lblSituacao.setToolTipText("Aqui \u00E9 mostrado qual a situa\u00E7\u00E3o do aluno referente a disciplina ");
		lblSituacao.setBounds(586, 102, 198, 23);
		contentPane.add(lblSituacao);

		txtAprovado2 = new JTextField();
		txtAprovado2.setFont(new Font("Arial", Font.BOLD, 12));
		txtAprovado2.setColumns(10);
		txtAprovado2.setBounds(586, 158, 214, 20);
		contentPane.add(txtAprovado2);

		txtDiciplina3 = new JTextField();
		txtDiciplina3.setFont(new Font("Arial", Font.BOLD, 12));
		txtDiciplina3.setText("SISTEMAS OPERACIONAIS ");
		txtDiciplina3.setColumns(10);
		txtDiciplina3.setBounds(21, 189, 299, 20);
		contentPane.add(txtDiciplina3);

		txtDiciplina4 = new JTextField();
		txtDiciplina4.setFont(new Font("Arial", Font.BOLD, 12));
		txtDiciplina4.setText("ENGENHARIA DE REQUISITOS ");
		txtDiciplina4.setColumns(10);
		txtDiciplina4.setBounds(21, 219, 299, 20);
		contentPane.add(txtDiciplina4);

		txtDiciplina5 = new JTextField();
		txtDiciplina5.setFont(new Font("Arial", Font.BOLD, 12));
		txtDiciplina5.setText("ORGANIZA\u00C7\u00C3O E ARQUITETURA DE COMPUTADORES ");
		txtDiciplina5.setColumns(10);
		txtDiciplina5.setBounds(21, 250, 299, 20);
		contentPane.add(txtDiciplina5);

		txtDiciplina6 = new JTextField();
		txtDiciplina6.setFont(new Font("Arial", Font.BOLD, 12));
		txtDiciplina6.setText("APLICA\u00C7\u00D5ES PARA INTERNET");
		txtDiciplina6.setColumns(10);
		txtDiciplina6.setBounds(21, 281, 299, 20);
		contentPane.add(txtDiciplina6);

		txtDiciplina7 = new JTextField();
		txtDiciplina7.setFont(new Font("Arial", Font.BOLD, 12));
		txtDiciplina7.setText("PROGRAMA\u00C7\u00C3O DE COMPUTADORES");
		txtDiciplina7.setColumns(10);
		txtDiciplina7.setBounds(21, 312, 299, 20);
		contentPane.add(txtDiciplina7);

		txtDiciplina8 = new JTextField();
		txtDiciplina8.setFont(new Font("Arial", Font.BOLD, 12));
		txtDiciplina8.setText("INTERFACE HUMANO-COMPUTADOR");
		txtDiciplina8.setColumns(10);
		txtDiciplina8.setBounds(21, 343, 299, 20);
		contentPane.add(txtDiciplina8);

		txtDiciplina9 = new JTextField();
		txtDiciplina9.setFont(new Font("Arial", Font.BOLD, 12));
		txtDiciplina9.setText("MODELAGEM DE NEG\u00D3CIOS");
		txtDiciplina9.setColumns(10);
		txtDiciplina9.setBounds(21, 374, 299, 20);
		contentPane.add(txtDiciplina9);

		txtN6 = new JTextField();
		txtN6.setFont(new Font("Arial", Font.BOLD, 12));
		txtN6.setColumns(10);
		txtN6.setBounds(430, 189, 48, 20);
		contentPane.add(txtN6);

		txtN8 = new JTextField();
		txtN8.setFont(new Font("Arial", Font.BOLD, 12));
		txtN8.setColumns(10);
		txtN8.setBounds(430, 219, 48, 20);
		contentPane.add(txtN8);

		txtN10 = new JTextField();
		txtN10.setFont(new Font("Arial", Font.BOLD, 12));
		txtN10.setColumns(10);
		txtN10.setBounds(430, 250, 48, 20);
		contentPane.add(txtN10);

		txtN12 = new JTextField();
		txtN12.setFont(new Font("Arial", Font.BOLD, 12));
		txtN12.setColumns(10);
		txtN12.setBounds(430, 281, 48, 20);
		contentPane.add(txtN12);

		txtN14 = new JTextField();
		txtN14.setFont(new Font("Arial", Font.BOLD, 12));
		txtN14.setColumns(10);
		txtN14.setBounds(430, 312, 48, 20);
		contentPane.add(txtN14);

		txtN16 = new JTextField();
		txtN16.setFont(new Font("Arial", Font.BOLD, 12));
		txtN16.setColumns(10);
		txtN16.setBounds(430, 343, 48, 20);
		contentPane.add(txtN16);

		txtN18 = new JTextField();
		txtN18.setFont(new Font("Arial", Font.BOLD, 12));
		txtN18.setColumns(10);
		txtN18.setBounds(430, 374, 48, 20);
		contentPane.add(txtN18);

		txtNotafinal3 = new JTextField();
		txtNotafinal3.setFont(new Font("Arial", Font.BOLD, 12));
		txtNotafinal3.setColumns(10);
		txtNotafinal3.setBounds(507, 189, 48, 20);
		contentPane.add(txtNotafinal3);

		txtNotafinal4 = new JTextField();
		txtNotafinal4.setFont(new Font("Arial", Font.BOLD, 12));
		txtNotafinal4.setColumns(10);
		txtNotafinal4.setBounds(507, 219, 48, 20);
		contentPane.add(txtNotafinal4);

		txtNotafinal7 = new JTextField();
		txtNotafinal7.setFont(new Font("Arial", Font.BOLD, 12));
		txtNotafinal7.setColumns(10);
		txtNotafinal7.setBounds(507, 312, 48, 20);
		contentPane.add(txtNotafinal7);

		txtNotafinal6 = new JTextField();
		txtNotafinal6.setFont(new Font("Arial", Font.BOLD, 12));
		txtNotafinal6.setColumns(10);
		txtNotafinal6.setBounds(507, 281, 48, 20);
		contentPane.add(txtNotafinal6);

		txtNotafinal5 = new JTextField();
		txtNotafinal5.setFont(new Font("Arial", Font.BOLD, 12));
		txtNotafinal5.setColumns(10);
		txtNotafinal5.setBounds(507, 250, 48, 20);
		contentPane.add(txtNotafinal5);

		txtNotafinal8 = new JTextField();
		txtNotafinal8.setFont(new Font("Arial", Font.BOLD, 12));
		txtNotafinal8.setColumns(10);
		txtNotafinal8.setBounds(507, 343, 48, 20);
		contentPane.add(txtNotafinal8);

		txtNotafinal9 = new JTextField();
		txtNotafinal9.setFont(new Font("Arial", Font.BOLD, 12));
		txtNotafinal9.setColumns(10);
		txtNotafinal9.setBounds(507, 374, 48, 20);
		contentPane.add(txtNotafinal9);

		txtAprovado3 = new JTextField();
		txtAprovado3.setFont(new Font("Arial", Font.BOLD, 12));
		txtAprovado3.setColumns(10);
		txtAprovado3.setBounds(586, 189, 214, 20);
		contentPane.add(txtAprovado3);

		txtAprovado4 = new JTextField();
		txtAprovado4.setFont(new Font("Arial", Font.BOLD, 12));
		txtAprovado4.setColumns(10);
		txtAprovado4.setBounds(586, 219, 214, 20);
		contentPane.add(txtAprovado4);

		txtAprovado5 = new JTextField();
		txtAprovado5.setFont(new Font("Arial", Font.BOLD, 12));
		txtAprovado5.setColumns(10);
		txtAprovado5.setBounds(586, 250, 214, 20);
		contentPane.add(txtAprovado5);

		txtAprovado6 = new JTextField();
		txtAprovado6.setFont(new Font("Arial", Font.BOLD, 12));
		txtAprovado6.setColumns(10);
		txtAprovado6.setBounds(586, 281, 214, 20);
		contentPane.add(txtAprovado6);

		txtAprovado7 = new JTextField();
		txtAprovado7.setFont(new Font("Arial", Font.BOLD, 12));
		txtAprovado7.setColumns(10);
		txtAprovado7.setBounds(586, 312, 214, 20);
		contentPane.add(txtAprovado7);

		txtAprovado8 = new JTextField();
		txtAprovado8.setFont(new Font("Arial", Font.BOLD, 12));
		txtAprovado8.setColumns(10);
		txtAprovado8.setBounds(586, 343, 214, 20);
		contentPane.add(txtAprovado8);

		txtAprovado9 = new JTextField();
		txtAprovado9.setFont(new Font("Arial", Font.BOLD, 12));
		txtAprovado9.setColumns(10);
		txtAprovado9.setBounds(586, 374, 214, 20);
		contentPane.add(txtAprovado9);

		txtRgm = new JTextField();
		txtRgm.setFont(new Font("Arial", Font.BOLD, 12));
		txtRgm.setColumns(10);
		txtRgm.setBounds(353, 24, 125, 20);
		contentPane.add(txtRgm);

		txtCurso = new JTextField();
		txtCurso.setText("AN\u00C1LISE E DESENVOLVIMENTO DE SISTEMAS");
		txtCurso.setFont(new Font("Arial", Font.BOLD, 12));
		txtCurso.setColumns(10);
		txtCurso.setBounds(507, 24, 293, 20);
		contentPane.add(txtCurso);

		txtTurma = new JTextField();
		txtTurma.setText("1B");
		txtTurma.setFont(new Font("Arial", Font.BOLD, 12));
		txtTurma.setColumns(10);
		txtTurma.setBounds(21, 66, 86, 20);
		contentPane.add(txtTurma);

		lblRgm = new JLabel("RGM");
		lblRgm.setFont(new Font("Calibri", Font.BOLD, 12));
		lblRgm.setToolTipText("Digite seu Registro geral de matricula");
		lblRgm.setBounds(353, 11, 120, 14);
		contentPane.add(lblRgm);

		lblCurso = new JLabel("CURSO");
		lblCurso.setFont(new Font("Calibri", Font.BOLD, 12));
		lblCurso.setToolTipText("Curso atual");
		lblCurso.setBounds(507, 11, 120, 14);
		contentPane.add(lblCurso);

		lblTurma = new JLabel("TURMA");
		lblTurma.setFont(new Font("Calibri", Font.BOLD, 12));
		lblTurma.setToolTipText("Turma atual");
		lblTurma.setBounds(21, 53, 120, 14);
		contentPane.add(lblTurma);

		txtN3 = new JTextField();
		txtN3.setFont(new Font("Arial", Font.BOLD, 12));
		txtN3.setBounds(353, 158, 47, 20);
		contentPane.add(txtN3);
		txtN3.setColumns(10);

		txtN1 = new JTextField();
		txtN1.setFont(new Font("Arial", Font.BOLD, 12));
		txtN1.setBounds(353, 127, 47, 20);
		contentPane.add(txtN1);
		txtN1.setColumns(10);

		txtN5 = new JTextField();
		txtN5.setFont(new Font("Arial", Font.BOLD, 12));
		txtN5.setBounds(353, 189, 47, 20);
		contentPane.add(txtN5);
		txtN5.setColumns(10);

		txtN7 = new JTextField();
		txtN7.setFont(new Font("Arial", Font.BOLD, 12));
		txtN7.setBounds(353, 220, 47, 20);
		contentPane.add(txtN7);
		txtN7.setColumns(10);

		txtN9 = new JTextField();
		txtN9.setFont(new Font("Arial", Font.BOLD, 12));
		txtN9.setBounds(353, 251, 47, 20);
		contentPane.add(txtN9);
		txtN9.setColumns(10);

		txtN11 = new JTextField();
		txtN11.setFont(new Font("Arial", Font.BOLD, 12));
		txtN11.setBounds(353, 282, 47, 20);
		contentPane.add(txtN11);
		txtN11.setColumns(10);

		txtN13 = new JTextField();
		txtN13.setFont(new Font("Arial", Font.BOLD, 12));
		txtN13.setBounds(353, 313, 47, 20);
		contentPane.add(txtN13);
		txtN13.setColumns(10);

		txtN15 = new JTextField();
		txtN15.setFont(new Font("Arial", Font.BOLD, 12));
		txtN15.setBounds(353, 344, 47, 20);
		contentPane.add(txtN15);
		txtN15.setColumns(10);

		txtN17 = new JTextField();
		txtN17.setFont(new Font("Arial", Font.BOLD, 12));
		txtN17.setBounds(353, 374, 47, 20);
		contentPane.add(txtN17);
		txtN17.setColumns(10);

		JLabel lblMedia = new JLabel("NOTA A1");
		lblMedia.setFont(new Font("Calibri", Font.BOLD, 12));
		lblMedia.setToolTipText("Nota referente a prova globalizada");
		lblMedia.setHorizontalAlignment(SwingConstants.CENTER);
		lblMedia.setBounds(341, 110, 74, 14);
		contentPane.add(lblMedia);

		JLabel lblNewLabel = new JLabel("DEVELOPED BY ANDR\u00C9 CARVALHO ");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 12));
		lblNewLabel.setToolTipText("");
		lblNewLabel.setBounds(21, 441, 249, 20);
		contentPane.add(lblNewLabel);
		
		btnMenu = new JButton("MENU");
		btnMenu.setEnabled(false);
		btnMenu.setToolTipText("Retorna ao menu anterior ");
		btnMenu.setFont(new Font("Arial", Font.BOLD, 12));
		btnMenu.setBounds(316, 438, 154, 23);
		contentPane.add(btnMenu);
	}// fim do construtor (parte de frames)

	// método para calcular a média de notas
	private void calcular() {
		DecimalFormat formatador = new DecimalFormat("0.00");

		// tipo da variavel
		double media, media2, media3, media4, media5, media6, media7, media8, media9, nota1, nota2, nota3, nota4, nota5,
		nota6, nota7, nota8, nota9, nota10, nota11, nota12, nota13, nota14, nota15, nota16, nota17, nota18;

		// atribuição da label text para a variavel, com substituição do ponto para
		// virgula
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

		// calculo de duas variaveis para atribuir resultado para outra
		media = nota1 + nota2;
		media2 = nota3 + nota4;
		media3 = nota5 + nota6;
		media4 = nota7 + nota8;
		media5 = nota9 + nota10;
		media6 = nota11 + nota12;
		media7 = nota13 + nota14;
		media8 = nota15 + nota16;
		media9 = nota17 + nota18;

		// formatar para valor exibido na label text receber numero real
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
			JOptionPane.showMessageDialog(null,
					" Aluno(a) :" + txtAluno.getText() + "\n RGM: " + txtRgm.getText() + "\n Curso: "
							+ txtCurso.getText() + "\n Turma: " + txtTurma.getText() + "\n Sua nota final é de "
							+ txtNotafinal.getText().replace(".", ",") + " pontos !"
							+ "\n Será necessario fazer a prova AF, na disciplina de " + txtDiciplina.getText(),
					"UNIVERSIDADE X - ADS 1B NOITE", JOptionPane.INFORMATION_MESSAGE);
			txtAprovado.setText("Necessidade de fazer AF");
		} else if (media >= 6 && media <= 10.00) {
			JOptionPane.showMessageDialog(null,
					" Aluno(a) :" + txtAluno.getText() + "\n RGM: " + txtRgm.getText() + "\n Curso: "
							+ txtCurso.getText() + "\n Turma: " + txtTurma.getText() + "\n Sua nota final é de "
							+ txtNotafinal.getText().replace(".", ",") + " pontos !"
							+ "\n Aprovado(a) para o proximo semestre, na disciplina de " + txtDiciplina.getText(),
					"UNIVERSIDADE X - ADS 1B NOITE", JOptionPane.INFORMATION_MESSAGE);
			txtAprovado.setText("Aprovado");
		} else {
			JOptionPane.showMessageDialog(null, "Digite uma nota valida", "UNIVERSIDADE X - ADS 1B NOITE",
					JOptionPane.ERROR_MESSAGE);
		}

		// materia 2
		if (media2 >= 0 && media2 <= 5.99) {
			JOptionPane.showMessageDialog(null,
					" Aluno(a) :" + txtAluno.getText() + "\n RGM: " + txtRgm.getText() + "\n Curso: "
							+ txtCurso.getText() + "\n Turma: " + txtTurma.getText() + "\n Sua nota final é de "
							+ txtNotafinal2.getText().replace(".", ",") + " pontos !"
							+ "\n Será necessario fazer a prova AF, na disciplina de " + txtDiciplina2.getText(),
					"UNIVERSIDADE X - ADS 1B NOITE", JOptionPane.INFORMATION_MESSAGE);
			txtAprovado2.setText("Necessidade de fazer AF");
		} else if (media2 >= 6 && media2 <= 10.00) {
			JOptionPane.showMessageDialog(null,
					" Aluno(a) :" + txtAluno.getText() + "\n RGM: " + txtRgm.getText() + "\n Curso: "
							+ txtCurso.getText() + "\n Turma: " + txtTurma.getText() + "\n Sua nota final é de "
							+ txtNotafinal2.getText().replace(".", ",") + " pontos !"
							+ "\n Aprovado(a) para o proximo semestre, na disciplina de " + txtDiciplina2.getText(),
					"UNIVERSIDADE X - ADS 1B NOITE", JOptionPane.INFORMATION_MESSAGE);
			txtAprovado2.setText("Aprovado");
		} else {
			JOptionPane.showMessageDialog(null, "Digite uma nota valida", "UNIVERSIDADE X - ADS 1B NOITE",
					JOptionPane.ERROR_MESSAGE);
		}

		// materia 3
		if (media3 >= 0 && media3 <= 5.99) {
			JOptionPane.showMessageDialog(null,
					" Aluno(a) :" + txtAluno.getText() + "\n RGM: " + txtRgm.getText() + "\n Curso: "
							+ txtCurso.getText() + "\n Turma: " + txtTurma.getText() + "\n Sua nota final é de "
							+ txtNotafinal3.getText().replace(".", ",") + " pontos !"
							+ "\n Será necessario fazer a prova AF, na disciplina de " + txtDiciplina3.getText(),
					"UNIVERSIDADE X - ADS 1B NOITE", JOptionPane.INFORMATION_MESSAGE);
			txtAprovado3.setText("Necessidade de fazer AF");
		} else if (media3 >= 6 && media3 <= 10.00) {
			JOptionPane.showMessageDialog(null,
					" Aluno(a) :" + txtAluno.getText() + "\n RGM: " + txtRgm.getText() + "\n Curso: "
							+ txtCurso.getText() + "\n Turma: " + txtTurma.getText() + "\n Sua nota final é de "
							+ txtNotafinal3.getText().replace(".", ",") + " pontos !"
							+ "\n Aprovado(a) para o proximo semestre, na disciplina de " + txtDiciplina3.getText(),
					"UNIVERSIDADE X - ADS 1B NOITE", JOptionPane.INFORMATION_MESSAGE);
			txtAprovado3.setText("Aprovado");
		} else {
			JOptionPane.showMessageDialog(null, "Digite uma nota valida", "UNIVERSIDADE X - ADS 1B NOITE",
					JOptionPane.ERROR_MESSAGE);
		}

		// materia 4
		if (media4 >= 0 && media4 <= 5.99) {
			JOptionPane.showMessageDialog(null,
					" Aluno(a) :" + txtAluno.getText() + "\n RGM: " + txtRgm.getText() + "\n Curso: "
							+ txtCurso.getText() + "\n Turma: " + txtTurma.getText() + "\n Sua nota final é de "
							+ txtNotafinal4.getText().replace(".", ",") + " pontos !"
							+ "\n Será necessario fazer a prova AF, na disciplina de " + txtDiciplina4.getText(),
					"UNIVERSIDADE X - ADS 1B NOITE", JOptionPane.INFORMATION_MESSAGE);
			txtAprovado4.setText("Necessidade de fazer AF");
		} else if (media4 >= 6 && media4 <= 10.00) {
			JOptionPane.showMessageDialog(null,
					" Aluno(a) :" + txtAluno.getText() + "\n RGM: " + txtRgm.getText() + "\n Curso: "
							+ txtCurso.getText() + "\n Turma: " + txtTurma.getText() + "\n Sua nota final é de "
							+ txtNotafinal4.getText().replace(".", ",") + " pontos !"
							+ "\n Aprovado(a) para o proximo semestre, na disciplina de " + txtDiciplina4.getText(),
					"UNIVERSIDADE X - ADS 1B NOITE", JOptionPane.INFORMATION_MESSAGE);
			txtAprovado4.setText("Aprovado");
		} else {
			JOptionPane.showMessageDialog(null, "Digite uma nota valida", "UNIVERSIDADE X - ADS 1B NOITE",
					JOptionPane.ERROR_MESSAGE);
		}

		// materia 5
		if (media5 >= 0 && media5 <= 5.99) {
			JOptionPane.showMessageDialog(null,
					" Aluno(a) :" + txtAluno.getText() + "\n RGM: " + txtRgm.getText() + "\n Curso: "
							+ txtCurso.getText() + "\n Turma: " + txtTurma.getText() + "\n Sua nota final é de "
							+ txtNotafinal5.getText().replace(".", ",") + " pontos !"
							+ "\n Será necessario fazer a prova AF, na disciplina de " + txtDiciplina5.getText(),
					"UNIVERSIDADE X - ADS 1B NOITE", JOptionPane.INFORMATION_MESSAGE);
			txtAprovado5.setText("Necessidade de fazer AF");
		} else if (media5 >= 6 && media5 <= 10.00) {
			JOptionPane.showMessageDialog(null,
					" Aluno(a) :" + txtAluno.getText() + "\n RGM: " + txtRgm.getText() + "\n Curso: "
							+ txtCurso.getText() + "\n Turma: " + txtTurma.getText() + "\n Sua nota final é de "
							+ txtNotafinal5.getText().replace(".", ",") + " pontos !"
							+ "\n Aprovado(a) para o proximo semestre, na disciplina de " + txtDiciplina5.getText(),
					"UNIVERSIDADE X - ADS 1B NOITE", JOptionPane.INFORMATION_MESSAGE);
			txtAprovado5.setText("Aprovado");
		} else {
			JOptionPane.showMessageDialog(null, "Digite uma nota valida", "UNIVERSIDADE X - ADS 1B NOITE",
					JOptionPane.ERROR_MESSAGE);
		}

		// materia 6
		if (media6 >= 0 && media6 <= 5.99) {
			JOptionPane.showMessageDialog(null,
					" Aluno(a) :" + txtAluno.getText() + "\n RGM: " + txtRgm.getText() + "\n Curso: "
							+ txtCurso.getText() + "\n Turma: " + txtTurma.getText() + "\n Sua nota final é de "
							+ txtNotafinal6.getText().replace(".", ",") + " pontos !"
							+ "\n Será necessario fazer a prova AF, na disciplina de " + txtDiciplina6.getText(),
					"UNIVERSIDADE X - ADS 1B NOITE", JOptionPane.INFORMATION_MESSAGE);
			txtAprovado6.setText("Necessidade de fazer AF");
		} else if (media6 >= 6 && media6 <= 10.00) {
			JOptionPane.showMessageDialog(null,
					" Aluno(a) :" + txtAluno.getText() + "\n RGM: " + txtRgm.getText() + "\n Curso: "
							+ txtCurso.getText() + "\n Turma: " + txtTurma.getText() + "\n Sua nota final é de "
							+ txtNotafinal6.getText().replace(".", ",") + " pontos !"
							+ "\n Aprovado(a) para o proximo semestre, na disciplina de " + txtDiciplina6.getText(),
					"UNIVERSIDADE X - ADS 1B NOITE", JOptionPane.INFORMATION_MESSAGE);
			txtAprovado6.setText("Aprovado");
		} else {
			JOptionPane.showMessageDialog(null, "Digite uma nota valida", "UNIVERSIDADE X - ADS 1B NOITE",
					JOptionPane.ERROR_MESSAGE);
		}

		// materia 7
		if (media7 >= 0 && media7 <= 5.99) {
			JOptionPane.showMessageDialog(null,
					" Aluno(a) :" + txtAluno.getText() + "\n RGM: " + txtRgm.getText() + "\n Curso: "
							+ txtCurso.getText() + "\n Turma: " + txtTurma.getText() + "\n Sua nota final é de "
							+ txtNotafinal7.getText().replace(".", ",") + " pontos !"
							+ "\n Será necessario fazer a prova AF, na disciplina de " + txtDiciplina7.getText(),
					"UNIVERSIDADE X - ADS 1B NOITE", JOptionPane.INFORMATION_MESSAGE);
			txtAprovado7.setText("Necessidade de fazer AF");
		} else if (media7 >= 6 && media7 <= 10.00) {
			JOptionPane.showMessageDialog(null,
					" Aluno(a) :" + txtAluno.getText() + "\n RGM: " + txtRgm.getText() + "\n Curso: "
							+ txtCurso.getText() + "\n Turma: " + txtTurma.getText() + "\n Sua nota final é de "
							+ txtNotafinal7.getText().replace(".", ",") + " pontos !"
							+ "\n Aprovado(a) para o proximo semestre, na disciplina de " + txtDiciplina7.getText(),
					"UNIVERSIDADE X - ADS 1B NOITE", JOptionPane.INFORMATION_MESSAGE);
			txtAprovado7.setText("Aprovado");
		} else {
			JOptionPane.showMessageDialog(null, "Digite uma nota valida", "UNIVERSIDADE X - ADS 1B NOITE",
					JOptionPane.ERROR_MESSAGE);
		}

		// materia 8
		if (media8 >= 0 && media8 <= 5.99) {
			JOptionPane.showMessageDialog(null,
					" Aluno(a) :" + txtAluno.getText() + "\n RGM: " + txtRgm.getText() + "\n Curso: "
							+ txtCurso.getText() + "\n Turma: " + txtTurma.getText() + "\n Sua nota final é de "
							+ txtNotafinal8.getText().replace(".", ",") + " pontos !"
							+ "\n Será necessario fazer a prova AF, na disciplina de " + txtDiciplina8.getText(),
					"UNIVERSIDADE X - ADS 1B NOITE", JOptionPane.INFORMATION_MESSAGE);
			txtAprovado8.setText("Necessidade de fazer AF");
		} else if (media8 >= 6 && media8 <= 10.00) {
			JOptionPane.showMessageDialog(null,
					" Aluno(a) :" + txtAluno.getText() + "\n RGM: " + txtRgm.getText() + "\n Curso: "
							+ txtCurso.getText() + "\n Turma: " + txtTurma.getText() + "\n Sua nota final é de "
							+ txtNotafinal8.getText().replace(".", ",") + " pontos !"
							+ "\n Aprovado(a) para o proximo semestre, na disciplina de " + txtDiciplina8.getText(),
					"UNIVERSIDADE X - ADS 1B NOITE", JOptionPane.INFORMATION_MESSAGE);
			txtAprovado8.setText("Aprovado");
		} else {
			JOptionPane.showMessageDialog(null, "Digite uma nota valida", "UNIVERSIDADE X - ADS 1B NOITE",
					JOptionPane.ERROR_MESSAGE);
		}

		// materia 9
		if (media9 >= 0 && media9 <= 5.99) {
			JOptionPane.showMessageDialog(null,
					" Aluno(a) :" + txtAluno.getText() + "\n RGM: " + txtRgm.getText() + "\n Curso: "
							+ txtCurso.getText() + "\n Turma: " + txtTurma.getText() + "\n Sua nota final é de "
							+ txtNotafinal9.getText().replace(".", ",") + " pontos !"
							+ "\n Será necessario fazer a prova AF, na disciplina de " + txtDiciplina9.getText(),
					"UNIVERSIDADE X - ADS 1B NOITE", JOptionPane.INFORMATION_MESSAGE);
			txtAprovado9.setText("Necessidade de fazer AF");
		} else if (media9 >= 6 && media9 <= 10.00) {
			JOptionPane.showMessageDialog(null,
					" Aluno(a) :" + txtAluno.getText() + "\n RGM: " + txtRgm.getText() + "\n Curso: "
							+ txtCurso.getText() + "\n Turma: " + txtTurma.getText() + "\n Sua nota final é de "
							+ txtNotafinal9.getText().replace(".", ",") + " pontos !"
							+ "\n Aprovado(a) para o proximo semestre, na disciplina de " + txtDiciplina9.getText(),
					"UNIVERSIDADE X - ADS 1B NOITE", JOptionPane.INFORMATION_MESSAGE);
			txtAprovado9.setText("Aprovado");
		} else {
			JOptionPane.showMessageDialog(null, "Digite uma nota valida", "UNIVERSIDADE X - ADS 1B NOITE",
					JOptionPane.ERROR_MESSAGE);
		}

	}

	// método para limpar as labels
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
