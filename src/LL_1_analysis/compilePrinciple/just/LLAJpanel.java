package LL_1_analysis.compilePrinciple.just;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JPanel;


public class LLAJpanel extends JPanel{
public static LLAJpanel llaJpanel = null;
	
	public LLAJpanel(){
		
	}
	
	public void paint(Graphics g){
		super.paint(g);
		g.setColor(Color.red);
		g.drawString("LLA Jpanel", 200, 300);
		g.fillRect(0, 0, 40, 50);
	}
	
	public void showStr(){
		System.out.println("shuchuzifuchu");
		JButton butoon = new JButton("hee");
		llaJpanel = getJpanel();
		llaJpanel.add(butoon);
	}
	
	public static LLAJpanel getJpanel(){
		if(llaJpanel ==null){
			llaJpanel = new LLAJpanel();
		}
		return llaJpanel;
		
		
	}
}
