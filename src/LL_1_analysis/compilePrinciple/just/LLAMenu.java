package LL_1_analysis.compilePrinciple.just;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import wordAnalysisl.compilePrinciple.just.WAEventHandler;

public class LLAMenu {
	private static JMenu menu2=null;
	public LLAMenu(){
		LLAEventHandler  llaEventHandler = new LLAEventHandler().getLLAEvent();
		menu2 = new JMenu("LL(1)分析");
		
		JMenuItem menuItem_open_panel = new JMenuItem("打开面板");
		
	
		menu2.add(menuItem_open_panel);
		
		
		
		menuItem_open_panel.addActionListener(llaEventHandler);
		menuItem_open_panel.setActionCommand("lla_open_panel");
	}
	
	public static JMenu getMenu(){
		if(menu2==null){
			menu2 = new JMenu("词法分析");
		}
		return menu2;
	}
}
