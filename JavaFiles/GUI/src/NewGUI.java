import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JSlider;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JFormattedTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class NewGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textName;
	private JTextField textAddress;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewGUI frame = new NewGUI();
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
	public NewGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblName = new JLabel("Name ");
		
		textName = new JTextField();
		textName.setToolTipText("Name");
		textName.setColumns(5);
		
		JLabel lblNewLabel = new JLabel("Address ");
		
		textAddress = new JTextField();
		textAddress.setColumns(10);
		
		JRadioButton rdbtnChoose = new JRadioButton("Choose1");
		
		JRadioButton rdbtnChoose_1 = new JRadioButton("Choose 2");
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.setAction(action);
		
		JFormattedTextField frmtdtxtfldThankYou = new JFormattedTextField();
		frmtdtxtfldThankYou.setText("Thank you, ");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(116)
					.addComponent(lblName)
					.addGap(5)
					.addComponent(textName, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(101)
					.addComponent(lblNewLabel)
					.addGap(5)
					.addComponent(textAddress, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(52)
					.addComponent(rdbtnChoose)
					.addGap(22)
					.addComponent(rdbtnChoose_1))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(35)
					.addComponent(btnEnter, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(35)
					.addComponent(frmtdtxtfldThankYou, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(35)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addComponent(lblName))
						.addComponent(textName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(5)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addComponent(lblNewLabel))
						.addComponent(textAddress, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(5)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnChoose)
						.addComponent(rdbtnChoose_1))
					.addGap(5)
					.addComponent(btnEnter)
					.addGap(5)
					.addComponent(frmtdtxtfldThankYou, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	private void btnEnterAction( java.awt.event.ActionEvent evt ) {
		
		String textName
		
	} //end enter

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
