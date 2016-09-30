package ars_magica;

import javax.swing.DefaultComboBoxModel;

public class RefreshModel {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	static DefaultComboBoxModel Refresh(String [][] arg1,int ArrayIndex){
		DefaultComboBoxModel RefreshNames = new DefaultComboBoxModel();
		
		int arrayIterator = 0;
		RefreshNames.removeAllElements();
		while (arrayIterator!=ArrayIndex){
			RefreshNames.addElement(arg1[arrayIterator][0]);
			arrayIterator++;
		}
		return RefreshNames;
		
	}
}
