package wordAnalysisl.compilePrinciple.just;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

import main.compilePrinciple.just.CompilePrinciple_App;
import main.compilePrinciple.just.JPopupTextField;

public class WAJpanel extends JPanel{
	public static WAJpanel waJpanel = null;
	private JTextArea textArea ;

	
	public WAJpanel(){
		this.setLayout(null);
		JLabel title = new JLabel("�ʷ�����");

		
		title.setEnabled(true);
		title.setOpaque(true);
		title.setForeground(Color.black);
		title.setBounds(320,20,60,40);
		this.add(title);
		
		JLabel tip_input = new JLabel("���������");
		tip_input.setBounds(120,98,90,40);
		tip_input.setForeground(Color.black);
		this.add(tip_input);
		
		JButton button_submit = new JButton("�ύ");
		button_submit.setBackground(new Color(166,166,166));
		button_submit.setBounds(520,100,60,30);
		button_submit.addActionListener(new WAEventHandler().getWAEvent());
		button_submit.setActionCommand("wa_submit");
		this.add(button_submit);
		
		textArea = new JTextArea();
		textArea.setSize(300, 20);
		textArea.setMargin(new Insets(5, 5, 5, 5));
		textArea.setAutoscrolls(true);
		//textArea.setWrapStyleWord(true);
		//textArea.setComponentPopupMenu(new JPopupTextField().getPopupMenu());
		textArea.setLineWrap(true);
		JScrollPane textScrollPane = new JScrollPane(textArea);
		textScrollPane.setBounds(200, 100, 300, 35);
		this.add(textScrollPane);
		
	}
	
	public void paint(Graphics g){
		super.paint(g);
		/*		g.setColor(Color.red);
		g.drawString("Hello word", 200, 300);
		g.fillRect(0, 0, 40, 50);
		
*/
	}
	
	
	public static WAJpanel getJpanel(){
		if(waJpanel ==null){
			waJpanel = new WAJpanel();
		}
		return waJpanel;
	}
	
	
	public void showResult(){
//		if(new WAEventHandler().getWAEvent().getKeyArr().isEmpty()&&new WAEventHandler().getWAEvent().getSeparatorArr().isEmpty()){
//			final JDialog separator_dialog = new JDialog(new CompilePrinciple_App().getJframe(),"������ʾ");
//			separator_dialog.setVisible(true);
//			separator_dialog.setSize(190,100);
//			separator_dialog.setLocation(560,250);
//			separator_dialog.setLayout(null);
//			separator_dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			
//			JLabel separator_text = new JLabel("��������ָ�����ؼ���");
//			separator_text.setForeground(Color.black);
//			separator_text.setBounds(15, 0, 170, 20);
//			separator_text.setToolTipText("��������ָ�������ؼ���");
//			
//			
//			JButton separator_button = new JButton("ȷ��");
//			separator_button.setBounds(60, 30, 60, 30);
//			
//			separator_dialog.getContentPane().add(separator_text);
//			separator_dialog.getContentPane().add(separator_button);
//			
//			separator_button.addActionListener(new ActionListener(){
//
//				@Override
//				public void actionPerformed(ActionEvent arg0) {
//					// TODO Auto-generated method stub
//					separator_dialog.dispose();
//				}
//				
//			});
//		}else if(new WAEventHandler().getWAEvent().getKeyArr().isEmpty()){
//			final JDialog separator_dialog = new JDialog(new CompilePrinciple_App().getJframe(),"������ʾ");
//			separator_dialog.setVisible(true);
//			separator_dialog.setSize(150,100);
//			separator_dialog.setLocation(580,250);
//			separator_dialog.setLayout(null);
//			separator_dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			
//			JLabel separator_text = new JLabel("��������ؼ���");
//			separator_text.setForeground(Color.black);
//			separator_text.setBounds(20, 0, 100, 20);
//			separator_text.setToolTipText("��������ؼ���");
//			
//			
//			JButton separator_button = new JButton("ȷ��");
//			separator_button.setBounds(45, 30, 60, 30);
//			
//			separator_dialog.getContentPane().add(separator_text);
//			separator_dialog.getContentPane().add(separator_button);
//			
//			separator_button.addActionListener(new ActionListener(){
//
//				@Override
//				public void actionPerformed(ActionEvent arg0) {
//					// TODO Auto-generated method stub
//					separator_dialog.dispose();
//				}
//				
//			});
//		}else if(new WAEventHandler().getWAEvent().getSeparatorArr().isEmpty()){
//			final JDialog separator_dialog = new JDialog(new CompilePrinciple_App().getJframe(),"������ʾ");
//			separator_dialog.setVisible(true);
//			separator_dialog.setSize(150,100);
//			separator_dialog.setLocation(580,250);
//			separator_dialog.setLayout(null);
//			separator_dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			
//			JLabel separator_text = new JLabel("��������ָ���");
//			separator_text.setForeground(Color.black);
//			separator_text.setBounds(20, 0, 100, 20);
//			separator_text.setToolTipText("��������ָ�����");
//			
//			
//			JButton separator_button = new JButton("ȷ��");
//			separator_button.setBounds(45, 30, 60, 30);
//			
//			separator_dialog.getContentPane().add(separator_text);
//			separator_dialog.getContentPane().add(separator_button);
//			
//			separator_button.addActionListener(new ActionListener(){
//
//				@Override
//				public void actionPerformed(ActionEvent arg0) {
//					// TODO Auto-generated method stub
//					separator_dialog.dispose();
//				}
//				
//			});
//		}else if(textArea.getText().toString().replaceAll("(\r|\t|\n| )", "").isEmpty()){
//			final JDialog input_dialog = new JDialog(new CompilePrinciple_App().getJframe(),"������ʾ");
//			input_dialog.setVisible(true);
//			input_dialog.setSize(150,100);
//			input_dialog.setLocation(580,250);
//			input_dialog.setLayout(null);
//			input_dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			
//			JLabel input_text = new JLabel("�����������");
//			input_text.setForeground(Color.black);
//			input_text.setBounds(20, 0, 100, 20);
//			input_text.setToolTipText("�����������");
//			
//			
//			JButton input_button = new JButton("ȷ��");
//			input_button.setBounds(45, 30, 60, 30);
//			
//			input_dialog.getContentPane().add(input_text);
//			input_dialog.getContentPane().add(input_button);
//			
//			input_button.addActionListener(new ActionListener(){
//
//				@Override
//				public void actionPerformed(ActionEvent arg0) {
//					// TODO Auto-generated method stub
//					input_dialog.dispose();
//				}
//				
//			});
//		}else{
			String[] title = new String[4];
			title[0] = "����";
			title[1] = "��Ԫ����";
			title[2] = "����";
			title[3] = "λ��(����)";
			
			//StringBuilder sb = new StringBuilder();
			
			String[][] content = new String[9][4];
			/*content[0][0] = "����";
			content[0][1] = "����";
			content[0][2] = "����";
			content[0][3] = "����";
			content[1][0] = "����";
			
			//DefaultTableCellRenderer render = new DefaultTableCellRenderer();
		    //render.setHorizontalAlignment(SwingConstants.CENTER);
		    //render.setVerticalAlignment(SwingConstants.CENTER);
			*/
			
			JTable table = new JTable(content,title);
			JScrollPane scrollPane = new JScrollPane(table);
			scrollPane.setBounds(130,180,440,200);
			table.setRowHeight(30);
			table.setEnabled(false);
			//table.setDefaultRenderer(String.class, render);
			
			
			char[] str = textArea.getText().toCharArray();
			int str_length = str.length;
			int pointer_row=1,pointer_column=0;
			ArrayList<String> str_arr = new ArrayList<String>();
			String  pointer_current;
			StringBuffer pointer_cache = null;
			
			for(int i=0;i<str_length;i++){
				//��ȡa��a_ ��_a ��a_3��a3_��_3a��_a3 �������ַ���
				if((str[i]<='z'&&str[i]>='a')||(str[i]<='Z'&&str[i]>='A')){
					pointer_cache.append(str[i]);
					break;
				}else if(str[i]=='_'){
					pointer_cache.append(str[i]);
					break;
				}else if(pointer_cache.length()>0){
					//ȷ��һ���Ϸ��ַ������ַ���Ϊ���֣������ɼ�����
					char[] temp = pointer_cache.toString().toCharArray();
					int val = temp[0]-'0';
					if(val<0||val>9){
						pointer_cache.append(str[i]);
					}
				}
				
				//�����ո�ȷ��֮ǰΪһ���ַ���
				if(str[i]==' '){
					pointer_current = pointer_cache.toString();
					
					//�ؼ���
					if(new WAEventHandler().getKeyArr().contains(pointer_current)){
						pointer_column++;
						str_arr.add(pointer_current);
						str_arr.add("(1,"+pointer_current+")");
						str_arr.add("�ؼ���");
						str_arr.add("("+pointer_row+","+pointer_column+")");
					}
					if(new WAArrayDistri().getArithMeticOperator(new WAEventHandler().getSeparatorArr()).contains(pointer_current)){
						//���������
						pointer_column++;
						str_arr.add(pointer_current);
						str_arr.add("(2,"+pointer_current+")");
						str_arr.add("���������");
						str_arr.add("("+pointer_row+","+pointer_column+")");
					}
					if(new WAArrayDistri().getRelationOperator(new WAEventHandler().getSeparatorArr()).contains(pointer_current)){
						//��ϵ�����
						pointer_column++;
						str_arr.add(pointer_current);
						str_arr.add("(3,"+pointer_current+")");
						str_arr.add("��ϵ�����");
						str_arr.add("("+pointer_row+","+pointer_column+")");
					}
					if(new WAArrayDistri().getLogicOperator(new WAEventHandler().getSeparatorArr()).contains(pointer_current)){
						//�߼������
						pointer_column++;
						str_arr.add(pointer_current);
						str_arr.add("(4,"+pointer_current+")");
						str_arr.add("�߼������");
						str_arr.add("("+pointer_row+","+pointer_column+")");
					}
					if(new WAArrayDistri().getBitOperator(new WAEventHandler().getSeparatorArr()).contains(pointer_current)){
						//λ���������
						pointer_column++;
						str_arr.add(pointer_current);
						str_arr.add("(5,"+pointer_current+")");
						str_arr.add("λ���������");
						str_arr.add("("+pointer_row+","+pointer_column+")");
					}
					if(new WAArrayDistri().getAssignOperator(new WAEventHandler().getSeparatorArr()).contains(pointer_current)){
						//��ֵ�����
						pointer_column++;
						str_arr.add(pointer_current);
						str_arr.add("(6,"+pointer_current+")");
						str_arr.add("��ֵ�����");
						str_arr.add("("+pointer_row+","+pointer_column+")");
					}
					if(new WAArrayDistri().getConditionOperator(new WAEventHandler().getSeparatorArr()).contains(pointer_current)){
						//���������
						pointer_column++;
						str_arr.add(pointer_current);
						str_arr.add("(7,"+pointer_current+")");
						str_arr.add("���������");
						str_arr.add("("+pointer_row+","+pointer_column+")");
					}
					if(new WAArrayDistri().getBoundaryOperator(new WAEventHandler().getSeparatorArr()).contains(pointer_current)){
						//�ָ���
						pointer_column++;
						str_arr.add(pointer_current);
						str_arr.add("(8,"+pointer_current+")");
						str_arr.add("�ָ���");
						str_arr.add("("+pointer_row+","+pointer_column+")");
					}
					
					if(pointer_current.matches("[0-9].*[_|a-z|A-Z]")){
						//�����ֿ�ͷ ��_����ĸ�����ֽ�β
						
					}
					
					pointer_cache= null;
				}
				
				
			}
			
			System.out.println(str.length);
			//||str.contains("/n")||str.contains("\n\r")||str.contains("/r/n")
			if(str[str.length-1]=='\n'){
				System.out.println("�л��з�");
			}
			if(str[str.length-1]=='\t'){
				System.out.println("���Ʊ��");
			}
			if(str[str.length-1]==' '){
				System.out.println("�пո�");
			}
			
			
			this.add(scrollPane);			
		//}
	}
	

}
