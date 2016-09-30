package ars_magica;

import javax.swing.JList;

public class swap {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void up(JList Names, String[][] array, int ArrayIndex,int loopCount){
		int selected = Names.getSelectedIndex();
		if(selected <= 0)
			return;
		
		String temp;
		
		for(int i=0; i<=loopCount;i++){
			temp=array[selected][i];
			array[selected][i]=array[selected-1][i];
			array[selected-1][i]=temp;
		}
		//REFRESH				
		Names.setModel(RefreshModel.Refresh(array,ArrayIndex));
		
		//select the selected
		Names.grabFocus();
		Names.setSelectedIndex(selected-1);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void down(JList Names, String[][] array, int ArrayIndex,int loopCount) {
		int selected = Names.getSelectedIndex();
		if(selected == ArrayIndex-1)
			return;
		if(selected == -1)
			return;
		String temp;
		
		for(int i=0; i<=loopCount;i++){
			temp=array[selected][i];
			array[selected][i]=array[selected+1][i];
			array[selected+1][i]=temp;
		}
		
		//REFRESH				
		Names.setModel(RefreshModel.Refresh(array,ArrayIndex));
		
		//select the selected
		Names.grabFocus();
		Names.setSelectedIndex(selected+1);
	
	}
}