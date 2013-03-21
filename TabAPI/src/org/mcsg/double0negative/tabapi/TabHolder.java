package org.mcsg.double0negative.tabapi;

import org.bukkit.plugin.Plugin;
/**
 * 
 * 
 * Holds tab information such as plugin and tab strings
 * 
 * 
 * @author Drew
 *
 */
class TabHolder{
	Plugin p;
	
	String[][]tabs;
	int[][]tabPings;
	
	int maxh = 0, maxv = 0;
	
	public TabHolder getCopy() {
		TabHolder newCopy = new TabHolder();
		newCopy.tabs = copyStringArray(tabs);
		newCopy.tabPings = copyIntArray(tabPings);
		return newCopy;
	}
	
	/* Util method, copy tab array to new array */
	private static String[][] copyStringArray(String[][] tab){
		int horzTabSize = TabAPI.getHorizSize();
		int vertTabSize = TabAPI.getVertSize();
		
		String[][] temp = new String[horzTabSize][vertTabSize];
		for(int b = 0; b < vertTabSize; b++){
			for(int a = 0; a < horzTabSize ; a++){
				temp[a][b] = tab[a][b];
			}
		}
		return temp;
	}
	
	private static int[][] copyIntArray(int[][] tab){
		int horzTabSize = TabAPI.getHorizSize();
		int vertTabSize = TabAPI.getVertSize();
		
		int[][] temp = new int[horzTabSize][vertTabSize];
		for(int b = 0; b < vertTabSize; b++){
			for(int a = 0; a < horzTabSize ; a++){
				temp[a][b] = tab[a][b];
			}
		}
		return temp;
	}
}
