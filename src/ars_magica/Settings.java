package ars_magica;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Settings {
	
	private static int TabbedPaneLayout = JTabbedPane.BOTTOM;
	public static int SaveSettingsArrayIndex = 1;
	
	public static void setTabbedLayout(String s){
		if(s.equals("bottom")){
			TabbedPaneLayout = JTabbedPane.BOTTOM;
		}
		else if(s.equals("top")){
			TabbedPaneLayout = JTabbedPane.TOP;
		}
		else if(s.equals("left")){
			TabbedPaneLayout = JTabbedPane.LEFT;
		}
		else if(s.equals("right")){
			TabbedPaneLayout = JTabbedPane.RIGHT;
		}
	}
	
	public static int getTabbedLayout(){
		return TabbedPaneLayout;	
	}
		
	public static List<Component> getAllComponents(final Container c) {
	    Component[] comps = c.getComponents();
	    List<Component> compList = new ArrayList<Component>();
	    for (Component comp : comps) {
	        compList.add(comp);
	        if (comp instanceof Container)
	            compList.addAll(getAllComponents((Container) comp));
	    }
	    return compList;
	}

	public static void colorAllComponents(JPanel contentPane, String string) {
		List<Component> compList = getAllComponents(contentPane);
		int i = 0; //iterator
		if(string.equals("standard")){
			while (i<compList.size()){
				//String name = compList.get(i).getClass().getName();
				//System.out.println(name);
				
				compList.get(i).setBackground(UIManager.getColor ( compList.get(i).getClass().getName()+".background"));
				i++;
				//System.out.println(iter.next());
			}
		}
		else if(string.equals("dark")){
			while (i<compList.size()){
				String name = compList.get(i).getClass().getName();
				//compList.get(i).setBackground(new Color(0, 0, 0));
				if(name.equals("javax.swing.JLabel")){
					//not sure why this isn't changing
					compList.get(i).setBackground(new Color(0, 0, 255));	
				}else if(name.equals("javax.swing.JButton")){
					//buttons
					compList.get(i).setBackground(new Color(128, 105, 105));	
					
				}else if(name.equals("javax.swing.JPanel")){
					//all main panes
					compList.get(i).setBackground(new Color(94, 87, 87));
					
				}else if(name.equals("javax.swing.plaf.basic.BasicTabbedPaneUI$ScrollableTabPanel")){
					//no idea what is is
					compList.get(i).setBackground(new Color(255, 0, 0));	
				}else if(name.equals("javax.swing.JTextField")){
					//changable text boxs
					compList.get(i).setBackground(new Color(128, 105, 105));	
				}else if(name.equals("javax.swing.JViewport")){
					//no idea
					compList.get(i).setBackground(new Color(0, 0, 255));	
				}else if(name.equals("javax.swing.plaf.metal.MetalScrollButton")){
					//no idea
					compList.get(i).setBackground(new Color(0, 0, 255));	
				}else if(name.equals("javax.swing.JTabbedPane")){
					//tabs
					compList.get(i).setBackground(new Color(128, 105, 105));	
				}else if(name.equals("javax.swing.JScrollPane$ScrollBar")){
					//scroll bar
					compList.get(i).setBackground(new Color(128, 105, 105));	
				}else if(name.equals("javax.swing.JList")){
					//text boxs with names and info
					compList.get(i).setBackground(new Color(128, 105, 105));	
				}else if(name.equals("javax.swing.JComboBox")){
					//combo Box
					compList.get(i).setBackground(new Color(128, 105, 105));	
				}else if(name.equals("javax.swing.JTable")){
					//trait box
					compList.get(i).setBackground(new Color(128, 105, 105));	
				}else if(name.equals("javax.swing.JScrollPane")){
					//no idea
					compList.get(i).setBackground(new Color(128, 105, 105));	
				}
				else{
					compList.get(i).setBackground(new Color(128, 105, 105));
					System.out.println(name);
				}
				i++;
				i++;
				//System.out.println(iter.next());
			}
		}
	}

	public static void changeLog(){	
		
			UIManager.put("OptionPane.minimumSize", new Dimension(500, 300));

			JPanel panel = new JPanel();// new GridLayout());
			panel.setLayout(null);

			

			panel.add(new JLabel("Change Log:")).setBounds(0, 0, 400, 20);
			JTextArea description = new JTextArea();
			description.setLineWrap(true);
			description.setEditable(false);
			
			JScrollPane scrollPane_Desc = new JScrollPane();
			scrollPane_Desc.setViewportView(description);
			panel.add(scrollPane_Desc).setBounds(0, 20, 400, 200);
			
			try {
				InputStream in =  ars_magica.mainClass.class.getResourceAsStream("ChangeLog"); 
		            
				BufferedReader br = new BufferedReader(new InputStreamReader(in));
				
			    StringBuilder sb = new StringBuilder();
			    String line = br.readLine();

			    while (line != null) {
			        sb.append(line);
			        sb.append(System.lineSeparator());
			        line = br.readLine();
			    }
			    String everything = sb.toString();
			    description.setText(everything);
			    br.close();
			}catch (Exception e) {
				
				e.printStackTrace();
			}
			
			description.setCaretPosition(0);
			
			JOptionPane.showConfirmDialog(null, panel, "Change Log", JOptionPane.OK_CANCEL_OPTION);// ,
		
		}

	@SuppressWarnings("unchecked")
	public static void saveSettings(){
		JSONObject settings = new JSONObject();
		
		settings.put("TabbedPaneLayout", TabbedPaneLayout);
		
		File file;
		InputStream in =  mainClass.class.getResourceAsStream("SettingsFile");
		//mainClass.class.getResource("SettingsFile").getPath().toString();
		System.out.println(mainClass.class.getResource("SettingsFile").getPath().replaceFirst("/",""));
		try{
			file = new File(mainClass.class.getResource("SettingsFile").getPath());
			String t = file.toString();
			System.out.println(t);
			FileWriter newFile = new FileWriter(file);// .write(arts.toJSONString());
			System.out.println(settings.toJSONString());
			newFile.write(settings.toJSONString());
			newFile.flush();
			newFile.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static String[] loadSettings(){
		String[] settings = new String[SaveSettingsArrayIndex];
		int current = 0;
		
		
		InputStream in =  mainClass.class.getResourceAsStream("SettingsFile"); 
        
		//BufferedReader br = new BufferedReader(new InputStreamReader(in));
		//File file = new File(mainClass.class.getResourceAsStream("ars_magica/Settings").toString());
		File file;
		JSONParser parser = new JSONParser();
		Object obj;
		
		
		try {
			file = new File(in.toString());
			obj = parser.parse(new FileReader(file.getAbsolutePath()));
			
			JSONObject json = (JSONObject) obj;
			settings[current]=json.get("TabbedPaneLayout").toString();
			current++;
			
			
		}catch(Exception e){
			
		}
		return settings;
		//File settings = new File(br.toString());//getClass().getClassLoader().getResourceAsStream("ars_magica/Settings"));
		
	}
}
