package main.compilePrinciple.just;


import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import LL_1_analysis.compilePrinciple.just.LLAJpanel;
import LL_1_analysis.compilePrinciple.just.LLAMenu;
import wordAnalysisl.compilePrinciple.just.WAEventHandler;
import wordAnalysisl.compilePrinciple.just.WAJpanel;
import wordAnalysisl.compilePrinciple.just.WAMenu;

public class CompilePrinciple_App{	
	private static JFrame frame = null;
	private static JPanel panel = null;
	private static CardLayout card = null;
	private JMenuBar menuBar;
	public CompilePrinciple_App(){
		frame = getJframe();
		
	}
	public static void main(String[] args){
		CompilePrinciple_App CP_App = new CompilePrinciple_App();
		CP_App.showApp();
	}
	
	public static JFrame getJframe(){
		if(frame == null){
			frame = new JFrame();
		}
		return frame;
	}
	
	public static JPanel getJpanel(){
		if(panel ==null){
			panel = new JPanel();
		}
		panel.setLayout(getCard());
		panel.add(new WAJpanel().getJpanel(),"wa_panel");
		panel.add(new LLAJpanel().getJpanel(),"lla_panel");
		return panel;
	}
	
	public static CardLayout getCard(){
		if(card ==null){
			card = new CardLayout();
		}
		return card;
	}
	
	public void showApp(){
		menuBar = new JMenuBar();
		//词法分析
		JMenu waMenu = new WAMenu().getMenu();
		
		
		//LL(1)预测分析
		JMenu llaMenu = new LLAMenu().getMenu();
		
		
		//逆波兰表达式的产生及计算
		JMenu menu3 = new JMenu("逆波兰表达式");
		
		//SLR(1)语法分析
		JMenu menu4 = new JMenu("SLR(1)语法分析");
		
		//DAG局部优化
		JMenu menu5 = new JMenu("DAG局部优化");
		
		menuBar.setBackground(new Color(240,240,240));
		menuBar.add(waMenu);
		menuBar.add(llaMenu);
		menuBar.add(menu3);
		menuBar.add(menu4);
		menuBar.add(menu5);
		
		frame.add(menuBar,BorderLayout.NORTH);
		frame.add(getJpanel());
		
		frame.setTitle("编译程序");
		frame.setVisible(true);
		frame.setSize(700,500);
		frame.setResizable(false);
		frame.setLocation(320,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
