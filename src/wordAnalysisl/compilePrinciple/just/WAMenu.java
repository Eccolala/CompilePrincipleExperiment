package wordAnalysisl.compilePrinciple.just;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class WAMenu extends JMenu{
	private static JMenu menu1=null;
	public WAMenu(){
		WAEventHandler  waEventHandler = new WAEventHandler().getWAEvent();
		menu1 = new JMenu("�ʷ�����");
		JMenu menu1_lead_sign = new JMenu("������ű�");
		JMenu menu1_lead_sign_key = new JMenu("�ؼ��ֱ�");
		JMenu menu1_lead_sign_separator = new JMenu("�ָ�����");
		JMenu menu1_look_sign = new JMenu("�鿴���ű�");
		
		
		JMenuItem menuItem_key_1 = new JMenuItem("�ļ�����");
		JMenuItem menuItem_key_2 = new JMenuItem("ֱ������");
		JMenuItem menuItem_look_key = new JMenuItem("�鿴�ؼ��ֱ�");
		JMenuItem menuItem_look_separator = new JMenuItem("�鿴�ָ�����");
		JMenuItem menuItem_open_panel = new JMenuItem("�����");
		
		menu1_look_sign.add(menuItem_look_key);
		menu1_look_sign.add(menuItem_look_separator);
		
		menu1_lead_sign_key.add(menuItem_key_1);
		menu1_lead_sign_key.add(menuItem_key_2);
		
		JMenuItem menuItem_separator_1 = new JMenuItem("�ļ�����");
		JMenuItem menuItem_separator_2 = new JMenuItem("ֱ������");
		menu1_lead_sign_separator.add(menuItem_separator_1);
		menu1_lead_sign_separator.add(menuItem_separator_2);
		
		menu1_lead_sign.add(menu1_lead_sign_key);
		menu1_lead_sign.add(menu1_lead_sign_separator);
		
		menu1.add(menu1_lead_sign);
		menu1.add(menu1_look_sign);
		menu1.add(menuItem_open_panel);
		
		menuItem_key_1.addActionListener(waEventHandler);
		menuItem_key_1.setActionCommand("key_file_load");
		
		menuItem_key_2.addActionListener(waEventHandler);
		menuItem_key_2.setActionCommand("key_direct_input");
		
		menuItem_separator_1.addActionListener(waEventHandler);
		menuItem_separator_1.setActionCommand("separator_file_load");
		
		menuItem_separator_2.addActionListener(waEventHandler);
		menuItem_separator_2.setActionCommand("separator_direct_input");
		
		menuItem_look_key.addActionListener(waEventHandler);
		menuItem_look_key.setActionCommand("look_key_table");
		
		menuItem_look_separator.addActionListener(waEventHandler);
		menuItem_look_separator.setActionCommand("look_separator_table");
		
		menuItem_open_panel.addActionListener(waEventHandler);
		menuItem_open_panel.setActionCommand("wa_open_panel");
	}
	
	public static JMenu getMenu(){
		if(menu1==null){
			menu1 = new JMenu("�ʷ�����");
		}
		return menu1;
	}
}
