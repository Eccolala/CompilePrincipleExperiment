package LL_1_analysis.compilePrinciple.just;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;

import wordAnalysisl.compilePrinciple.just.WAEventHandler;
import main.compilePrinciple.just.CompilePrinciple_App;

public class LLAEventHandler implements ActionListener{
	private static LLAEventHandler llaEventHandler = null;
	//WADialog waDialog;
	
	public LLAEventHandler(){
//		JFrame jframe = new CompilePrinciple_App().getJframe();
//		waDialog =new WADialog(jframe);
		//System.out.println("∞¥≈•¥•∂Ø¡À");
	}

	@SuppressWarnings("static-access")
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("lla_open_panel")){
			//waDialog.keyShowDialog();
			new CompilePrinciple_App().getCard().show(new CompilePrinciple_App().getJpanel(), "lla_panel");
		}
		
	}
	
	public static LLAEventHandler getLLAEvent(){
		if(llaEventHandler==null){
			llaEventHandler = new LLAEventHandler();
			
		}
		return llaEventHandler; 
		
	}

}
