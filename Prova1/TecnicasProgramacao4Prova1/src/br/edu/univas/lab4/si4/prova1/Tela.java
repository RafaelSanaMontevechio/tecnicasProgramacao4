package br.edu.univas.lab4.si4.prova1;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Tela extends JFrame{

	private static final long serialVersionUID = 3495368119709456244L;
	
	private PanelButtons panelButtons;
	private PanelInfo panelInfo;


	public Tela() {
		
		this.setSize(500, 450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setTitle("Prova");
		
		add(getPanelButtons(), BorderLayout.WEST);
		add(getPanelInfo(), BorderLayout.CENTER);
	
	}
	
	

	public PanelButtons getPanelButtons() {
		if(panelButtons == null) {}
		panelButtons = new PanelButtons();
		return panelButtons;
	}


	public PanelInfo getPanelInfo() {
		if(panelInfo == null) {
			panelInfo = new PanelInfo();
		}
		return panelInfo;
	}

	
	
	

}
