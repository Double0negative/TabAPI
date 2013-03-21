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
	String[][]tab;
	int maxh = 0, maxv = 0;
	
	public TabHolder getCopy() {
		TabHolder newCopy = new TabHolder();
		newCopy.tab = copyArray(tab);
		return newCopy;
	}
	
	/* Util method, copy tab array to new array */
	private static String[][] copyArray(String[][] tab){
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
}
