package wordAnalysisl.compilePrinciple.just;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.filechooser.FileFilter;

import LL_1_analysis.compilePrinciple.just.LLAJpanel;
import main.compilePrinciple.just.CompilePrinciple_App;

public class WAEventHandler implements ActionListener{
	private static WAEventHandler waEventHandler = null;
	private ArrayList<String> key_arr;
	private ArrayList<String> separator_arr;
	
	public WAEventHandler(){
		JFrame jframe = new CompilePrinciple_App().getJframe();
		key_arr = new ArrayList<String>();
		separator_arr = new ArrayList<String>();
		//System.out.println("��ť������");
	}

	@SuppressWarnings("static-access")
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("key_direct_input")){
			new WADialog().getDialog().keyShowDialog();
		}
		
		
		if(e.getActionCommand().equals("separator_direct_input")){
			new WADialog().getDialog().separatorShowDialog();
		}
		
		if(e.getActionCommand().equals("separator_file_load")){
			// �����ļ�ѡ����
			  JFileChooser fileChooser = new JFileChooser();
			  // ���õ�ǰĿ¼
			  fileChooser.setCurrentDirectory(new File("."));
			  fileChooser.setAcceptAllFileFilterUsed(false);
			  final String[][] fileENames = { { ".java", "JAVAԴ���� �ļ�(*.java)" },
			          { ".doc", "MS-Word 2003 �ļ�(*.doc)" },
			          { ".xls", "MS-Excel 2003 �ļ�(*.xls)" },
			          {".txt","�ı��ļ�(*.txt)"}
			           };
			  
			  // ��ʾ�����ļ�
			  fileChooser.addChoosableFileFilter(new FileFilter() {
				  public boolean accept(File file) {
					  return true;
				  }
				  public String getDescription() {
					  return "�����ļ�(*.*)";
				  }
			  });
			  
			  // ѭ�������Ҫ��ʾ���ļ�
			  for (final String[] fileEName : fileENames) {
				  fileChooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
					  public boolean accept(File file) { 
						  if (file.getName().endsWith(fileEName[0]) || file.isDirectory()) {
							  return true;
						  }
			 
						  return false;
					  }
			 
					  public String getDescription() {
						  return fileEName[1];
					  }
				  });
			  }
			  
			  fileChooser.showDialog(null, null);
			  
			  //��ȡѡ�е��ļ�
			  BufferedReader reader = null;
			  File file = null;
			  try {
				  file = fileChooser.getSelectedFile();
				  if(file!=null){
					  reader = new BufferedReader(new FileReader(file));
				  }
				
			  } catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			  }
		      String line;
//		      StringBuilder sb = new StringBuilder();
		      
		      try {
		    	  if(file!=null){
		    		  if(!separator_arr.isEmpty()){
		    			  separator_arr.clear();
	    			  }
		    		  while((line=reader.readLine())!=null){
		    			  separator_arr.add(line);
						/*  sb.append(line+"\n");
						  System.out.println(line);*/
					  }
		    	  }
		      }catch (IOException e1) {
					// TODO Auto-generated catch block
		    	  e1.printStackTrace();
		      }
		       try {
					if(file !=null){
						reader.close();
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		}
		
		if(e.getActionCommand().equals("key_file_load")){
			// �����ļ�ѡ����
			  JFileChooser fileChooser = new JFileChooser();
			  // ���õ�ǰĿ¼
			  fileChooser.setCurrentDirectory(new File("."));
			  fileChooser.setAcceptAllFileFilterUsed(false);
			  final String[][] fileENames = { { ".java", "JAVAԴ���� �ļ�(*.java)" },
			          { ".doc", "MS-Word 2003 �ļ�(*.doc)" },
			          { ".xls", "MS-Excel 2003 �ļ�(*.xls)" },
			          {".txt","�ı��ļ�(*.txt)"}
			           };
			  
			  // ��ʾ�����ļ�
			  fileChooser.addChoosableFileFilter(new FileFilter() {
				  public boolean accept(File file) {
					  return true;
				  }
				  public String getDescription() {
					  return "�����ļ�(*.*)";
				  }
			  });
			  
			  // ѭ�������Ҫ��ʾ���ļ�
			  for (final String[] fileEName : fileENames) {
				  fileChooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
					  public boolean accept(File file) { 
						  if (file.getName().endsWith(fileEName[0]) || file.isDirectory()) {
							  return true;
						  }
			 
						  return false;
					  }
			 
					  public String getDescription() {
						  return fileEName[1];
					  }
				  });
			  }
			  
			  fileChooser.showDialog(null, null);
			  
			  //��ȡѡ�е��ļ�
			  BufferedReader reader = null;
			  File file = null;
			  try {
				  file = fileChooser.getSelectedFile();
				  if(file!=null){
					  reader = new BufferedReader(new FileReader(file));
				  }
				
			  } catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			  }
		      String line;
		      /*StringBuilder sb = new StringBuilder();
		      */
		      try {
		    	  if(file!=null){
		    		  if(!key_arr.isEmpty()){
		    			  key_arr.clear();
	    			  }
		    		  while((line=reader.readLine())!=null){
		    			  
		    			  key_arr.add(line);
						  /*sb.append(line+"\n");
						  System.out.println(line);*/
					  }
		    	  }
		      }catch (IOException e1) {
					// TODO Auto-generated catch block
		    	  e1.printStackTrace();
		      }
		       try {
					if(file !=null){
						reader.close();
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		        
		}
		
		if(e.getActionCommand().equals("look_key_table")){
			new WADialog().getDialog().lookKeyDialog();
		}
		
		if(e.getActionCommand().equals("look_separator_table")){
			new WADialog().getDialog().lookSeparatorDialog();
		}
			
		if(e.getActionCommand().equals("wa_open_panel")){
			/*new LLAJpanel().getJpanel().setVisible(false);
			new WAJpanel().getJpanel().setVisible(true);
			//new WAJpanel().getJpanel().repaint();*/	
		
			new CompilePrinciple_App().getCard().show(new CompilePrinciple_App().getJpanel(), "wa_panel");
			
		}
		
		if(e.getActionCommand().equals("wa_submit")){
			new WAJpanel().getJpanel().showResult();
		}
	}
	
	public static WAEventHandler getWAEvent(){
		if(waEventHandler==null){
			waEventHandler = new WAEventHandler();
			
		}
		return waEventHandler; 
		
	}
	
	public ArrayList<String> getKeyArr(){
		return key_arr;
	}
	
	public ArrayList<String> getSeparatorArr(){
		return separator_arr;
	}
	
}
