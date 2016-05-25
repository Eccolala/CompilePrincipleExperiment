package wordAnalysisl.compilePrinciple.just;

import java.util.ArrayList;

public class WAArrayDistri {
	public ArrayList<String> getArithMeticOperator(ArrayList<String> arr){
		//���������
		ArrayList<String> finstr = new ArrayList<String>();
		int start = arr.indexOf("$");
		int end = arr.indexOf("$$");
		for(int i=start+1;i<end;i++){
			finstr.add(arr.get(i));
		}
		return finstr;
	}
	
	public ArrayList<String> getRelationOperator(ArrayList<String> arr){
		//��ϵ�����
		ArrayList<String> finstr = new ArrayList<String>();
		int start = arr.indexOf("$$");
		int end = arr.indexOf("$$$");
		for(int i=start+1;i<end;i++){
			finstr.add(arr.get(i));
		}
		return finstr;
	}
	
	public ArrayList<String> getLogicOperator(ArrayList<String> arr){
		//�߼������
		ArrayList<String> finstr = new ArrayList<String>();
		int start = arr.indexOf("$$$");
		int end = arr.indexOf("$$$$");
		for(int i=start+1;i<end;i++){
			finstr.add(arr.get(i));
		}
		return finstr;
	}
	public ArrayList<String> getBitOperator(ArrayList<String> arr){
		//λ���������
		ArrayList<String> finstr = new ArrayList<String>();
		int start = arr.indexOf("$$$$");
		int end = arr.indexOf("$$$$$");
		for(int i=start+1;i<end;i++){
			finstr.add(arr.get(i));
		}
		return finstr;
	}
	
	public ArrayList<String> getAssignOperator(ArrayList<String> arr){
		//��ֵ�����
		ArrayList<String> finstr = new ArrayList<String>();
		int start = arr.indexOf("$$$$$");
		int end = arr.indexOf("$$$$$$");
		for(int i=start+1;i<end;i++){
			finstr.add(arr.get(i));
		}
		return finstr;
	}
	
	public ArrayList<String> getConditionOperator(ArrayList<String> arr){
		//���������
		ArrayList<String> finstr = new ArrayList<String>();
		int start = arr.indexOf("$$$$$$");
		int end = arr.indexOf("$$$$$$$");
		for(int i=start+1;i<end;i++){
			finstr.add(arr.get(i));
		}
		return finstr;
	}
	
	
	
	public ArrayList<String> getBoundaryOperator(ArrayList<String> arr){
		//�ָ���
		ArrayList<String> finstr = new ArrayList<String>();
		int start = arr.indexOf("$$$$$$$");
		int end = arr.size();
		for(int i=start+1;i<end;i++){
			finstr.add(arr.get(i));
		}
		return finstr;
	}
	
	public String[][] getStr(int column,ArrayList<String> arr){
		int arr_length = arr.size(),start=0;
		String[][] str = new String[arr_length][column];
		
		
		for(int i = 0;i<arr_length;i++){
			for(int j=0;j<column;j++){
				if(start%2==1){
					str[i][j] = arr.get(start/2);
				}else{
					int temp = start/2+1;
					str[i][j] =temp +"";
				}
				start++;
			}
		}
		return str;
	}
	
	private String[][] getSeparator(int column,ArrayList<String> arr,ArrayList<String> s_arr){
		int arr_length = arr.size(),start=0;
		String[][] str = new String[arr_length][column];
		
		
		for(int i = 0;i<arr_length;i++){
			for(int j=0;j<column;j++){
				if(start%2==1){
					str[i][j] = arr.get(start/2);
				}else{
					int temp = start/2;
					temp = s_arr.indexOf(arr.get(temp))+1;
					str[i][j] =temp +"";
				}
				start++;
			}
		}
		return str;
	}
	
	public String[][] getStr(int column,ArrayList<String> arr,String str){
		if(str.equals("���������")){
			ArrayList<String> temparr =getArithMeticOperator(arr);
			return getSeparator(column,temparr,arr);
		}else if(str.equals("��ϵ�����")){
			ArrayList<String> temparr =getRelationOperator(arr);
			return getSeparator(column,temparr,arr);
		}else if(str.equals("�߼������")){
			ArrayList<String> temparr =getLogicOperator(arr);
			return getSeparator(column,temparr,arr);
		}else if(str.equals("λ���������")){
			ArrayList<String> temparr =getBitOperator(arr);
			return getSeparator(column,temparr,arr);
		}else if(str.equals("��ֵ�����")){
			ArrayList<String> temparr =getAssignOperator(arr);
			return getSeparator(column,temparr,arr);
		}else if(str.equals("���������")){
			ArrayList<String> temparr =getConditionOperator(arr);
			return getSeparator(column,temparr,arr);
		}else if(str.equals("�ָ���")){
			ArrayList<String> temparr =getBoundaryOperator(arr);
			return getSeparator(column,temparr,arr);
		}else{
			return null;
		}
		
	}
}
