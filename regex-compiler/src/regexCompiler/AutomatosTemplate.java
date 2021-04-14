package regexCompiler;

import java.awt.EventQueue;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;



import java.awt.Scrollbar;

public class AutomatosTemplate extends JFrame {

	private static JPanel contentPane;
	private JButton btnNewButton = new JButton("Analisar");
	private JButton btnNewButton_1 = new JButton("Limpar");
	private JButton btnNewButton_2 = new JButton("Equipe");
	private JScrollPane scrollPane_1 = new JScrollPane();
	private static JTextArea textArea = new JTextArea();
	 JScrollPane scroll = new JScrollPane(textArea);
	private static JScrollPane scrollPaneCampoA = new JScrollPane();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AutomatosTemplate frame = new AutomatosTemplate();
					frame.setVisible(true);
					textArea.setBorder(new NumberedBorder());
					
					
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AutomatosTemplate() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		add(scroll);
		
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE)
					.addGap(51)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE)
					.addGap(47)
					.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE))
				.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 874, GroupLayout.PREFERRED_SIZE)
				.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 874, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1)
						.addComponent(btnNewButton_2))
					.addGap(11)
					.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
