package br.edu.univas.lab4.si4.prova1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PanelButtons extends JPanel {

	private static final long serialVersionUID = 7121221460339785348L;
	private JButton bt1;
	private JButton bt2;
	private JButton bt3;
	private JButton bt4;
	private JButton bt5;
	private JButton bt6;
	private JButton bt7;
	private JButton bt8;
	private JButton bt9;
	private JButton bt10;

	@SuppressWarnings("static-access")
	public PanelButtons() {
		setBorder(new EmptyBorder(10, 10, 10, 10));
		setPreferredSize(new Dimension(100, 100));
		setBackground(new Color(10).gray);
		addCompponents();

	}

	private void addCompponents() {

		add(getBt1());
		add(getBt2());
		add(getBt3());
		add(getBt4());
		add(getBt5());
		add(getBt6());
		add(getBt7());
		add(getBt8());
		add(getBt9());
		add(getBt10());

	}

	public JButton getBt1() {
		if (bt1 == null) {
			bt1 = new JButton("Botão 1");
			bt1.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Eu sou reponsavel pelo meu futuro");
				}
			});
		}
		return bt1;
	}

	public JButton getBt2() {
		if (bt2 == null) {
			bt2 = new JButton("Botão 2");
			bt2.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Eu sou reponsavel pelo meu futuro");

				}
			});
		}
		return bt2;
	}

	public JButton getBt3() {
		if (bt3 == null) {
			bt3 = new JButton("Botão 3");
			bt3.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Eu sou reponsavel pelo meu futuro");

				}
			});
		}
		return bt3;
	}

	public JButton getBt4() {
		if (bt4 == null) {
			bt4 = new JButton("Botão 4");
			bt4.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Eu sou reponsavel pelo meu futuro");

				}
			});
		}
		return bt4;
	}

	public JButton getBt5() {
		if (bt5 == null) {
			bt5 = new JButton("Botão 5");
			bt5.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Eu sou reponsavel pelo meu futuro");

				}
			});
		}
		return bt5;
	}

	public JButton getBt6() {
		if (bt6 == null) {
			bt6 = new JButton("Botão 6");
			bt6.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Eu sou reponsavel pelo meu futuro");

				}
			});
		}
		return bt6;
	}

	public JButton getBt7() {
		if (bt7 == null) {
			bt7 = new JButton("Botão 7");
			bt7.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Eu sou reponsavel pelo meu futuro");

				}
			});
		}
		return bt7;
	}

	public JButton getBt8() {
		if (bt8 == null) {
			bt8 = new JButton("Botão 8");
			bt8.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Eu sou reponsavel pelo meu futuro");

				}
			});
		}
		return bt8;
	}

	public JButton getBt9() {
		if (bt9 == null) {
			bt9 = new JButton("Botão 9");
			bt9.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Eu sou reponsavel pelo meu futuro");

				}
			});
		}
		return bt9;
	}

	public JButton getBt10() {
		if (bt10 == null) {
			bt10 = new JButton("Botão 10");
			bt10.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Eu sou reponsavel pelo meu futuro");

				}
			});
		}
		return bt10;
	}
}
