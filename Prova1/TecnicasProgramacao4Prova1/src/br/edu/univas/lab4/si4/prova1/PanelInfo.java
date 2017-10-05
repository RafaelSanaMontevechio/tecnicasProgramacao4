package br.edu.univas.lab4.si4.prova1;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class PanelInfo extends JPanel {

	private static final long serialVersionUID = -4094445420572295395L;

	private JLabel jlNome;
	private JLabel jlEmail;
	private JTextField jtNome;
	private JTextField jtEmail;
	private JButton btSalvar;
	private JTable table;
	private JScrollPane scroll;

	private GridBagConstraints jlNomeConstraints;
	private GridBagConstraints jlEmailConstraints;
	private GridBagConstraints jtNomeConstraints;
	private GridBagConstraints jtEmailConstraints;
	private GridBagConstraints btSalvarConstraints;
	private GridBagConstraints scrollConstraints;

	String[] nomes = { "Nome", "CPF", "E-mail" };
	Object[][] data = { { "Joaão", "111.111.111-11", "joao@gmail.com", "Maria", "222.222.222-22", "maria@gmail.com",
			"José", "333.333.333-33", "joao@gmail.com" } };

	public PanelInfo() {
		addComponents();
		
	}

	private void addComponents() {
		setBorder(new EmptyBorder(10, 10, 10, 10));
		setLayout(new GridBagLayout());
	
		add(getJlNome(), getJlNomeConstraints());
		add(getJtNome(), getJtNomeConstraints());
		
		add(getEmail(), getJlEmailConstraints());
		add(getJtEmail(), getJtEmailConstraints());
		
		add(getBtSalvar(), getBtSalvarConstraints());
		
		add(getScroll(), getScrollConstraints());
	}

	public JLabel getJlNome() {
		if (jlNome == null) {
			jlNome = new JLabel("Nome:");
		}
		return jlNome;
	}

	public JLabel getEmail() {
		if (jlEmail == null) {
			jlEmail = new JLabel("E-mail:");
		}
		return jlEmail;
	}

	public JTextField getJtNome() {
		if (jtNome == null) {
			jtNome = new JTextField();
		}
		return jtNome;
	}

	public JTextField getJtEmail() {
		if (jtEmail == null) {
			jtEmail = new JTextField();
		}
		return jtEmail;
	}

	public JButton getBtSalvar() {
		if (btSalvar == null) {
			btSalvar = new JButton("Salvar");
			btSalvar.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Salvou");
					
				}
			});
		}
		return btSalvar;
	}

	public JTable getTable() {
		if (table == null) {
			table = new JTable(data, nomes);
			table.setFillsViewportHeight(true);
		}
		return table;
	}

	private JScrollPane getScroll() {
		if (scroll == null) {
			scroll = new JScrollPane(getTable());
			scroll.setPreferredSize(new Dimension(300, 120));
		}
		return scroll;
	}

	public GridBagConstraints getJlNomeConstraints() {
		if (jlNomeConstraints == null) {
			jlNomeConstraints = new GridBagConstraints();
			jlNomeConstraints.gridx = 0;
			jlNomeConstraints.gridy = 0;
			jlNomeConstraints.insets = new Insets(5, 5, 5, 5);
			jlNomeConstraints.anchor = GridBagConstraints.LINE_START;
		}
		return jlNomeConstraints;
	}

	public GridBagConstraints getJlEmailConstraints() {
		if (jlEmailConstraints == null) {
			jlEmailConstraints = new GridBagConstraints();
			jlEmailConstraints.gridx = 0;
			jlEmailConstraints.gridy = 1;
			jlEmailConstraints.insets = new Insets(5, 5, 5, 5);
			jlEmailConstraints.anchor = GridBagConstraints.LINE_START;
		}
		return jlEmailConstraints;
	}

	public GridBagConstraints getJtNomeConstraints() {
		if (jtNomeConstraints == null) {
			jtNomeConstraints = new GridBagConstraints();
			jtNomeConstraints.gridx = 1;
			jtNomeConstraints.gridy = 0;
			jtNomeConstraints.gridwidth = 6;
			jtNomeConstraints.ipadx = 100;
			jtNomeConstraints.insets = new Insets(5, 5, 5, 5);
			jtNomeConstraints.fill = GridBagConstraints.HORIZONTAL;
		

		}
		return jtNomeConstraints;
	}

	public GridBagConstraints getJtEmailConstraints() {
		if (jtEmailConstraints == null) {
			jtEmailConstraints = new GridBagConstraints();
			jtEmailConstraints.gridx = 1;
			jtEmailConstraints.gridy = 1;
			jtEmailConstraints.gridwidth = 6;
			jtEmailConstraints.ipadx = 100;
			jtEmailConstraints.insets = new Insets(5, 5, 5, 5);
			jtEmailConstraints.fill = GridBagConstraints.HORIZONTAL;
		
		}
		return jtEmailConstraints;
	}

	public GridBagConstraints getBtSalvarConstraints() {
		if(btSalvarConstraints == null) {
			btSalvarConstraints = new GridBagConstraints();
			btSalvarConstraints.gridx = 0;
			btSalvarConstraints.gridy = 2;
			btSalvarConstraints.gridwidth = 7;
			btSalvarConstraints.insets = new Insets(5, 5, 5, 5);
		}
		return btSalvarConstraints;
	}

	public GridBagConstraints getScrollConstraints() {
		if(scrollConstraints == null) {
			scrollConstraints = new GridBagConstraints();
			scrollConstraints.gridx = 1;
			scrollConstraints.gridy = 4;
			scrollConstraints.gridwidth = 6;
			scrollConstraints.gridheight = 5;
			scrollConstraints.ipadx = 100;
			scrollConstraints.ipady = 100;
			scrollConstraints.insets = new Insets(5, 5, 5, 5);
		}
		return scrollConstraints;
	}

}
