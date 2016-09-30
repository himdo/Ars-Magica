package ars_magica;

import javax.swing.JTextArea;

public class DieRolls {
	static int simpleDie(int SimpleDieMod, int numberOfDie, JTextArea textArea ){
		try{
			StringBuilder text = new StringBuilder("");
			
			int total = 0;
			int random1;
			for(int i = 0; i<numberOfDie;i++){
				random1= (int)((Math.random()*10)+1);
				
				if(textArea!=null)
					text.append((i + 1) + ") Die: " + random1 + "\n");
					
				total += random1;
			}
			
			total+= SimpleDieMod;
			if(textArea!=null){
				text.append("\n\nTotal Die: " + total + "\n");
				textArea.setText(text.toString());
				textArea.setCaretPosition(0);
			}
			return total;
		}catch (Exception e){
			if(textArea!=null){
				textArea.setText("There was an Error\nMaybe you used to big of Numbers");
				textArea.setCaretPosition(0);
			}
			return 0;
		}
	}
	
	static int[] stressDie(int mod, int numberDie,JTextArea textArea ){
		StringBuilder text = new StringBuilder("");
		
		//0 = after the first roll 0 counts as a 10
		//1 = double the modifier
		//2-9 = normal
		//a botch always counts as a zero
		
		//add the modifier last
		int total[] = new int [2];
		total[0]=0;
		total[1]=0;
		int multipler = 1;
		int i;
		boolean botch = false;
		int botchCount = 0;
		boolean toMultiple = false;
		
		
		try{
			for( i= 0; i<numberDie;i++){
				int random = (int)((Math.random()*10));
				if(textArea!=null)
					text.append((i + 1) + ") Die: " + random + "\n");
				
				if(random == 1){
					multipler = multipler*2;
					i-=1;
					toMultiple=true;
				}else{
					if(multipler <1&&random==0){
						if(textArea!=null)
							text.append("Multipler: " + multipler + "\n");
						
						total[0] +=10*multipler;
						multipler=1;
					}
					if(random==0&&multipler==1){
						botch=true;
						botchCount ++;
					}
					else if(toMultiple){
						if(textArea!=null)
							text.append("Multipler: " + multipler + "\n");
	
						total[0] += multipler*random;
						toMultiple = false;
						multipler=1;
					}else{
						total[0]+=random;	
					}
				}
				
			}
			if(textArea!=null)
				textArea.setText(textArea.getText() + "\n\n");
			total[1]=botchCount;
			if(!botch){
				total[0] += mod;
				if(textArea!=null){
					text.append("Total Die: " + total[0] + "\n");
					textArea.setText(text.toString());
					textArea.setCaretPosition(0);
				}
				//System.out.println("Total Die: "+total[0]);
				return total;
			
			}else{
				if(textArea!=null){
					text.append("Total Die: " + total[0] + "\n"+ "BOTCHED" + "\n" + "Number of Botched Die: " + total[1]
							+ "\nRoll Botch Die\n");
					textArea.setText(text.toString());
					textArea.setCaretPosition(0);
				}
				return(total);
			}
		}catch(Exception e){
			if(textArea!=null){
				textArea.setText("There was an Error\nMaybe you used to big of Numbers");
				textArea.setCaretPosition(0);
			}
			return null;
		}
	}
		
	static int botchDie(int numberDie,JTextArea textArea ){
		
		StringBuilder text = new StringBuilder("");
		
		int total = 0;
		int totalZero=0;
		
		try{
			for(int i = 0; i<numberDie;i++){
				int random1 = (int)((Math.random()*10));
				if(textArea!=null)
					text.append((i + 1) + ") Die: " + random1 + "\n");
					
				total += random1;
				if(random1==0)
					totalZero++;
			}
			
			if(textArea!=null){
				text.append("\n\nTotal \"0\" Die: " + totalZero + "\n"+ "Total Die: " + total + "\n");
				
				textArea.setText(text.toString());
				textArea.setCaretPosition(0);
			}
			
			return totalZero;
		}catch(Exception e){
			if(textArea!=null){
				textArea.setText("There was an Error\nMaybe you used to big of Numbers");
				textArea.setCaretPosition(0);
			}
			return 0;
		}
	}
	
	static int nSided(int Sides, int numberDie, JTextArea textArea){
		
		StringBuilder text = new StringBuilder("");
		
		int total = 0;
		try{
			for(int i = 0; i<numberDie;i++){	
				int random = (int)((Math.random()*Sides));
				if(textArea!=null)
					text.append((i + 1) + ") Die: " + random + "\n");
				total += random;
			}
			if(textArea!=null){
				text.append("\nTotal Die: " + total + "\n");
				textArea.setText(text.toString());
				textArea.setCaretPosition(0);
			}
			return total;
		}catch(Exception e){
			if(textArea!=null){
				textArea.setText("There was an Error\nMaybe you used to big of Numbers");
				textArea.setCaretPosition(0);
			}
			return 0;
		}
	}
}
